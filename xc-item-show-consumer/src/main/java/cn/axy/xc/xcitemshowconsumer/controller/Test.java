package cn.axy.xc.xcitemshowconsumer.controller;

import cn.axy.xc.xcitemshowconsumer.service.FeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    private FeignTest feignTest;

    @RequestMapping(value = "/test1",method = RequestMethod.POST)
    public String test(){
        return "返回" + feignTest.test();
    }
}
