package cn.axy.xc.xcitemshowprovider.service;

import cn.axy.xc.xcitemshowprovider.pojo.*;

import java.util.List;

public interface Skupriceservice {
    public List<Clothing> cloprice(Skupricesolr skupricesolr) throws Exception;
    public List<Food> fooprice(Skupricesolr skupricesolr) throws Exception;
    public List<Cosmetics> cosprice(Skupricesolr skupricesolr) throws Exception;
    public List<Appliances> appprice(Skupricesolr skupricesolr) throws Exception;
    public List<Ornaments> ornprice(Skupricesolr skupricesolr) throws Exception;
    String skuprice(Skupricesolr skupricesolr) throws Exception;

}
