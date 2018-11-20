package cn.axy.xc.xcitemdetailprovider.dao;

import cn.axy.xc.xcitemdetailprovider.pojo.Appliances;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AppliancesMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Appliances record);

    int insertSelective(Appliances record);

    Appliances selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Appliances record);

    int updateByPrimaryKey(Appliances record);

    @Select("select a_size,a_color,a_price,a_count from appliances where m_id=#{mid}")
    @Results({
            @Result(property = "aSize" , column = "a_size"),
            @Result(property = "aColor" , column = "a_color"),
            @Result(property = "aPrice" , column = "a_price"),
            @Result(property = "aCount" , column = "a_count")
    })
    List<Appliances> selapp(@Param("mid") Integer mid);
    @Select("select a_count from appliances where m_id=#{mid} and a_id=#{aid}")
    @Results({
            @Result(property = "aCount" , column = "a_count")
    })
    Double selappinv(@Param("mid") Integer mid,@Param("aid")Integer aid);
    @Update("update appliances set a_count=#{count} where m_id=#{mid} and a_id=#{aid}")
    int updappinv(@Param("count")Double count,@Param("mid") Integer mid,@Param("aid")Integer aid);
}