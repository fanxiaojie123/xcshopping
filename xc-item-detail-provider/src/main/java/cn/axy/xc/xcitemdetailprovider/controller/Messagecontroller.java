package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.service.Messageservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Messagecontroller {
    @Autowired
    private Messageservice ms;
    @RequestMapping("/getall")
    public String Messagegetall(Integer sid){
        String sellgetall = ms.sellgetall(sid);
        return sellgetall;
    }
    @RequestMapping("/a")
    public String aaa(){
        return "132";
    }
}
