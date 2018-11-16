package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.pojo.Cosmetics;
import cn.axy.xc.xcitemshowprovider.pojo.Food;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;
import cn.axy.xc.xcitemshowprovider.service.Cossolrservice;
import cn.axy.xc.xcitemshowprovider.service.Foosolrservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class Foosolrcontroller {
    @Autowired
    private Foosolrservice foosolrservice;
    @RequestMapping("/foosolr")
    public String foosolr(Skusolr skusolr, Model model) throws Exception {
        List<Food> foo = foosolrservice.foo(skusolr);
        model.addAttribute("productModels", foo);
        model.addAttribute("mId", skusolr.getSkuid());
        return null;
    }
}
