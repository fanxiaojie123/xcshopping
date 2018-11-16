package cn.axy.xc.xcitemshowprovider.service;

import cn.axy.xc.xcitemshowprovider.pojo.Food;
import cn.axy.xc.xcitemshowprovider.pojo.Ornaments;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;

import java.util.List;

public interface Ornsolrservice {
    public List<Ornaments> orn(Skusolr skusolr) throws Exception;
}
