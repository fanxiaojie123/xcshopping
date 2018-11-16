package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Appliances;
import cn.axy.xc.xcitemshowprovider.pojo.Clothing;
import cn.axy.xc.xcitemshowprovider.pojo.Skupricesolr;

import java.util.List;

public interface Clopricedao {
    public List<Clothing> colprice(Skupricesolr skupricesolr) throws Exception;
}
