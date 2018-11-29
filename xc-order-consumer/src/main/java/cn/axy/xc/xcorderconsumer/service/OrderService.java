package cn.axy.xc.xcorderconsumer.service;

import cn.axy.xc.xcorderconsumer.pojo.OrderInfo;
import cn.axy.xc.xcorderconsumer.service.impl.OrderServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

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

    /**
     * 创建一个订单，首先存在redis中，
     * 若支付成功，redis中删除，存到mysql中
     * 若支付失败，或没有进行支付，留在redis中30分钟，
     * 若在未支付期间支付成功了，redis中删除，存到mysql中
     * @param orderInfo
     * @param request
     * @return
     */
    @RequestMapping(value = "create",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    public String createOrder(@RequestBody OrderInfo orderInfo, HttpServletRequest request);
}
