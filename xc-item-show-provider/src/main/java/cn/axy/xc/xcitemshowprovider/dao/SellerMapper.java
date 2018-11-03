package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Seller;
import cn.axy.xc.xcitemshowprovider.pojo.SellerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellerMapper {
    long countByExample(SellerExample example);

    int deleteByExample(SellerExample example);

    int deleteByPrimaryKey(String sId);

    int insert(Seller record);

    int insertSelective(Seller record);

    List<Seller> selectByExample(SellerExample example);

    Seller selectByPrimaryKey(String sId);

    int updateByExampleSelective(@Param("record") Seller record, @Param("example") SellerExample example);

    int updateByExample(@Param("record") Seller record, @Param("example") SellerExample example);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKey(Seller record);
}