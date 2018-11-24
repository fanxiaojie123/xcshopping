package cn.axy.xc.xcorderconsumer.service;

import cn.axy.xc.xcorderconsumer.service.impl.OrderServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "xc-order-provider",fallback = OrderServiceImpl.class)
public interface OrderService {


    /**
     * 修改订单状态
     * @param status 修改后的状态 1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭
     * @return
     */
    @RequestMapping(value = "change",method = RequestMethod.POST)
    public String orderChange(@RequestParam("status") int status);


    /**
     * 修改订单状态为已支付
     * @param orderid 订单id
     * @return
     */
    @RequestMapping(value = "orderChangetoPaid",method = RequestMethod.POST)
    public String orderChangetoPaid(@RequestParam("orderid") String orderid);


}
