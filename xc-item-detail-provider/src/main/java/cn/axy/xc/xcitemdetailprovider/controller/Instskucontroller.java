package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.pojo.*;
import cn.axy.xc.xcitemdetailprovider.service.Instskuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Instskucontroller {
    @Autowired
    private Instskuservice iss;
    @RequestMapping("/instsku")
    public String instsku(Integer mid, Appliances app, Clothing clo, Cosmetics cos, Food foo, Ornaments orn){
        String instsku = iss.instsku(mid, app, clo, cos, foo, orn);
        return instsku;
    }
}
