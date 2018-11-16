package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Appliances;
import cn.axy.xc.xcitemshowprovider.pojo.Food;
import cn.axy.xc.xcitemshowprovider.pojo.Skupricesolr;

import java.util.List;

public interface Foopricedao {
    public List<Food> fooprice(Skupricesolr skupricesolr) throws Exception;
}
