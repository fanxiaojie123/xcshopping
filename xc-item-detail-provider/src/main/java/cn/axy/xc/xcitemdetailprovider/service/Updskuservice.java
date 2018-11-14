package cn.axy.xc.xcitemdetailprovider.service;


import cn.axy.xc.xcitemdetailprovider.pojo.*;

public interface Updskuservice {
    String updateByPrimaryKeySelectiveapp(Appliances record);
    String updateByPrimaryKeySelectiveclo(Clothing record);
    String updateByPrimaryKeySelectivecos(Cosmetics record);
    String updateByPrimaryKeySelectivefoo(Food record);
    String updateByPrimaryKeySelectiveorn(Ornaments record);
    String updsku(Integer mid,Integer skuid,Appliances app,Clothing clo,Cosmetics cos,Food foo,Ornaments orn);
}
