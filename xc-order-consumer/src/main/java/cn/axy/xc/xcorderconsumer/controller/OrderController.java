package cn.axy.xc.xcorderconsumer.controller;

import cn.axy.xc.xcorderconsumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "orderChangetoPaid",method = RequestMethod.POST)
    public String orderChangetoPaid(@RequestParam("orderid") String orderid){
        return orderService.orderChangetoPaid(orderid);
    }


}
