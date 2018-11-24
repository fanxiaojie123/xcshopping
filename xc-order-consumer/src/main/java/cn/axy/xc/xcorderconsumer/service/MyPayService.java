package cn.axy.xc.xcorderconsumer.service;


import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public interface MyPayService {

    String payResult(String WIDout_trade_no,
                     String WIDtotal_amount,
                     String WIDsubject,
                     String WIDbody,
                     HttpServletRequest request);


}
