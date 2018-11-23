package cn.axy.xc.xcitemshowconsumer.controller;

import cn.axy.xc.xcitemshowconsumer.service.Messagegetallservice;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Api(value="/messagegetall", tags="展示商品")
@RestController
public class Messagegetallcontroller {
    @Autowired
    private Messagegetallservice messagegetallservice;

    /**
     * 展示商品
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/messagegetall",method = RequestMethod.POST)
    public String messagegetall() throws Exception {
        return messagegetallservice.Messagegetall();
    }
}
