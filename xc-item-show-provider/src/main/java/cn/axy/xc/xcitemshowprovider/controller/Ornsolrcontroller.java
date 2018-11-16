package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.pojo.Ornaments;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;
import cn.axy.xc.xcitemshowprovider.service.Ornsolrservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Ornsolrcontroller {
    @Autowired
    private Ornsolrservice ornsolrservice;
    @RequestMapping("/ornsolr")
    public String ornsolr(Skusolr skusolr, Model model) throws Exception {
        List<Ornaments> orn = ornsolrservice.orn(skusolr);
        model.addAttribute("productModels", orn);
        model.addAttribute("skuid", skusolr.getSkuid());
        return null;
    }
}
