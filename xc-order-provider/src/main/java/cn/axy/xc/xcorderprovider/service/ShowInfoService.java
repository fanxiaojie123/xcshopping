package cn.axy.xc.xcorderprovider.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface ShowInfoService {
    /**
     * 用户根据订单id获得订单信息
     * @param orderId
     * @return
     */
    String orderInfoUser(String orderId);

    /**
     * 商家根据订单id获得订单信息
     * @param orderId
     * @return
     */
    String orderInfoShop(String orderId);

    /**
     * 根据订单id在redis中获得订单信息
     */
    Map<String,Object> showInfoRedis(String orderId);

    /**
     * 根据订单id在mysql中获得订单信息
     */
    Map<String,Object> showInfoMysqlShop(String orderId);

    /**
     * 根据订单id在mysql中获得订单信息
     */
    Map<String,Object> showInfoMysqlUser(String orderId);

}
