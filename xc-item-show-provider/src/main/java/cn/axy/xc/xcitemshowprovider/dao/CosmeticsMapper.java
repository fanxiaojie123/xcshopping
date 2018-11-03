package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Cosmetics;
import cn.axy.xc.xcitemshowprovider.pojo.CosmeticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CosmeticsMapper {
    long countByExample(CosmeticsExample example);

    int deleteByExample(CosmeticsExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(Cosmetics record);

    int insertSelective(Cosmetics record);

    List<Cosmetics> selectByExample(CosmeticsExample example);

    Cosmetics selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") Cosmetics record, @Param("example") CosmeticsExample example);

    int updateByExample(@Param("record") Cosmetics record, @Param("example") CosmeticsExample example);

    int updateByPrimaryKeySelective(Cosmetics record);

    int updateByPrimaryKey(Cosmetics record);
}