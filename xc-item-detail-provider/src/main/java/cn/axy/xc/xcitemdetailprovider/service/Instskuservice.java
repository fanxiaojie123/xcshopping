package cn.axy.xc.xcitemdetailprovider.service;

import cn.axy.xc.xcitemdetailprovider.pojo.*;
import cn.axy.xc.xcitemdetailprovider.service.exit.Skuserviceimp;

public interface Instskuservice {
    String insertSelectiveapp(Appliances record);
    String insertSelectiveclo(Clothing record);
    String insertSelectivecos(Cosmetics record);
    String insertSelectivefoo(Food record);
    String insertSelectiveon(Ornaments record);
    String instsku(Integer mid, Skuserviceimp skumessage);
}
