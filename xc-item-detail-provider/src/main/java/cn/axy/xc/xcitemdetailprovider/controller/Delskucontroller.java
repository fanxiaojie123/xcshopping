package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.service.Delskuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Delskucontroller {
    @Autowired
    private Delskuservice dss;
    @RequestMapping("/delsku")
    public String delsku(Integer mid,Integer skuid){
        String delsku = dss.delsku(mid, skuid);
        return delsku;
    }
}
