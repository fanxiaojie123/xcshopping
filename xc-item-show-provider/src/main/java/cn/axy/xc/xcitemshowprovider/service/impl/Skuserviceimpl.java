package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.impl.*;
import cn.axy.xc.xcitemshowprovider.pojo.*;
import cn.axy.xc.xcitemshowprovider.service.SkuidAll;
import cn.axy.xc.xcitemshowprovider.service.exit.Skuservicepojo;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Skuserviceimpl implements SkuidAll {
    @Autowired
    private AppliancesSolrdao appliancesSolrdao;
    @Autowired
    private ClothingSolrimpl clothingSolrimpl;
    @Autowired
    private Cossolrimpl cossolrimpl;
    @Autowired
    private FooSolrimpl fooSolrimpl;
    @Autowired
    private OrnSolrimpl ornSolrimpl;
    String count = "";
    @Override
    public String Skuservice(Long skuid) throws Exception {

        Long num = 100000000000000L;
        System.out.println(skuid);
        if (skuid != null && skuid != 0) {
            long l = skuid / num;
            System.out.println(l);
            if(l == 1){
                System.out.println(skuid);
                List<Skuservicepojo> closku = clothingSolrimpl.closku(String.valueOf(skuid));
                System.out.println(closku);
                count = JSON.toJSONString(closku);
            }else if (l == 2){
                System.out.println(skuid);
                List<Skuservicepojo> appliances = appliancesSolrdao.searchProductsku(String.valueOf(skuid));
                count = JSON.toJSONString(appliances);
            }else if (l == 3){
                List<Skuservicepojo> foosku = fooSolrimpl.foosku(String.valueOf(skuid));
                count = JSON.toJSONString(foosku);
            }else if (l == 4){
                List<Skuservicepojo> ornsku = ornSolrimpl.ornsku(String.valueOf(skuid));
                count = JSON.toJSONString(ornsku);
            }else if (l == 5){
                List<Skuservicepojo> cossku = cossolrimpl.cossku(String.valueOf(skuid));
                count = JSON.toJSONString(cossku);
            }else {
                count = "500";
            }

        }else {
            count = "500";
        }
        return count;
    }
}
