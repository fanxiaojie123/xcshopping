package cn.axy.xc.xcshoppingprovider.dao;

import cn.axy.xc.xcshoppingprovider.pojo.XcOrderItem;
import cn.axy.xc.xcshoppingprovider.pojo.XcOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XcOrderItemMapper {
    long countByExample(XcOrderItemExample example);

    int deleteByExample(XcOrderItemExample example);

    int insert(XcOrderItem record);

    int insertSelective(XcOrderItem record);

    List<XcOrderItem> selectByExample(XcOrderItemExample example);

    int updateByExampleSelective(@Param("record") XcOrderItem record, @Param("example") XcOrderItemExample example);

    int updateByExample(@Param("record") XcOrderItem record, @Param("example") XcOrderItemExample example);
}