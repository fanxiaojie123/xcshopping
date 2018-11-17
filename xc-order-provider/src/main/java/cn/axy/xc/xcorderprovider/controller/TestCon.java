package cn.axy.xc.xcorderprovider.controller;

import cn.axy.xc.xcorderprovider.service.TestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCon {

    @Autowired
    private TestServer testServer;

    @RequestMapping("/aa")
    public String aa(){

        String ser = testServer.ser();
        return ser;

    }


}
