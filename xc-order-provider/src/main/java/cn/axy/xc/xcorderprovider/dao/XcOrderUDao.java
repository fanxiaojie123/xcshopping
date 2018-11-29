package cn.axy.xc.xcorderprovider.dao;

import cn.axy.xc.xcorderprovider.pojo.XcOrderO;

public interface XcOrderUDao {

    /**
     * 根据用户id获得订单列表
     * @param userId
     * @return
     */
    XcOrderO getUserOrder(int userId);



}
