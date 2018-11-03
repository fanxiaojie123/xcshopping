package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Food;
import cn.axy.xc.xcitemshowprovider.pojo.FoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodMapper {
    long countByExample(FoodExample example);

    int deleteByExample(FoodExample example);

    int deleteByPrimaryKey(String fId);

    int insert(Food record);

    int insertSelective(Food record);

    List<Food> selectByExample(FoodExample example);

    Food selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByExample(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);
}