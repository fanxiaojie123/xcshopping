package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.SkusolrMapper;
import cn.axy.xc.xcitemshowprovider.pojo.Food;
import cn.axy.xc.xcitemshowprovider.service.Fooselservice;
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
public class Fooselserviceimpl implements Fooselservice {
    @Autowired
    private SkusolrMapper skusolrMapper;
    //solr
    private static final String solrUrl="http://localhost:8983/solr/foo";

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
    public String upsolrfoo() throws IOException, SolrServerException {
        List<Food> fooall = skusolrMapper.fooall();
        for (Food foo:fooall) {
            SolrInputDocument document = new SolrInputDocument();
            document.addField("id",foo.getId());
            document.addField("fColor",foo.getfColor());
            document.addField("fCount",foo.getfCount());
            document.addField("fPrice",foo.getfPrice());
            document.addField("fSize",foo.getfSize());
            document.addField("mId",foo.getmId());
            document.addField("mPrice",foo.getmPrice());
            document.addField("mCount",foo.getmCount());
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
