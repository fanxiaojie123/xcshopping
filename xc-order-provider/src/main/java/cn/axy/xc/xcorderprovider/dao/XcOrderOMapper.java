package cn.axy.xc.xcorderprovider.dao;

import cn.axy.xc.xcorderprovider.pojo.XcOrderO;
import cn.axy.xc.xcorderprovider.pojo.XcOrderOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface XcOrderOMapper {
    long countByExample(XcOrderOExample example);

    int deleteByExample(XcOrderOExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(XcOrderO record);

    int insertSelective(XcOrderO record);

    List<XcOrderO> selectByExample(XcOrderOExample example);

    XcOrderO selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") XcOrderO record, @Param("example") XcOrderOExample example);

    int updateByExample(@Param("record") XcOrderO record, @Param("example") XcOrderOExample example);

    int updateByPrimaryKeySelective(XcOrderO record);

    int updateByPrimaryKey(XcOrderO record);
}