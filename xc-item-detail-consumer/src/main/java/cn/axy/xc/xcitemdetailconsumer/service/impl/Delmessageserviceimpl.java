package cn.axy.xc.xcitemdetailconsumer.service.impl;

import cn.axy.xc.xcitemdetailconsumer.service.Delmessageservice;
import org.springframework.stereotype.Component;

@Component
public class Delmessageserviceimpl implements Delmessageservice {
    @Override
    public String delmessage(Integer mid) {
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }

    @Override
    public String delsku(Integer mid, Integer skuid) {
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }
}
