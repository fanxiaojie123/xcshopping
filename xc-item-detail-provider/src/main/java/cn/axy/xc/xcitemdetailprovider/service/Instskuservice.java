package cn.axy.xc.xcitemdetailprovider.service;

import cn.axy.xc.xcitemdetailprovider.pojo.*;

public interface Instskuservice {
    String insertSelectiveapp(Appliances record);
    String insertSelectiveclo(Clothing record);
    String insertSelectivecos(Cosmetics record);
    String insertSelectivefoo(Food record);
    String insertSelectiveon(Ornaments record);
    String instsku(Integer mid,Appliances app,Clothing clo,Cosmetics cos,Food foo,Ornaments orn);
}
