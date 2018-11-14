package cn.axy.xc.xcitemdetailprovider.dao;

import cn.axy.xc.xcitemdetailprovider.pojo.Message;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    @Select("select m_name,m_picture,m_particulars,m_points,m_price,m_count from message where s_id=#{sid} and m_status=1")
    @Results({
            @Result(property = "mName" , column = "m_name"),
            @Result(property = "mPicture" , column = "m_picture"),
            @Result(property = "mParticulars" , column = "m_particulars"),
            @Result(property = "mPoints" , column = "m_points"),
            @Result(property = "mPrice" , column = "m_price"),
            @Result(property = "mCount" , column = "m_count")
    })
    List<Message> sellgetall(@Param("sid")Integer sid);
    @Select("select search_category_parent_id from message where m_id=#{mid} and m_status=1")
    @Results({
            @Result(property = "searchCategoryParentId" , column = "search_category_parent_id")
    })
    Integer midorn(@Param("mid") Integer mid);
    @Update("update message set m_status=0 where m_id=#{mid}")
    int delmessage(@Param("mid") Integer mid);
}