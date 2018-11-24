package cn.axy.xc.xcorderconsumer.service.impl;

import cn.axy.xc.xcorderconsumer.service.PayService;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class PayServiceImpl implements PayService {
    @Override
    public String pay(String WIDout_trade_no, String WIDtotal_amount, String WIDsubject, String WIDbody, HttpServletRequest request) {
        return "咦,客户端走失了....";
    }
}
