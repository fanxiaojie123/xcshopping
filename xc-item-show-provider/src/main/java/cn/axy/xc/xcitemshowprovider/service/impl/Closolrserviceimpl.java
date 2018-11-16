package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.impl.ClothingSolrimpl;
import cn.axy.xc.xcitemshowprovider.pojo.Clothing;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;
import cn.axy.xc.xcitemshowprovider.service.Closervicesolr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Closolrserviceimpl implements Closervicesolr {
    @Autowired
    private ClothingSolrimpl clothingSolrimpl;
    @Override
    public List<Clothing> clo(Skusolr skusolr) throws Exception {
        return clothingSolrimpl.clo(skusolr);
    }
}
