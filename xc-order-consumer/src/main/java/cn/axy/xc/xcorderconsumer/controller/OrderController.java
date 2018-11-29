package cn.axy.xc.xcorderconsumer.controller;

import cn.axy.xc.xcorderconsumer.pojo.*;
import cn.axy.xc.xcorderconsumer.service.OrderService;
import cn.axy.xc.xcorderconsumer.service.StoreService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.media.jfxmedia.logging.Logger;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
@Slf4j
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @Autowired
    private StoreService storeService;

    @RequestMapping(value = "orderChangetoPaid",method = RequestMethod.POST)
    public String orderChangetoPaid(@RequestParam("orderid") String orderid){
        return orderService.orderChangetoPaid(orderid);
    }



    /**
     * 生成订单减少库存
     * 若没有生成订单成功，则不减少库存
     * @param orderInfo
     * @param request
     * @return
     */
    @RequestMapping(value = "orderCreate",method = RequestMethod.POST)
    public String orderCreate(@RequestBody OrderInfo orderInfo, HttpServletRequest request){

        String order = orderService.createOrder(orderInfo, request);
        //解析json
        String code = JSONObject.parseObject(order).get("code").toString();
        //减少库存
        if (code.equals("200")){

            Map<String,Object> result = (Map<String, Object>) JSONObject.parseObject(order).get("result");
            OrderList orderlist = (OrderList) result.get("ORDERLIST");
            OrderItemList orderItemList = (OrderItemList) result.get("ORDERITEM");


            List<XcOrderItem> xcOrderItems = orderItemList.getXcOrderItemList();
            int size = xcOrderItems.size();

            //商品id
            int itemidInt = 0;
            String itemId = xcOrderItems.get(size - 1).getItemId();
            try{
                int i = Integer.parseInt(itemId);
            }catch (Exception e){
                log.error("商品id格式转化失败");
            }
            //商品sku
            Long skuid = xcOrderItems.get(size - 1).getSkuid();
            //商品订单id
            String orderId = xcOrderItems.get(size - 1).getOrderId();
            //商品数量
            Integer num = xcOrderItems.get(size - 1).getNum();
            //调用减少库存接口
            InvMQ invMQ = new InvMQ();
            invMQ.setMid(itemidInt);
            invMQ.setOrderId(orderId);
            invMQ.setPsc(num);
            invMQ.setSkuid(skuid);
            String string = JSON.toJSONString(invMQ);
            log.info("传入mq信息：" + string);
            storeService.invsend(string);
        }
        return order;

    }




}
