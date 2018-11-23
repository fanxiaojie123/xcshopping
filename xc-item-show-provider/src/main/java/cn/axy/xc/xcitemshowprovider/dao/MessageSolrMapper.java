package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Message;
import cn.axy.xc.xcitemshowprovider.pojo.Messagesolrpojo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface MessageSolrMapper {
   // select p.pid,p.catalog_name,p.price,p.picture,s.description,s.type,st.`name` from product p LEFT JOIN sku s ON p.description_id=s.sku_id LEFT JOIN skutwo st ON p.name_id=st.sku_nameid
    @Select("select m.m_id,m.m_name,m.m_picture,m.m_particulars,m.m_count,m.m_price,m.m_points,sc.search_category_name,s.s_name,s.s_address,s.s_phone,s.s_describe,s.s_picture,m.m_status from message m LEFT JOIN seller s ON m.s_id = s.s_id LEFT JOIN search_category sc ON m.search_category_id = sc.search_category_id where m_status=1")
    @Results({
            @Result(property = "id" , column = "m_id"),
            @Result(property = "mName" , column = "m_name"),
            @Result(property = "mPicture" , column = "m_picture"),
            @Result(property = "mParticulars" , column = "m_particulars"),
            @Result(property = "mPoints" , column = "m_points"),
            @Result(property = "mCount" , column = "m_count"),
            @Result(property = "mPrice" , column = "m_price"),
            @Result(property = "searchCategoryName" , column = "search_category_name"),
            @Result(property = "sName" , column = "s_name"),
            @Result(property = "sAddress" , column = "s_address"),
            @Result(property = "sPhone" , column = "s_phone"),
            @Result(property = "sDescribe" , column = "s_describe"),
            @Result(property = "sPicture" , column = "s_picture"),
            @Result(property = "mStatus" , column = "m_status")
    })
    List<Messagesolrpojo> messageall();
    @Select("select search_category_parent_id from message where m_id=#{mid}")
    @Results({
            @Result(property = "searchCategoryParentId" , column = "search_category_parent_id")
    })
    Integer scid(@Param("mid") Integer mid);
}
