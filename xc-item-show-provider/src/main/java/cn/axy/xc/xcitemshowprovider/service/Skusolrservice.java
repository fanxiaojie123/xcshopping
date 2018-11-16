package cn.axy.xc.xcitemshowprovider.service;

import cn.axy.xc.xcitemshowprovider.pojo.Appliances;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;

import java.util.List;

public interface Skusolrservice {
    public List<Appliances> searchProduct1(Skusolr skusolr) throws Exception;
}
