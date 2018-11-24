package cn.axy.xc.xcorderprovider.dao;

import cn.axy.xc.xcorderprovider.pojo.XcOrderO;
import cn.axy.xc.xcorderprovider.pojo.XcOrderOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商家订单表（按照月份分布在三个表中）
 */
@Repository
public interface XcOrderODao {
    /**
     * 搜索商家订单表中的条目数
     * @return
     */
    int selectAll();

    /**
     * 修改商家订单信息
     * @param xcOrderO
     * @return
     */
    int updateOrder(XcOrderO xcOrderO);

    /**
     * 获得本月订单信息
     * @return
     */
    List<XcOrderO> getThisMonthOrder();

    /**
     * 根据商家ID获得订单列表
     * @param storeId
     * @return
     */
    List<XcOrderO> getStoreOrder(int storeId);

    /**
     * 根据用户id获得订单列表
     * @param userId
     * @return
     */
    XcOrderO getOrder(int userId);

}