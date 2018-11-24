package cn.axy.xc.xcorderprovider.rabbit;

import cn.axy.xc.xcorderprovider.config.RabbitConfig;
import cn.axy.xc.xcorderprovider.dao.XcOrderItemMapper;
import cn.axy.xc.xcorderprovider.dao.XcOrderOMapper;
import cn.axy.xc.xcorderprovider.dao.XcOrderUMapper;
import cn.axy.xc.xcorderprovider.pojo.*;
import cn.axy.xc.xcorderprovider.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Slf4j
@Component
public class Listener {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private XcOrderOMapper xcOrderOMapper;

    @Autowired
    private XcOrderUMapper xcOrderUMapper;

    @Autowired
    private XcOrderItemMapper xcOrderItemMapper;

    @RabbitListener(queues = RabbitConfig.ORDER_QUEUE)
    public void Listeners(String orderid){
        if (orderid == null || orderid.equals("")){
            log.info("订单id错误...");
        }
        System.out.println("order:" + orderid);
        //从redis里面取数据
        OrderList orderlist = (OrderList) redisUtil.hget("ORDERINFO","ORDERLIST");
        OrderItemList orderItemList = (OrderItemList) redisUtil.hget("ORDERINFO","ORDERITEM");

        //orderlist orderItemList 不能为null
        if(orderlist == null || orderItemList == null){
            orderlist = new OrderList();
            orderItemList = new OrderItemList();
        }

        //list
        List<XcOrderO> xcOrderOList = orderlist.getXcOrderOList();
        List<XcOrderItem> xcOrderItemList = orderItemList.getXcOrderItemList();

        if (xcOrderOList == null || xcOrderItemList == null){
            xcOrderOList = new ArrayList<>();
            xcOrderItemList = new ArrayList<>();
        }

        //是否在reids中找到了这个订单
        boolean flag1 = false;
        boolean flag2 = false;

        for (XcOrderO order :xcOrderOList){
            String orderIdRedis = order.getOrderId();
            if (orderIdRedis.equals(orderid)){
                //时间到了未付款
               if (order.getStatus() == 1){
                   //修改订单状态，将订单信息存入数据库，订单信息redis中删除
                   log.info("时间到了未付款,订单id" + orderid);
                   //交易关闭
                   order.setStatus(6);
                   order.setUpdateTime(new Date(System.currentTimeMillis()));
               }else if(order.getStatus() == 2){
                //时间到了已付款
                   log.info("时间到了已付款,订单id" + orderid);
               }else {
                    log.info("订单状态异常...,订单id" + orderid);
               }
                //存储order数据与数据库中。ordero中
                xcOrderOMapper.insertSelective(order);
                //存储order数据与数据库中。orderu中
                String string = JSON.toJSONString(order);
                XcOrderU xcOrderU = JSONObject.parseObject(string, XcOrderU.class);
                xcOrderUMapper.insertSelective(xcOrderU);
                //删除redis中的数据
                boolean remove = xcOrderOList.remove(order);
                if (remove){
                    log.info("删除redis中的order");
                }else {
                    log.info("删除redis中的order失败");
                }

                flag1 = true;
               break;
            }
        }

        for (XcOrderItem orderItem:xcOrderItemList){
            if(orderItem.getOrderId().equals(orderid)){
                //存储orderitem数据与数据库中。
                xcOrderItemMapper.insertSelective(orderItem);
                //删除redis中的数据
                boolean remove = xcOrderItemList.remove(orderItem);
                if (remove){
                    log.info("删除redis中的orderItem");
                }else {
                    log.info("删除redis中的orderItem失败");
                }
                flag2 = true;
                break;
            }
        }

        //在订单和订单商品中有个一没有找到这个订单
        if(!flag1 || !flag2){
            log.info("在redis中没有找到订单id");
        }
        //存储修改后的数据到redis中
        orderlist.setXcOrderOList(xcOrderOList);
        orderItemList.setXcOrderItemList(xcOrderItemList);
        redisUtil.hset("ORDERINFO","ORDERLIST",orderlist);
        redisUtil.hset("ORDERINFO","ORDERITEM",orderItemList);

    }

}
