package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.impl.MessageSolrimpl;
import cn.axy.xc.xcitemshowprovider.pojo.Messagesolr;
import cn.axy.xc.xcitemshowprovider.pojo.Messagesolrpojo;
import cn.axy.xc.xcitemshowprovider.service.Messagesolrservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Messagesolrserviceimpl implements Messagesolrservice {
    @Autowired
    private MessageSolrimpl messageSolrimpl;
    @Override
    public List<Messagesolrpojo> searchProduct(Messagesolr messagesolr) throws Exception {
        return messageSolrimpl.searchProduct(messagesolr);
    }
}
