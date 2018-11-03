package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Appliances;
import cn.axy.xc.xcitemshowprovider.pojo.AppliancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppliancesMapper {
    long countByExample(AppliancesExample example);

    int deleteByExample(AppliancesExample example);

    int deleteByPrimaryKey(String aId);

    int insert(Appliances record);

    int insertSelective(Appliances record);

    List<Appliances> selectByExample(AppliancesExample example);

    Appliances selectByPrimaryKey(String aId);

    int updateByExampleSelective(@Param("record") Appliances record, @Param("example") AppliancesExample example);

    int updateByExample(@Param("record") Appliances record, @Param("example") AppliancesExample example);

    int updateByPrimaryKeySelective(Appliances record);

    int updateByPrimaryKey(Appliances record);
}