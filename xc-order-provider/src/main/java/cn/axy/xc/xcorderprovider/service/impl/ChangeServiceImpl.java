package cn.axy.xc.xcorderprovider.service.impl;

import cn.axy.xc.xcorderprovider.dao.XcOrderOMapper;
import cn.axy.xc.xcorderprovider.dao.XcOrderUMapper;
import cn.axy.xc.xcorderprovider.pojo.*;
import cn.axy.xc.xcorderprovider.service.ChangeService;
import cn.axy.xc.xcorderprovider.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class ChangeServiceImpl implements ChangeService {

    @Autowired
    private XcOrderUMapper xcOrderUMapper;

    @Autowired
    private XcOrderOMapper xcOrderOMapper;


    @Autowired
    private RedisUtil redisUtil;

    /**
     * 修改订单状态为已支付
     * 未支付的订单在redis中，在redis中修改状态，不删除（删除交给消息队列处理）
     * @param orderId 订单id
     * @return
     */
    @Override
    public String ChangeToPaid(String orderId) {

        Map<String,Object> reMap = new HashMap<>();

        if (orderId == null || orderId.equals("")){
            reMap.put("code","400");
            reMap.put("info","订单id错误...");
            log.info("订单id错误...");
            String string = JSON.toJSONString(reMap);
            return string;
        }
        //从redis里面取数据
        OrderList orderlist = (OrderList) redisUtil.hget("ORDERINFO","ORDERLIST");

        //orderlist orderItemList 不能为null
        if(orderlist == null ){
            orderlist = new OrderList();
        }
        //list
        List<XcOrderO> xcOrderOList = orderlist.getXcOrderOList();

        if (xcOrderOList == null){
            xcOrderOList = new ArrayList<>();
        }
        //是否在reids中找到了这个订单
        boolean flag1 = false;

        for (int i = 0 ;i < xcOrderOList.size();i++){

            XcOrderO order = xcOrderOList.get(i);
            String orderIdRedis = order.getOrderId();
            if (orderIdRedis.equals(orderId)){
                //如果支付状态为未付款
                if (order.getStatus() == 1){
                    //修改订单状态，将订单信息存入数据库，订单信息redis中删除
                    log.info("修改支付状态为已付款,订单id" + orderId);
                    //已付款
                    order.setStatus(2);
                    order.setUpdateTime(new Date(System.currentTimeMillis()));
                    reMap.put("code","200");
                    reMap.put("info","修改支付状态为已付款...");
                }else if(order.getStatus() == 2){
                    //时间到了已付款
                    log.info("该订单已付款,订单id" + orderId);
                    reMap.put("code","201");
                    reMap.put("info","该订单已付款...");

                }else {
                    log.info("订单状态异常...,订单id" + orderId);
                    reMap.put("code","500");
                    reMap.put("info","订单状态异常...");
                }
                //设置redis中的数据
                xcOrderOList.set(i,order);
                flag1 = true;
                break;
            }
        }

        //在订单和订单商品中有个一没有找到这个订单
        if(!flag1){
            log.info("在redis中没有找到订单id");
            reMap.put("code","401");
            reMap.put("info","在redis中没有找到订单id...");
            String string = JSON.toJSONString(reMap);
            return string;
        }

        //存储修改后的数据到redis中
        orderlist.setXcOrderOList(xcOrderOList);
        redisUtil.hset("ORDERINFO","ORDERLIST",orderlist);

        String string = JSON.toJSONString(reMap);
        return string;

    }

    @Override
    public String orderChangetoDeliver(String orderid) {
        String s = orderChange(orderid, 4);
        return s;
    }

    @Override
    public String orderChangetoDeals(String orderid) {
        String s = orderChange(orderid, 5);
        return s;
    }

    @Override
    public String orderChangetoClose(String orderid) {
        String s = orderChange(orderid, 6);

        String str = JSONObject.parseObject(s).get("code").toString();
        if(str.equals("400")){
            //可能在redis
 
            Map<String,Object> reMap = new HashMap<>();

            if (orderid == null || orderid.equals("")){
                reMap.put("code","400");
                reMap.put("info","订单id错误...");
                log.info("订单id错误...");
                String string = JSON.toJSONString(reMap);
                return string;
            }
            //从redis里面取数据
            OrderList orderlist = (OrderList) redisUtil.hget("ORDERINFO","ORDERLIST");

            //orderlist orderItemList 不能为null
            if(orderlist == null ){
                orderlist = new OrderList();
            }
            //list
            List<XcOrderO> xcOrderOList = orderlist.getXcOrderOList();

            if (xcOrderOList == null){
                xcOrderOList = new ArrayList<>();
            }
            //是否在reids中找到了这个订单
            boolean flag1 = false;

            for (int i = 0 ;i < xcOrderOList.size();i++){

                XcOrderO order = xcOrderOList.get(i);
                String orderIdRedis = order.getOrderId();
                if (orderIdRedis.equals(orderid)){
                    //如果支付状态为未付款
                    if (order.getStatus() == 1){
                        //修改订单状态，将订单信息存入数据库，订单信息redis中删除
                        log.info("修改支付状态为已付款,订单id" + orderid);
                        //交易关闭
                        order.setStatus(6);
                        order.setUpdateTime(new Date(System.currentTimeMillis()));
                        reMap.put("code","200");
                        reMap.put("info","修改支付状态为已付款...");
                    }else if(order.getStatus() == 2){
                        //时间到了已付款
                        log.info("该订单已付款,订单id" + orderid);
                        reMap.put("code","201");
                        reMap.put("info","该订单已付款...");

                    }else {
                        log.info("订单状态异常...,订单id" + orderid);
                        reMap.put("code","500");
                        reMap.put("info","订单状态异常...");
                    }
                    //设置redis中的数据
                    xcOrderOList.set(i,order);
                    flag1 = true;
                    break;
                }
            }

            //在订单和订单商品中有个一没有找到这个订单
            if(!flag1){
                log.info("在redis中没有找到订单id");
                reMap.put("code","401");
                reMap.put("info","在redis中没有找到订单id...");
                String string = JSON.toJSONString(reMap);
                return string;
            }

            //存储修改后的数据到redis中
            orderlist.setXcOrderOList(xcOrderOList);
            redisUtil.hset("ORDERINFO","ORDERLIST",orderlist);

            String string = JSON.toJSONString(reMap);
            return string;


        }else {
            return s;
        }


    }

    @Override
    public String orderChange(String orderid, int status) {
        Map<String,Object> reMap = new HashMap<>();
        XcOrderO xcOrderO = xcOrderOMapper.selectByPrimaryKey(orderid);
        XcOrderU xcOrderU = xcOrderUMapper.selectByPrimaryKey(orderid);
        if (xcOrderO == null || xcOrderU == null){
            reMap.put("code","400");
            reMap.put("info","没有找到该订单...");
            String string = JSON.toJSONString(reMap);
            return string;
        }

        Integer statusSQL = xcOrderO.getStatus();

        if (statusSQL >= status  ){
            reMap.put("code","500");
            reMap.put("info","订单状态为" + statusSQL + "，不能修改为" + status);
            String string = JSON.toJSONString(reMap);
            return string;
        }

        if(status > 6){
            reMap.put("code","501");
            reMap.put("info","订单状态码错误...");
            String string = JSON.toJSONString(reMap);
            return string;
        }


        if(status == 4 ){
            if (statusSQL != 2){
                reMap.put("code","502");
                reMap.put("info","订单状态码状态变化错误，订单状态为" + statusSQL + "，不能修改为" + status);
                String string = JSON.toJSONString(reMap);
                return string;
            }
            reMap.put("info","修改支付状态为已发货...");
        }else if(status == 5){
            if (statusSQL != 4){
                reMap.put("code","502");
                reMap.put("info","订单状态码状态变化错误，订单状态为" + statusSQL + "，不能修改为" + status);
                String string = JSON.toJSONString(reMap);
                return string;
            }
            reMap.put("info","修改支付状态为交易成功...");
        }else if (status == 6){
            if ((statusSQL != 2 )&&( statusSQL != 1) ){//??
                reMap.put("code","502");
                reMap.put("info","订单状态码状态变化错误，订单状态为" + statusSQL + "，不能修改为" + status);
                String string = JSON.toJSONString(reMap);
                return string;
            }
            reMap.put("info","修改支付状态为关闭...");
        }else {
            reMap.put("code","503");
            reMap.put("info","订单状态码错误");
            String string = JSON.toJSONString(reMap);
            return string;
        }

        xcOrderO.setStatus(status);
        xcOrderO.setUpdateTime(new Date(System.currentTimeMillis()));
        //mycat 的分库字段不能修改
        xcOrderO.setCreateTime(null);
        xcOrderO.setUserId(null);
        xcOrderOMapper.updateByPrimaryKeySelective(xcOrderO);

        xcOrderU.setStatus(status);
        xcOrderU.setUpdateTime(new Date(System.currentTimeMillis()));
        //mycat 的分库字段不能修改
        xcOrderU.setCreateTime(null);
        xcOrderU.setUserId(null);
        xcOrderUMapper.updateByPrimaryKeySelective(xcOrderU);

        reMap.put("code","200");
        String string = JSON.toJSONString(reMap);
        return string;
    }


}
