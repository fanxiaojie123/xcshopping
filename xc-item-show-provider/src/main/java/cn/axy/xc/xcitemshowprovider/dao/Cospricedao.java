package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Appliances;
import cn.axy.xc.xcitemshowprovider.pojo.Cosmetics;
import cn.axy.xc.xcitemshowprovider.pojo.Skupricesolr;

import java.util.List;

public interface Cospricedao {
    public List<Cosmetics> cosprice(Skupricesolr skupricesolr) throws Exception;
}
