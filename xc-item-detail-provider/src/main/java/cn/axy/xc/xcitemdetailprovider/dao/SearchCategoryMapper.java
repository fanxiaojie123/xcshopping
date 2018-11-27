package cn.axy.xc.xcitemdetailprovider.dao;

import cn.axy.xc.xcitemdetailprovider.pojo.SearchCategory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface SearchCategoryMapper {
    int deleteByPrimaryKey(Integer searchCategoryId);

    int insert(SearchCategory record);

    int insertSelective(SearchCategory record);

    SearchCategory selectByPrimaryKey(Integer searchCategoryId);

    int updateByPrimaryKeySelective(SearchCategory record);

    int updateByPrimaryKey(SearchCategory record);

    @Select("select search_category_id from search_category where search_category_name=#{name}")
    @Results({
            @Result(property = "searchCategoryId" , column = "search_category_id")
    })
    SearchCategory searchcategoryid(@Param("name") String name);
}