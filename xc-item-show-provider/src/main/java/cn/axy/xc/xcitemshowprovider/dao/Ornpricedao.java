package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Appliances;
import cn.axy.xc.xcitemshowprovider.pojo.Ornaments;
import cn.axy.xc.xcitemshowprovider.pojo.Skupricesolr;

import java.util.List;

public interface Ornpricedao {
    public List<Ornaments> ornprice(Skupricesolr skupricesolr) throws Exception;
}
