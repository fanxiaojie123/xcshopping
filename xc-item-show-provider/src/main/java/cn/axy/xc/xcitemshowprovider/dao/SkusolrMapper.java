package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SkusolrMapper {
    @Select("select c.c_id,c.c_size,c.c_color,c.m_id,m.m_price,m.m_count from clothing c LEFT JOIN message m ON c.m_id = m.m_id")
    @Results({
            @Result(property = "id" , column = "c_id"),
            @Result(property = "cSize" , column = "c_size"),
            @Result(property = "cColor" , column = "c_color"),
            @Result(property = "cPrice" , column = "c_price"),
            @Result(property = "cCount" , column = "c_count"),
            @Result(property = "mId" , column = "m_id"),
            @Result(property = "mPrice" , column = "m_price"),
            @Result(property = "mCount" , column = "m_count")

    })
    List<Clothing> cloall();
    @Select("select co.co_id,co.co_size,co.co_color,co.co_price,co.co_count,co.m_id,m.m_price,m.m_count from cosmetics co LEFT JOIN message m ON co.m_id = m.m_id")
    @Results({
            @Result(property = "id" , column = "co_id"),
            @Result(property = "coSize" , column = "co_size"),
            @Result(property = "coColor" , column = "co_color"),
            @Result(property = "coPrice" , column = "co_price"),
            @Result(property = "coCount" , column = "co_count"),
            @Result(property = "mId" , column = "m_id"),
            @Result(property = "mPrice" , column = "m_price"),
            @Result(property = "mCount" , column = "m_count")
    })
    List<Cosmetics> cosall();
    @Select("select f.f_id,f.f_size,f.f_color,f.f_price,f.f_price,f.m_id,m.m_price,m.m_count from food f LEFT JOIN message m ON f.m_id = m.m_id")
    @Results({
            @Result(property = "id" , column = "f_id"),
            @Result(property = "fSize" , column = "f_size"),
            @Result(property = "fColor" , column = "f_color"),
            @Result(property = "fPrice" , column = "f_price"),
            @Result(property = "fCount" , column = "f_count"),
            @Result(property = "mId" , column = "m_id"),
            @Result(property = "mPrice" , column = "m_price"),
            @Result(property = "mCount" , column = "m_count")
    })
    List<Food> fooall();
    @Select("select o.o_id,o.o_size,o.o_color,o.o_price,o.o_count,o.m_id,m.m_price,m.m_count from ornaments o LEFT JOIN message m ON o.m_id = m.m_id")
    @Results({
            @Result(property = "id" , column = "o_id"),
            @Result(property = "oSize" , column = "o_size"),
            @Result(property = "oColor" , column = "o_color"),
            @Result(property = "oPrice" , column = "o_price"),
            @Result(property = "oCount" , column = "o_count"),
            @Result(property = "mId" , column = "m_id"),
            @Result(property = "mPrice" , column = "m_price"),
            @Result(property = "mCount" , column = "m_count")
    })
    List<Ornaments> ornall();
    @Select("select a.a_id,a.a_size,a.a_color,a.a_price,a.a_count,a.m_id,m.m_price,m.m_count from appliances a LEFT JOIN message m ON a.m_id = m.m_id")
    @Results({
            @Result(property = "id" , column = "a_id"),
            @Result(property = "aSize" , column = "a_size"),
            @Result(property = "aColor" , column = "a_color"),
            @Result(property = "aPrice" , column = "a_price"),
            @Result(property = "aCount" , column = "a_count"),
            @Result(property = "mId" , column = "m_id"),
            @Result(property = "mPrice" , column = "m_price"),
            @Result(property = "mCount" , column = "m_count")
    })
    List<Appliances> appall();
}
