package cn.axy.xc.xcorderprovider.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public interface ChangeService {


    /**
     * 修改订单状态为已支付
     * @param orderId 订单id
     * @return
     */
    String ChangeToPaid(String orderId);

    /**
     * 修改订单状态为已发货
     * @param orderid 订单id
     * @return
     */
    String orderChangetoDeliver( String orderid);

    /**
     * 修改订单状态为交易成功
     * @param orderid 订单id
     * @return
     */
        String orderChangetoDeals( String orderid);

    /**
     * 修改订单状态为关闭订单
     * @param orderid 订单id
     * @return
     */
    String orderChangetoClose( String orderid);

    /**
     * 修改订单状态
     * @param orderid
     * @param status
     * @return
     */
    String orderChange(String orderid , int status);
}
