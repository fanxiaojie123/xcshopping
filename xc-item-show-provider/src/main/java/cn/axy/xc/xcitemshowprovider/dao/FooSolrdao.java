package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Cosmetics;
import cn.axy.xc.xcitemshowprovider.pojo.Food;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;

import java.util.List;

public interface FooSolrdao {
    public List<Food> foo(Skusolr skusolr) throws Exception;
}
