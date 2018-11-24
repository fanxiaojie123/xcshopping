package cn.axy.xc.xcorderprovider.service;

import cn.axy.xc.xcorderprovider.pojo.OrderInfo;
import org.springframework.stereotype.Service;

@Service
public interface CreateService {
    /**
     * 创建订单
     * @param orderInfo 订单信息实体类
     * @param userId 用户id
     * @return
     */
    String createOrder(OrderInfo orderInfo,String userId);

}
