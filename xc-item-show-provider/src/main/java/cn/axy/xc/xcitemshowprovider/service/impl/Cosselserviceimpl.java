package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.SkusolrMapper;
import cn.axy.xc.xcitemshowprovider.pojo.Cosmetics;
import cn.axy.xc.xcitemshowprovider.service.Cosselservice;
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
public class Cosselserviceimpl implements Cosselservice {
    @Autowired
    private SkusolrMapper skusolrMapper;
    //solr
    private static final String solrUrl="http://localhost:8983/solr/cos";

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
    public String upsolrcos() throws IOException, SolrServerException {
        List<Cosmetics> cosall = skusolrMapper.cosall();
        for (Cosmetics cos:cosall) {
            SolrInputDocument document = new SolrInputDocument();
            document.addField("id",cos.getId());
            document.addField("coColor",cos.getCoColor());
            document.addField("coCount",cos.getCoCount());
            document.addField("coPrice",cos.getCoPrice());
            document.addField("coSize",cos.getCoSize());
            document.addField("mId",cos.getmId());
            document.addField("mPrice",cos.getmPrice());
            document.addField("mCount",cos.getmCount());
            document.addField("mPicture",cos.getmPicture());
            document.addField("mPoints",cos.getmPoints());
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
