package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.service.Selskuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Selskucontroller {
    @Autowired
    private Selskuservice sss;
    @RequestMapping("/selsku")
    public String selsku(Integer mid){

        return sss.selsku(mid);
    }
}
