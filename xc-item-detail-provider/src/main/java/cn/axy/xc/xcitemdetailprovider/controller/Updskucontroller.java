package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.pojo.*;
import cn.axy.xc.xcitemdetailprovider.service.Updskuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Updskucontroller {
    @Autowired
    private Updskuservice uss;
    @RequestMapping("/updsku")
    public String updsku(Integer mid, Integer skuid, Appliances app, Clothing clo, Cosmetics cos, Food foo, Ornaments orn){
        String updsku = uss.updsku(mid, skuid, app, clo, cos, foo, orn);
        return updsku;
    }
}
