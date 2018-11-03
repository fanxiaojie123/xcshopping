package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Ornaments;
import cn.axy.xc.xcitemshowprovider.pojo.OrnamentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrnamentsMapper {
    long countByExample(OrnamentsExample example);

    int deleteByExample(OrnamentsExample example);

    int deleteByPrimaryKey(String oId);

    int insert(Ornaments record);

    int insertSelective(Ornaments record);

    List<Ornaments> selectByExample(OrnamentsExample example);

    Ornaments selectByPrimaryKey(String oId);

    int updateByExampleSelective(@Param("record") Ornaments record, @Param("example") OrnamentsExample example);

    int updateByExample(@Param("record") Ornaments record, @Param("example") OrnamentsExample example);

    int updateByPrimaryKeySelective(Ornaments record);

    int updateByPrimaryKey(Ornaments record);
}