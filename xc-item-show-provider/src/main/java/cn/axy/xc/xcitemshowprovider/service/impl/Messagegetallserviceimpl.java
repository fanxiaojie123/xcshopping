package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.MessageSolrdao;
import cn.axy.xc.xcitemshowprovider.dao.impl.MessageSolrimpl;
import cn.axy.xc.xcitemshowprovider.pojo.Messagegetallsolr;
import cn.axy.xc.xcitemshowprovider.pojo.Messagesolrpojo;
import cn.axy.xc.xcitemshowprovider.service.Messagegetallservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Messagegetallserviceimpl implements Messagegetallservice {
    @Autowired
    private MessageSolrimpl messageSolrimpl;
    @Override
    public List<Messagesolrpojo> searchProduct(String mStutar) throws Exception {
        return messageSolrimpl.searchProduct1(mStutar);
    }
}
