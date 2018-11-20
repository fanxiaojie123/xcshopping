package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.SkusolrMapper;
import cn.axy.xc.xcitemshowprovider.pojo.*;
import cn.axy.xc.xcitemshowprovider.service.Skuselservice;
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
public class Skuselserviceimpl implements Skuselservice {
    @Autowired
    private SkusolrMapper skusolrMapper;
    //solr
    private static final String solrUrl="http://localhost:8983/solr/zl";

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
    public String upsolr1() throws IOException, SolrServerException {

        List<Appliances> appall = skusolrMapper.appall();
        for (Appliances app: appall) {
            SolrInputDocument document = new SolrInputDocument();
            document.addField("id",app.getId());
            document.addField("aColor",app.getaColor());
            document.addField("aCount",app.getaCount());
            document.addField("aPrice",app.getaPrice());
            document.addField("aSize",app.getaSize());
            document.addField("mId",app.getmId());
            document.addField("mPrice",app.getmPrice());
            document.addField("mCount",app.getmCount());
            document.addField("mPicture",app.getmPicture());
            document.addField("mPoints",app.getmPoints());
            client1.add(document);
        }
//        List<Clothing> cloall = skusolrMapper.cloall();
//        for (Clothing clo: cloall) {
//            document.addField("cColor",clo.getcColor());
//            document.addField("cCount",clo.getcCount());
//            document.addField("cPrice",clo.getcPrice());
//            document.addField("cSize",clo.getcSize());
//        }
//        List<Cosmetics> cosall = skusolrMapper.cosall();
//        for (Cosmetics cos:cosall) {
//            document.addField("coColor",cos.getCoColor());
//            document.addField("coCount",cos.getCoCount());
//            document.addField("coPrice",cos.getCoPrice());
//            document.addField("coSize",cos.getCoSize());
//        }
//        List<Food> fooall = skusolrMapper.fooall();
//        for (Food foo:fooall) {
//            document.addField("fColor",foo.getfColor());
//            document.addField("fCount",foo.getfCount());
//            document.addField("fPrice",foo.getfPrice());
//            document.addField("fSize",foo.getfSize());
//        }
//        List<Ornaments> ornall = skusolrMapper.ornall();
//        for (Ornaments orn:ornall) {
//            document.addField("oColor",orn.getoColor());
//            document.addField("oCount",orn.getoCount());
//            document.addField("oPrice",orn.getoPrice());
//            document.addField("oSize",orn.getoSize());
//        }
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
