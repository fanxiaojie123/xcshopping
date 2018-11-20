package cn.axy.xc.xcitemdetailprovider.dao;

import cn.axy.xc.xcitemdetailprovider.pojo.Appliances;
import cn.axy.xc.xcitemdetailprovider.pojo.Ornaments;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface OrnamentsMapper {
    int deleteByPrimaryKey(Integer oId);

    int insert(Ornaments record);

    int insertSelective(Ornaments record);

    Ornaments selectByPrimaryKey(Integer oId);

    int updateByPrimaryKeySelective(Ornaments record);

    int updateByPrimaryKey(Ornaments record);

    @Select("select o_size,o_color,o_price,o_count from ornaments where m_id=#{mid}")
    @Results({
            @Result(property = "oSize" , column = "o_size"),
            @Result(property = "oColor" , column = "o_color"),
            @Result(property = "oPrice" , column = "o_price"),
            @Result(property = "oCount" , column = "o_count")
    })
    List<Ornaments> selorn(@Param("mid") Integer mid);
    @Select("select o_count from ornaments where m_id=#{mid} and o_id=#{oid}")
    @Results({
            @Result(property = "oCount" , column = "o_count")
    })
    Double selorninv(@Param("mid") Integer mid ,@Param("oid")Integer oid);
    @Update("update ornaments set o_count=#{count} where m_id=#{mid} and o_id=#{oid}")
    int updorninv(@Param("count")Double count,@Param("mid") Integer mid,@Param("oid")Integer oid);
}