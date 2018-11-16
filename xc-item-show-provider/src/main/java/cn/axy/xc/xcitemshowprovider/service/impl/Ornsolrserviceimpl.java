package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.impl.OrnSolrimpl;
import cn.axy.xc.xcitemshowprovider.pojo.Ornaments;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;
import cn.axy.xc.xcitemshowprovider.service.Ornsolrservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Ornsolrserviceimpl implements Ornsolrservice {
    @Autowired
    private OrnSolrimpl ornSolrimpl;
    @Override
    public List<Ornaments> orn(Skusolr skusolr) throws Exception {
        return ornSolrimpl.orn(skusolr);
    }
}
