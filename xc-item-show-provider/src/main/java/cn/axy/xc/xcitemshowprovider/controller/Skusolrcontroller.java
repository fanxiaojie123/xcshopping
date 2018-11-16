package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.pojo.Appliances;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;
import cn.axy.xc.xcitemshowprovider.service.Skusolrservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Skusolrcontroller {
    @Autowired
    private Skusolrservice skusolrservice;
    @RequestMapping("/skusolr")
    public String skusolr(Skusolr skusolr, Model model) throws Exception {
        List<Appliances> appliances = skusolrservice.searchProduct1(skusolr);
        model.addAttribute("productModels", appliances);
        model.addAttribute("skuid", skusolr.getSkuid());
        return null;
    }
}
