package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.pojo.Clothing;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;
import cn.axy.xc.xcitemshowprovider.service.Closervicesolr;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Closolrcontroller {
    @Autowired
    private Closervicesolr closervicesolr;
    @RequestMapping("/closolr")
    public String closolr(Skusolr skusolr, Model model) throws Exception {
        List<Clothing> clo = closervicesolr.clo(skusolr);
        model.addAttribute("productModels", clo);
        model.addAttribute("mId", skusolr.getSkuid());
        return JSON.toJSONString(clo);
    }
}
