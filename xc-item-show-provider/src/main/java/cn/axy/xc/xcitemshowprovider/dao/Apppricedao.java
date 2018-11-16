package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Appliances;
import cn.axy.xc.xcitemshowprovider.pojo.Skupricesolr;

import java.util.List;

public interface Apppricedao {
    public List<Appliances> appprice(Skupricesolr skupricesolr) throws Exception;
}
