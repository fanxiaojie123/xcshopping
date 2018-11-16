package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.impl.FooSolrimpl;
import cn.axy.xc.xcitemshowprovider.pojo.Food;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;
import cn.axy.xc.xcitemshowprovider.service.Foosolrservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Foosolrserviceimpl implements Foosolrservice {
    @Autowired
    private FooSolrimpl fooSolrimpl;
    @Override
    public List<Food> foo(Skusolr skusolr) throws Exception {
        return fooSolrimpl.foo(skusolr);
    }
}
