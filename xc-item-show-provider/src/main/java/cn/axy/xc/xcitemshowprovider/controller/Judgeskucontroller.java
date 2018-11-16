package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.Judgeskuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Judgeskucontroller {
    @Autowired
    private Judgeskuservice judgeskuservice;
    @RequestMapping("/scid")
    public String scid(Integer mid) throws Exception {
        String scid = judgeskuservice.scid(mid);
        return scid;
    }
}
