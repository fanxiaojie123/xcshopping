package cn.axy.xc.xcitemshowprovider.service;

import cn.axy.xc.xcitemshowprovider.pojo.Clothing;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;

import java.util.List;

public interface Closervicesolr {
    public List<Clothing> clo(Skusolr skusolr) throws Exception;
}
