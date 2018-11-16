package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.SkusolrMapper;
import cn.axy.xc.xcitemshowprovider.pojo.Clothing;
import cn.axy.xc.xcitemshowprovider.service.Closelservice;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Component//将这个类组件化交给spring
@Service
public class Closelserviceimpl implements Closelservice {
    @Autowired
    private SkusolrMapper skusolrMapper;
    //solr
    private static final String solrUrl="http://localhost:8983/solr/clo";

    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client1=new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();
    //日志
    private Logger logger = LoggerFactory.getLogger(Skuselserviceimpl.class);
    private int a = 0;
    private int b = 0;
    @Override
    @Scheduled(fixedRate = 50000)//5秒  initialDelay 程序启动后延迟
    public String upsolrclo() throws IOException, SolrServerException {
        List<Clothing> cloall = skusolrMapper.cloall();
        for (Clothing clo: cloall) {
            SolrInputDocument document = new SolrInputDocument();
            document.addField("id",clo.getId());
            document.addField("cColor",clo.getcColor());
            document.addField("cSize",clo.getcSize());
            document.addField("cCount",clo.getcCount());
            document.addField("cPrice",clo.getcPrice());
            document.addField("mId",clo.getmId());
            document.addField("mPrice",clo.getmPrice());
            document.addField("mCount",clo.getmCount());
            client1.add(document);
        }
        client1.commit();
        logger.info("===fixedDelay: 第{}次执行方法", a++);
        return "导入成功!";
    }
    @Scheduled(fixedRate = 10000)
    public String aa(){
        logger.info("===fixedDelay: 第{}次执行方法", b++);
        return "0";
    }
}
