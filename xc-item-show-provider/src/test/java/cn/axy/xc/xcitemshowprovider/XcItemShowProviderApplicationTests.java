package cn.axy.xc.xcitemshowprovider;

import cn.axy.xc.xcitemshowprovider.dao.impl.AppliancesSolrdao;
import cn.axy.xc.xcitemshowprovider.dao.impl.ClothingSolrimpl;
import cn.axy.xc.xcitemshowprovider.dao.impl.MessageSolrimpl;
import cn.axy.xc.xcitemshowprovider.pojo.*;
import cn.axy.xc.xcitemshowprovider.service.Closervicesolr;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XcItemShowProviderApplicationTests {

    @Autowired
    private MessageSolrimpl messageSolrimpl;
    @Autowired
    private AppliancesSolrdao as;
    @Autowired
    private ClothingSolrimpl clothingSolrimpl;


    @Test
    public void Test(){

//        Messagesolr messagesolr = new Messagesolr();
//
//        messagesolr.setQueryString("以纯");
//        try {
//            List<Messagesolrpojo> messagesolrpojos = messageSolrimpl.searchProduct(messagesolr);
//
//            System.out.println("===========================");
//            System.out.println(JSON.toJSONString(messagesolrpojos));
//            System.out.println("===========================");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        Skusolr ss = new Skusolr();
        ss.setSkuid("2");
        try {
            List<Clothing> clo = clothingSolrimpl.clo(ss);
            System.out.println(JSON.toJSONString(clo));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
