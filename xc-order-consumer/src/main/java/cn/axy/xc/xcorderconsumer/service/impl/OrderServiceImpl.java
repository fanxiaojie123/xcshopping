package cn.axy.xc.xcorderconsumer.service.impl;

import cn.axy.xc.xcorderconsumer.service.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public String orderChange(int status) {
        return "咦,客户端走失了....";
    }

    @Override
    public String orderChangetoPaid(String orderid) {
        return "咦,客户端走失了....";
    }
}
