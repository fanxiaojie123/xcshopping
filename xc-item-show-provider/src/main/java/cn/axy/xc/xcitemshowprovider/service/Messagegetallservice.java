package cn.axy.xc.xcitemshowprovider.service;

import cn.axy.xc.xcitemshowprovider.pojo.Messagegetallsolr;
import cn.axy.xc.xcitemshowprovider.pojo.Messagesolrpojo;

import java.util.List;

public interface Messagegetallservice {
    public List<Messagesolrpojo> searchProduct(String mStutar) throws Exception;
}
