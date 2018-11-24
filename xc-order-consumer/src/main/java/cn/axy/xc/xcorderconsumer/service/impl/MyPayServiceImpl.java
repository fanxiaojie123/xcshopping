//package cn.axy.xc.xcorderconsumer.service.impl;
//
//import cn.axy.xc.xcorderconsumer.service.MyPayService;
//import cn.axy.xc.xcorderconsumer.service.OrderService;
//import cn.axy.xc.xcorderconsumer.service.PayService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Service
//public class MyPayServiceImpl implements MyPayService {
//    @Autowired
//    private PayService payService;
//
//    @Autowired
//    private OrderService orderService;
//
//    @Override
//    public String payResult(String WIDout_trade_no, String WIDtotal_amount, String WIDsubject, String WIDbody, HttpServletRequest request) {
//
//        String pay = payService.pay(WIDout_trade_no, WIDtotal_amount, WIDsubject, WIDbody, request);
//
//        //支付成功，调用修改订单状态接口
//        if(pay == "200"){
//            //修改状态为已付款
//            String s = orderService.orderChange(2);
//            if(s){
//
//
//
//            }
//
//        }else {
//
//
//
//
//        }
//
//        return null;
//    }
//}
