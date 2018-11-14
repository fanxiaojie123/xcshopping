package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.service.Delmessageservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Delmessagecontroller {
    @Autowired
    private Delmessageservice dms;
    @RequestMapping("/delmessage")
    public String delmessage(Integer mid){
        String delmessage = dms.delmessage(mid);
        return delmessage;
    }
}
