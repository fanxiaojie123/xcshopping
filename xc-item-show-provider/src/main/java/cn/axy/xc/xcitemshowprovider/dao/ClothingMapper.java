package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Clothing;
import cn.axy.xc.xcitemshowprovider.pojo.ClothingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClothingMapper {
    long countByExample(ClothingExample example);

    int deleteByExample(ClothingExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(Clothing record);

    int insertSelective(Clothing record);

    List<Clothing> selectByExample(ClothingExample example);

    Clothing selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") Clothing record, @Param("example") ClothingExample example);

    int updateByExample(@Param("record") Clothing record, @Param("example") ClothingExample example);

    int updateByPrimaryKeySelective(Clothing record);

    int updateByPrimaryKey(Clothing record);
}