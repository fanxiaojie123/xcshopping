package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.Skusolrdao;
import cn.axy.xc.xcitemshowprovider.dao.impl.AppliancesSolrdao;
import cn.axy.xc.xcitemshowprovider.pojo.Appliances;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;
import cn.axy.xc.xcitemshowprovider.service.Skusolrservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Skusolrserviceimpl implements Skusolrservice {
    @Autowired
    private AppliancesSolrdao appliancesSolrdao;

    @Override
    public List<Appliances> searchProduct1(Skusolr skusolr) throws Exception {
        return appliancesSolrdao.searchProduct(skusolr);
    }
}
