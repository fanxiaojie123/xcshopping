package cn.axy.xc.xcitemdetailprovider.dao;

import cn.axy.xc.xcitemdetailprovider.pojo.Appliances;
import cn.axy.xc.xcitemdetailprovider.pojo.Cosmetics;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CosmeticsMapper {
    int deleteByPrimaryKey(Integer coId);

    int insert(Cosmetics record);

    int insertSelective(Cosmetics record);

    Cosmetics selectByPrimaryKey(Integer coId);

    int updateByPrimaryKeySelective(Cosmetics record);

    int updateByPrimaryKey(Cosmetics record);

    @Select("select co_size,co_color,co_price,co_count from cosmetics where m_id=#{mid}")
    @Results({
            @Result(property = "coSize" , column = "co_size"),
            @Result(property = "coColor" , column = "co_color"),
            @Result(property = "coPrice" , column = "co_price"),
            @Result(property = "coCount" , column = "co_count")
    })
    List<Cosmetics> selcos(@Param("mid") Integer mid);
    @Select("select co_count from cosmetics where m_id=#{mid} and co_id=#{coid}")
    @Results({
            @Result(property = "cCount" , column = "c_count")
    })
    Double selcosinv(@Param("mid") Integer mid,@Param("coid") Integer coid);
    @Update("update cosmetics set co_count=#{count} where m_id=#{mid} and co_id=#{coid}")
    int updcosinv(@Param("count")Double count,@Param("mid") Integer mid,@Param("coid") Integer coid);
}