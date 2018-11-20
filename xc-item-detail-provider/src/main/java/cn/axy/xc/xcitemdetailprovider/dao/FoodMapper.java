package cn.axy.xc.xcitemdetailprovider.dao;

import cn.axy.xc.xcitemdetailprovider.pojo.Appliances;
import cn.axy.xc.xcitemdetailprovider.pojo.Food;
import org.apache.ibatis.annotations.*;

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
    @Select("select f_count from food where m_id=#{mid} and f_id=#{fid}")
    @Results({
            @Result(property = "fCount" , column = "f_count")
    })
    Double selfooinv(@Param("mid") Integer mid,@Param("fid") Integer fid);
    @Update("update food set f_count=#{count} where m_id=#{mid} and f_id=#{fid}")
    int updfooinv(@Param("count")Double count,@Param("mid") Integer mid,@Param("fid") Integer fid);
}