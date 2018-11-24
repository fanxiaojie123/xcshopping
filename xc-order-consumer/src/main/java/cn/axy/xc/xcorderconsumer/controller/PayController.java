package cn.axy.xc.xcorderconsumer.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {



    //立即支付接口
    @RequestMapping(value = "pay",method = RequestMethod.POST)
    public String pay(){


        return null;

    }

}
