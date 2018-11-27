package cn.axy.xc.xcitemdetailconsumer.service.impl;

import cn.axy.xc.xcitemdetailconsumer.pojo.Message;
import cn.axy.xc.xcitemdetailconsumer.pojo.Skuserviceimp;
import cn.axy.xc.xcitemdetailconsumer.service.OrderChange;
import cn.axy.xc.xcitemdetailconsumer.service.Updmessageservice;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderChangeimpl implements Updmessageservice {
    @Autowired
    private OrderChange orderChange;

    @Override
    public String updmessage(Message mes) {
        return null;
    }

    @Override
    public String updsku(Integer mid, Long skuid, Skuserviceimp skuserviceimp) {
        return null;
    }

    @Override
    public void invsend(String invMQ) {
        List<JSONObject> lists = JSONArray.parseObject(invMQ, List.class);
        String re = null;
        for (JSONObject jsonObject : lists) {
                String orderid = jsonObject.get("orderid").toString();
                orderChange.orderChangetoClose(orderid);
        }
    }
}
