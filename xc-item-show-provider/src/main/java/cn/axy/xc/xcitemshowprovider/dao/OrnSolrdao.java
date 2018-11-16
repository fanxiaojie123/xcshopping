package cn.axy.xc.xcitemshowprovider.dao;

import cn.axy.xc.xcitemshowprovider.pojo.Ornaments;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;

import java.util.List;

public interface OrnSolrdao {
    public List<Ornaments> orn(Skusolr skusolr) throws Exception;
}
