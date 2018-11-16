package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.pojo.Skupricesolr;
import cn.axy.xc.xcitemshowprovider.service.Skupriceservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Skupricesolrcontroller {
    @Autowired
    private Skupriceservice skupriceservice;
    @RequestMapping("/skuprice")
    public String skuprice(Skupricesolr skupricesolr) throws Exception {
        return skupriceservice.skuprice(skupricesolr);
    }
}
