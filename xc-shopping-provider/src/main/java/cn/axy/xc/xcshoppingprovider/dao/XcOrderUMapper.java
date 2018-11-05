package cn.axy.xc.xcshoppingprovider.dao;

import cn.axy.xc.xcshoppingprovider.pojo.XcOrderU;
import cn.axy.xc.xcshoppingprovider.pojo.XcOrderUExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XcOrderUMapper {
    long countByExample(XcOrderUExample example);

    int deleteByExample(XcOrderUExample example);

    int insert(XcOrderU record);

    int insertSelective(XcOrderU record);

    List<XcOrderU> selectByExample(XcOrderUExample example);

    int updateByExampleSelective(@Param("record") XcOrderU record, @Param("example") XcOrderUExample example);

    int updateByExample(@Param("record") XcOrderU record, @Param("example") XcOrderUExample example);
}