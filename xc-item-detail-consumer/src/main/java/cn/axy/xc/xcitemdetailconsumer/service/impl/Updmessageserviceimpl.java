package cn.axy.xc.xcitemdetailconsumer.service.impl;

import cn.axy.xc.xcitemdetailconsumer.pojo.*;
import cn.axy.xc.xcitemdetailconsumer.service.Updmessageservice;
import org.springframework.stereotype.Component;

@Component
public class Updmessageserviceimpl implements Updmessageservice {
    @Override
    public String updmessage(Message mes) {
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }

    @Override
    public String updsku(Integer mid, Long skuid, Skuserviceimp skuserviceimp) {
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }
}
