package cn.axy.xc.xcitemdetailconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("/aa")
    public String aa(){
        return "aa";
    }
}
