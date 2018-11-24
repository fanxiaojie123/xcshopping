package cn.axy.xc.xcorderconsumer.service;

import cn.axy.xc.xcorderconsumer.service.impl.PayServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@FeignClient(name = "xc-payment-provider",fallback = PayServiceImpl.class)
public interface PayService {

    @RequestMapping(value = "pay",method = RequestMethod.POST,produces = "text/html; charset=utf-8")
    public String pay(@RequestParam("WIDout_trade_no") String WIDout_trade_no,
                      @RequestParam("WIDsubject")String WIDtotal_amount,
                      @RequestParam("WIDsubject") String WIDsubject,
                      @RequestParam("WIDbody")String WIDbody,
                      @RequestParam(value = "request") HttpServletRequest request);
}
