package cn.axy.xc.xcitemshowprovider.service;

import cn.axy.xc.xcitemshowprovider.pojo.Messagesolr;
import cn.axy.xc.xcitemshowprovider.pojo.Messagesolrpojo;

import java.util.List;

public interface Messagesolrservice {
    public List<Messagesolrpojo> searchProduct(Messagesolr messagesolr) throws Exception;
}
