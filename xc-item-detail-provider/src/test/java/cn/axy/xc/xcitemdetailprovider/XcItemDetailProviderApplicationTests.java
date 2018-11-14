package cn.axy.xc.xcitemdetailprovider;

import cn.axy.xc.xcitemdetailprovider.dao.SearchCategoryMapper;
import cn.axy.xc.xcitemdetailprovider.pojo.SearchCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XcItemDetailProviderApplicationTests {
    @Autowired
    private SearchCategoryMapper scm;

    @Test
    public void contextLoads() {
        System.out.println("***********");
        System.out.println(scm);
//        Integer s = scm.selectByPrimaryName("1");

//        System.out.println(s);
//        SearchCategory searchCategory = scm.selectByPrimaryKey(1);
//        System.out.println(searchCategory.getSearchCategoryName());

    }



}
