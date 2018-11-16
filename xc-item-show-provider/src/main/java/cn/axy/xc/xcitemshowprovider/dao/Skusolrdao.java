package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Appliances;
import cn.axy.xc.xcitemshowprovider.pojo.Clothing;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;

import java.util.List;

public interface Skusolrdao {
    public List<Appliances> searchProduct(Skusolr skusolr) throws Exception;
}
