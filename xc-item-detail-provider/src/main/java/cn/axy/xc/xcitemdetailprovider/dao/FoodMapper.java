package cn.axy.xc.xcitemdetailprovider.dao;

import cn.axy.xc.xcitemdetailprovider.pojo.Appliances;
import cn.axy.xc.xcitemdetailprovider.pojo.Food;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FoodMapper {
    int deleteByPrimaryKey(Integer fId);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(Integer fId);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);

    @Select("select f_size,f_color,f_price,f_count from food where m_id=#{mid}")
    @Results({
            @Result(property = "fSize" , column = "f_size"),
            @Result(property = "fColor" , column = "f_color"),
            @Result(property = "fPrice" , column = "f_price"),
            @Result(property = "fCount" , column = "f_count")
    })
    List<Food> selfoo(@Param("mid") Integer mid);
}