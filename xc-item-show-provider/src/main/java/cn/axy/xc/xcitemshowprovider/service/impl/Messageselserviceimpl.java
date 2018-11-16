package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.MessageSolrMapper;
import cn.axy.xc.xcitemshowprovider.pojo.Messagesolrpojo;
import cn.axy.xc.xcitemshowprovider.service.Messageselservice;
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
public class Messageselserviceimpl implements Messageselservice {

    @Autowired
    private MessageSolrMapper messageSolrMapper;
    //solr
    private static final String solrUrl="http://localhost:8983/solr/zhangli";

    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client=new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();
    //日志
    private Logger logger = LoggerFactory.getLogger(Messageselserviceimpl.class);
    private int a = 0;
    private int b = 0;
    @Override
    @Scheduled(fixedRate = 50000)//5秒 initialDelay initialDelay 程序启动后延迟
    public String upsolr() throws IOException, SolrServerException {
        List<Messagesolrpojo> messagesolrpojos = messageSolrMapper.messageall();
        for (Messagesolrpojo uo:messagesolrpojos) {
            SolrInputDocument document1 = new SolrInputDocument();
            document1.addField("id",uo.getId());
            document1.addField("mName",uo.getmName());
            document1.addField("mPicture",uo.getmPicture());
            document1.addField("mParticulars",uo.getmParticulars());
            document1.addField("mPoints",uo.getmPoints());
            document1.addField("mPrice",uo.getmPrice());
            document1.addField("mCount",uo.getmCount());
            document1.addField("searchCategoryName",uo.getSearchCategoryName());
            document1.addField("sName",uo.getsName());
            document1.addField("sAddress",uo.getsAddress());
            document1.addField("sPhone",uo.getsPhone());
            document1.addField("sDescribe",uo.getsDescribe());
            document1.addField("sPicture",uo.getsPicture());
            client.add(document1);
        }
        client.commit();
        logger.info("===fixedDelay: 第{}次执行方法", a++);
        return "导入成功!";
    }
    @Scheduled(fixedRate = 10000)
    public String aa(){
        logger.info("===fixedDelay: 第{}次执行方法", b++);
        return "0";
    }
}
