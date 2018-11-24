package cn.axy.xc.xcorderprovider.service.impl;

import cn.axy.xc.xcorderprovider.dao.XcOrderItemMapper;
import cn.axy.xc.xcorderprovider.dao.XcOrderOMapper;
import cn.axy.xc.xcorderprovider.dao.XcOrderShippingMapper;
import cn.axy.xc.xcorderprovider.dao.XcOrderUMapper;
import cn.axy.xc.xcorderprovider.pojo.*;
import cn.axy.xc.xcorderprovider.service.ShowInfoService;
import cn.axy.xc.xcorderprovider.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.LongFunction;

@Slf4j
@Service
public class ShowInfoServiceImpl implements ShowInfoService {
    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private XcOrderOMapper xcOrderOMapper;

    @Autowired
    private XcOrderUMapper xcOrderUMapper;

    @Autowired
    private XcOrderItemMapper xcOrderItemMapper;

    @Autowired
    private XcOrderShippingMapper xcOrderShippingMapper;

    @Override
    public String orderInfoUser(String orderId) {

        Map<String,Object> reMap = new HashMap<>();
        Map<String, Object> stringObjectMap = showInfoRedis(orderId);

        if (stringObjectMap == null){
            //在redis中没有找到
            stringObjectMap = showInfoMysqlUser(orderId);
            if (stringObjectMap == null || stringObjectMap.size() <= 0){
                //在数据库里面也没有找到
                reMap.put("code","400");
                reMap.put("info","没有找到订单信息");
                String s = JSON.toJSONString(reMap);
                log.info("订单信息：" + s);
                return s ;
            }

        }
        reMap.put("code","200");
        reMap.put("info","找到订单信息");
        reMap.put("result",stringObjectMap);
        String s = JSON.toJSONString(reMap);
        log.info("订单信息：" + s);
        return s ;

    }

    @Override
    public String orderInfoShop(String orderId) {

        Map<String,Object> reMap = new HashMap<>();
        Map<String, Object> stringObjectMap = showInfoRedis(orderId);

        if (stringObjectMap == null){
            //在redis中没有找到
            stringObjectMap = showInfoMysqlShop(orderId);
            if (stringObjectMap == null || stringObjectMap.size() <= 0){
                //在数据库里面也没有找到
                reMap.put("code","400");
                reMap.put("info","没有找到订单信息");
                String s = JSON.toJSONString(reMap);
                log.info("订单信息：" + s);
                return s ;
            }

        }
        reMap.put("code","200");
        reMap.put("info","找到订单信息");
        reMap.put("result",stringObjectMap);
        String s = JSON.toJSONString(reMap);
        log.info("订单信息：" + s);
        return s ;
    }

    @Override
    public Map<String, Object> showInfoRedis(String orderId) {
        //用来存储订单信息
        Map<String,Object> reMap = new HashMap<>();
        //搜索redis
        //从redis里面取数据
        OrderList orderlist = (OrderList) redisUtil.hget("ORDERINFO","ORDERLIST");
        OrderItemList orderItemList = (OrderItemList) redisUtil.hget("ORDERINFO","ORDERITEM");

        //如果为null
        if(orderlist == null || orderItemList == null){
            log.info("redis中没有订单信息...");
            return null;
        }else {
            //list
            List<XcOrderO> xcOrderOList = orderlist.getXcOrderOList();
            List<XcOrderItem> xcOrderItemList = orderItemList.getXcOrderItemList();

            if (xcOrderOList == null || xcOrderItemList == null ){
                log.info("redis中没有订单列表...");
                return null;
            }else{

                if (xcOrderOList.size() <= 0 || xcOrderItemList.size() <= 0){
                    log.info("redis中订单列表为空...");
                    return null;
                }

                for (XcOrderO xcOrderO : xcOrderOList){
                    if (xcOrderO.getOrderId().equals(orderId) ){
                        reMap.put("order",xcOrderO);
                        break;
                    }
                }
                for (XcOrderItem xcOrderItem:xcOrderItemList){
                    if(xcOrderItem.getOrderId().equals(orderId)){
                        reMap.put("orderItem",xcOrderItem);
                        break;
                    }
                }
            }
        }
        return reMap;
    }

    @Override
    public Map<String, Object> showInfoMysqlShop(String orderId) {
        Map<String,Object> reMap = new HashMap<>();
        XcOrderO xcOrderO = xcOrderOMapper.selectByPrimaryKey(orderId);
        if (xcOrderO != null){
            reMap.put("order",xcOrderO);
        }
        XcOrderItem xcOrderItem = xcOrderItemMapper.selectByPrimaryKey(orderId);
        if (xcOrderItem != null){
            reMap.put("orderItem",xcOrderItem);
        }
        XcOrderShipping xcOrderShipping = xcOrderShippingMapper.selectByPrimaryKey(orderId);
        if(xcOrderShipping != null){
            reMap.put("orderShipping",xcOrderShipping);
        }
        return reMap;
    }

    @Override
    public Map<String, Object> showInfoMysqlUser(String orderId) {
        Map<String,Object> reMap = new HashMap<>();
        XcOrderU xcOrderU = xcOrderUMapper.selectByPrimaryKey(orderId);
        if (xcOrderU != null){
            reMap.put("order",xcOrderU);
        }
        XcOrderItem xcOrderItem = xcOrderItemMapper.selectByPrimaryKey(orderId);
        if (xcOrderItem != null){
            reMap.put("orderItem",xcOrderItem);
        }
        XcOrderShipping xcOrderShipping = xcOrderShippingMapper.selectByPrimaryKey(orderId);
        if(xcOrderShipping != null){
            reMap.put("orderShipping",xcOrderShipping);
        }
        return reMap;
    }


}
