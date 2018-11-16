package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.CosSolrdao;
import cn.axy.xc.xcitemshowprovider.dao.impl.Cossolrimpl;
import cn.axy.xc.xcitemshowprovider.pojo.Cosmetics;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;
import cn.axy.xc.xcitemshowprovider.service.Cossolrservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Cossolrserviceimpl implements Cossolrservice {
    @Autowired
    private Cossolrimpl cossolrimpl;
    @Override
    public List<Cosmetics> cos(Skusolr skusolr) throws Exception {
        return cossolrimpl.cos(skusolr);
    }
}
