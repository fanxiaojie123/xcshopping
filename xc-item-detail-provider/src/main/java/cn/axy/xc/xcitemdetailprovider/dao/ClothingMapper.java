package cn.axy.xc.xcitemdetailprovider.dao;

import cn.axy.xc.xcitemdetailprovider.pojo.Clothing;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ClothingMapper {
    int deleteByPrimaryKey(Long cId);

    int insert(Clothing record);

    int insertSelective(Clothing record);

    Clothing selectByPrimaryKey(Long cId);

    int updateByPrimaryKeySelective(Clothing record);

    int updateByPrimaryKey(Clothing record);

    @Select("select c_size,c_color,c_price,c_count from clothing where m_id=#{mid}")
    @Results({
            @Result(property = "cSize" , column = "c_size"),
            @Result(property = "cColor" , column = "c_color"),
            @Result(property = "cPrice" , column = "c_price"),
            @Result(property = "cCount" , column = "c_count")
    })
    List<Clothing> selclo(@Param("mid") Integer mid);
    @Select("select c_count from clothing where m_id=#{mid} and c_id=#{cid}")
    @Results({
            @Result(property = "cCount" , column = "c_count")
    })
    Double selcloinv(@Param("mid") Integer mid,@Param("cid") Long cid);
    @Update("update clothing set c_count=#{count} where m_id=#{mid} and c_id=#{cid}")
    int updcloinv(@Param("count")Double count,@Param("mid") Integer mid,@Param("cid") Long cid);
}