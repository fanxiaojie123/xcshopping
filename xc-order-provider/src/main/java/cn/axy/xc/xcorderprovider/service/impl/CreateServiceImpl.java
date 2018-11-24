package cn.axy.xc.xcorderprovider.service.impl;

import cn.axy.xc.xcorderprovider.pojo.*;
import cn.axy.xc.xcorderprovider.rabbit.Sender;
import cn.axy.xc.xcorderprovider.service.CreateService;
import cn.axy.xc.xcorderprovider.util.CommonInfo;
import cn.axy.xc.xcorderprovider.util.CommonUtil;
import cn.axy.xc.xcorderprovider.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class CreateServiceImpl implements CreateService {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private Sender sender;
    /**
     * 创建一个订单，首先存在redis中，
     * 若支付成功，redis中删除，存到mysql中
     * 若支付失败，或没有进行支付，留在redis中30分钟，
     * 若在未支付期间支付成功了，redis中删除，存到mysq l中
     * @param orderInfo
     * @return
     */
    @Override
    public String createOrder(OrderInfo orderInfo,String userId) {
    //登陆之后访问
        //将订单信息存到redis中
        //判断传过来的值是否为空
        Map<String,Object> reMap = new HashMap<>();
        try {
            //生成订单id
            String orderId = CommonUtil.getOrderIdByUUId(CommonInfo.MACHINE_ID);

            //创建订单信息
            XcOrderO xcOrderO = new XcOrderO();

            //设置订单id
            xcOrderO.setOrderId(orderId);

            //设置支付金额
            Double payment = orderInfo.getPayment();
            if(payment == null){
                reMap.put("code",500);
                reMap.put("info","支付金额为空");
                String string = JSON.toJSONString(reMap);
                log.info(string);
                return string;
            }
            xcOrderO.setPayment(payment + "");

            //设置支付类型
            Integer paymentType = orderInfo.getPaymentType();
            if(paymentType != 1 && paymentType != 2){
                //返回类型错误
                reMap.put("code",500);
                reMap.put("info","返回paymentType错误");
                String string = JSON.toJSONString(reMap);
                log.info(string);
                return string;
            }
            xcOrderO.setPaymentType(paymentType);


            //设置邮费
            Double postFee = orderInfo.getPostFee();
            if(paymentType == 1){
                //在线支付
                if (postFee == null){
                    reMap.put("code",500);
                    reMap.put("info","在线支付金额不能为null");
                    String string = JSON.toJSONString(reMap);
                    log.info(string);
                    return string;
                }
            }else {
                //货到付款
                postFee = 0.0;
            }
            xcOrderO.setPostFee(postFee + "");

            //设置支付状态(未付款)
            xcOrderO.setStatus(1);

            //设置订单创建时间
            xcOrderO.setCreateTime(new Date(System.currentTimeMillis()));

            //设置订单更新时间
            xcOrderO.setCreateTime(new Date(System.currentTimeMillis()));

            //设置用户id
            if (userId == null || userId.equals("")){
                reMap.put("code",500);
                reMap.put("info","用户Id不能为null");
                String string = JSON.toJSONString(reMap);
                log.info(string);
                return string;
            }
            xcOrderO.setUserId(userId);

            //设置买家留言
            xcOrderO.setBuyerMessage(orderInfo.getBuyerMessage());

            //设置买家昵称
            //xcOrderO.setBuyerNick(nickname);

            //设置买家是否已经评价
            xcOrderO.setBuyerRate(0);

            //获取传过来的订单商品对象
            XcOrderItem orderItem = orderInfo.getOrderItem();
            if (orderItem == null){
                reMap.put("code",500);
                reMap.put("info","订单商品信息不能为空");
                String string = JSON.toJSONString(reMap);
                log.info(string);
                return string;
            }

            //设置订单id
            orderItem.setOrderId(orderId);

            //设置订单生成时间
            orderItem.setCreated(new Date(System.currentTimeMillis()));

            //判断商品id不能为空
            if(orderItem.getItemId() == null || "".equals(orderItem.getItemId())){
                reMap.put("code",500);
                reMap.put("info","订单商品id不能为空");
                String string = JSON.toJSONString(reMap);
                log.info(string);
                return string;
            }


            //判断商品购买商品数量不能为空 大于0
            if(orderItem.getNum() == null || orderItem.getNum() <= 0){
                reMap.put("code",500);
                reMap.put("info","购买商品数量不能为空,数量必须大于0");
                String string = JSON.toJSONString(reMap);
                log.info(string);
                return string;
            }

            //填充商品信息
            //调用根据商品id（sku）获取商品信息的方法
            //？？？

            //判断商品标题
            if(orderItem.getTitle() == null ){
                reMap.put("code",500);
                reMap.put("info","购买商品标题不能为空");
                String string = JSON.toJSONString(reMap);
                log.info(string);
                return string;
            }



            //判断商品价格（商品价格是）
            if(orderItem.getPrice() == null  || orderItem.getPrice() <= 0){
                reMap.put("code",500);
                reMap.put("info","购买商品价格不能为空，价格必须大于0");
                String string = JSON.toJSONString(reMap);
                log.info(string);
                return string;
            }

            //设置商品总价格
            orderItem.setTotalFee(orderItem.getPrice() * orderItem.getNum());

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
                xcOrderOList = new ArrayList<XcOrderO>();
                xcOrderItemList = new ArrayList<XcOrderItem>();
            }

            //增加数据
            xcOrderOList.add(xcOrderO);
            xcOrderItemList.add(orderItem);

            //放入对象
            orderlist.setXcOrderOList(xcOrderOList);
            orderItemList.setXcOrderItemList(xcOrderItemList);

            // 将订单信息存入redis
            redisUtil.hset("ORDERINFO","ORDERLIST",orderlist);
            redisUtil.hset("ORDERINFO","ORDERITEM",orderItemList);

            //向rabbitMQ发送消息(订单id)，表示，创建订单成功
            sender.send(orderId);

            Map<String,Object> re = new HashMap<>();
            re.put("ORDERLIST",orderlist);
            re.put("ORDERITEM",orderItemList);

            reMap.put("code",200);
            reMap.put("info","添加商品到redis成功");
            reMap.put("result" , re);
            String string = JSON.toJSONString(reMap);
            log.info(string);
            return string;

        } catch (Exception e) {
            e.printStackTrace();
            reMap.put("code",500);
            reMap.put("info","报错了...进入了catch块...");
            String string = JSON.toJSONString(reMap);
            log.info(string);
            return string;
        }
    }
}
