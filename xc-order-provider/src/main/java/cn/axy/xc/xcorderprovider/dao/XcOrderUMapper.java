package cn.axy.xc.xcorderprovider.dao;

import cn.axy.xc.xcorderprovider.pojo.XcOrderU;
import cn.axy.xc.xcorderprovider.pojo.XcOrderUExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface XcOrderUMapper {
    long countByExample(XcOrderUExample example);

    int deleteByExample(XcOrderUExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(XcOrderU record);

    int insertSelective(XcOrderU record);

    List<XcOrderU> selectByExample(XcOrderUExample example);

    XcOrderU selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") XcOrderU record, @Param("example") XcOrderUExample example);

    int updateByExample(@Param("record") XcOrderU record, @Param("example") XcOrderUExample example);

    int updateByPrimaryKeySelective(XcOrderU record);

    int updateByPrimaryKey(XcOrderU record);
}