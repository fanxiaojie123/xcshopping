package cn.axy.xc.xcitemshowprovider.service;

import cn.axy.xc.xcitemshowprovider.pojo.Clothing;
import cn.axy.xc.xcitemshowprovider.pojo.Cosmetics;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;

import java.util.List;

public interface Cossolrservice {
    public List<Cosmetics> cos(Skusolr skusolr) throws Exception;
}
