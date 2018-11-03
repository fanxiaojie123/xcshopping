package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.SearchCategory;
import cn.axy.xc.xcitemshowprovider.pojo.SearchCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchCategoryMapper {
    long countByExample(SearchCategoryExample example);

    int deleteByExample(SearchCategoryExample example);

    int deleteByPrimaryKey(String searchCategoryId);

    int insert(SearchCategory record);

    int insertSelective(SearchCategory record);

    List<SearchCategory> selectByExample(SearchCategoryExample example);

    SearchCategory selectByPrimaryKey(String searchCategoryId);

    int updateByExampleSelective(@Param("record") SearchCategory record, @Param("example") SearchCategoryExample example);

    int updateByExample(@Param("record") SearchCategory record, @Param("example") SearchCategoryExample example);

    int updateByPrimaryKeySelective(SearchCategory record);

    int updateByPrimaryKey(SearchCategory record);
}