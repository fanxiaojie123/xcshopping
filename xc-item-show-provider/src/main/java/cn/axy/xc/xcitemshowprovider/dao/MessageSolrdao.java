package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Messagesolr;
import cn.axy.xc.xcitemshowprovider.pojo.Messagesolrpojo;

import java.util.List;
public interface MessageSolrdao {
    public List<Messagesolrpojo> searchProduct(Messagesolr messagesolr) throws Exception;
}
