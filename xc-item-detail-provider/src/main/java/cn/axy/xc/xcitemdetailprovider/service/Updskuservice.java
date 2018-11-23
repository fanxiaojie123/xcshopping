package cn.axy.xc.xcitemdetailprovider.service;


import cn.axy.xc.xcitemdetailprovider.pojo.*;
import cn.axy.xc.xcitemdetailprovider.service.exit.Skuserviceimp;

public interface Updskuservice {
    String updateByPrimaryKeySelectiveapp(Appliances record);
    String updateByPrimaryKeySelectiveclo(Clothing record);
    String updateByPrimaryKeySelectivecos(Cosmetics record);
    String updateByPrimaryKeySelectivefoo(Food record);
    String updateByPrimaryKeySelectiveorn(Ornaments record);
    String updsku(Integer mid, Long skuid, Skuserviceimp skuserviceimp);
}
