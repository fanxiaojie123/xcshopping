package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.pojo.Messagesolr;
import cn.axy.xc.xcitemshowprovider.pojo.Messagesolrpojo;
import cn.axy.xc.xcitemshowprovider.service.Messagesolrservice;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class Messagesolrcontroller {
    @Autowired
    private Messagesolrservice messagesolrservice;
    @RequestMapping(value="/list")
    public String searchProduct(Messagesolr messagesolr , Model model) throws Exception{
        //获取到检索的所有结果
        List<Messagesolrpojo> searchProducts = messagesolrservice.searchProduct(messagesolr);
        //设置回显内容
        model.addAttribute("productModels", searchProducts);
        model.addAttribute("queryString", messagesolr.getQueryString());
        model.addAttribute("catalog_name", messagesolr.getCatalog_name());
        model.addAttribute("sort", messagesolr.getSort());
        model.addAttribute("seller", messagesolr.getSeller());
        model.addAttribute("points", messagesolr.getPoints());
        model.addAttribute("type", messagesolr.getType());
        return "product_list";
    }
}
