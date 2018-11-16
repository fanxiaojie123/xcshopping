package cn.axy.xc.xcorderprovider.dao;

import cn.axy.xc.xcorderprovider.pojo.XcOrderShipping;
import cn.axy.xc.xcorderprovider.pojo.XcOrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface XcOrderShippingMapper {
    long countByExample(XcOrderShippingExample example);

    int deleteByExample(XcOrderShippingExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(XcOrderShipping record);

    int insertSelective(XcOrderShipping record);

    List<XcOrderShipping> selectByExample(XcOrderShippingExample example);

    XcOrderShipping selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") XcOrderShipping record, @Param("example") XcOrderShippingExample example);

    int updateByExample(@Param("record") XcOrderShipping record, @Param("example") XcOrderShippingExample example);

    int updateByPrimaryKeySelective(XcOrderShipping record);

    int updateByPrimaryKey(XcOrderShipping record);
}