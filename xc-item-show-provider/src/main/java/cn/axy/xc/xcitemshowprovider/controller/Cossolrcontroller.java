package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.pojo.Clothing;
import cn.axy.xc.xcitemshowprovider.pojo.Cosmetics;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;
import cn.axy.xc.xcitemshowprovider.service.Closervicesolr;
import cn.axy.xc.xcitemshowprovider.service.Cossolrservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Cossolrcontroller {
    @Autowired
    private Cossolrservice cossolrservice;
    @RequestMapping("/cossolr")
    public String cossolr(Skusolr skusolr, Model model) throws Exception {
        List<Cosmetics> cos = cossolrservice.cos(skusolr);
        model.addAttribute("productModels", cos);
        model.addAttribute("mId", skusolr.getSkuid());
        return null;
    }
}
