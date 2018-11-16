package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.MessageSolrMapper;
import cn.axy.xc.xcitemshowprovider.pojo.*;
import cn.axy.xc.xcitemshowprovider.service.*;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Judgeskuserviceimpl implements Judgeskuservice {
    @Autowired
    private MessageSolrMapper messageSolrMapper;
    @Autowired
    private Closervicesolr closervicesolr;
    @Autowired
    private Skusolrservice skusolrservice;
    @Autowired
    private Cossolrservice cossolrservice;
    @Autowired
    private Foosolrservice foosolrservice;
    @Autowired
    private Ornsolrservice ornsolrservice;
    Skusolr ss = new Skusolr();
    @Override
    public String scid(Integer mid) throws Exception {
        String count = "";
        if (mid != null){
            String value = String.valueOf(mid);
            ss.setSkuid(value);
            Integer scid = messageSolrMapper.scid(mid);
            if (scid != null){
                if (scid == 1){
                    List<Clothing> clo = closervicesolr.clo(ss);
                    count = JSON.toJSONString(clo);
                }else if (scid == 2){
                    List<Appliances> appliances = skusolrservice.searchProduct1(ss);
                    count = JSON.toJSONString(appliances);
                }else if (scid == 3){
                    List<Food> foo = foosolrservice.foo(ss);
                    count = JSON.toJSONString(foo);
                }else if (scid == 4){
                    List<Ornaments> orn = ornsolrservice.orn(ss);
                    count = JSON.toJSONString(orn);
                }else if (scid == 5){
                    List<Cosmetics> cos = cossolrservice.cos(ss);
                    count = JSON.toJSONString(cos);
                }else{
                    count = "500";
                }
            }else {
                count = "500";
            }
        }else {
            count = "500";
        }
        return count;
    }
}
