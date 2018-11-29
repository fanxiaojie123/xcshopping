package cn.axy.xc.xcorderprovider.dao;

import cn.axy.xc.xcorderprovider.pojo.XcOrderItem;
import cn.axy.xc.xcorderprovider.pojo.XcOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XcOrderItemMapper {
    long countByExample(XcOrderItemExample example);

    int deleteByExample(XcOrderItemExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(XcOrderItem record);

    int insertSelective(XcOrderItem record);

    List<XcOrderItem> selectByExample(XcOrderItemExample example);

    XcOrderItem selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") XcOrderItem record, @Param("example") XcOrderItemExample example);

    int updateByExample(@Param("record") XcOrderItem record, @Param("example") XcOrderItemExample example);

    int updateByPrimaryKeySelective(XcOrderItem record);

    int updateByPrimaryKey(XcOrderItem record);
}