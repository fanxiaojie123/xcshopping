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
public class OrderChangeimpl implements OrderChange {


    @Override
    public String orderChangetoClose(String orderid) {
        return "没了";
    }
}
