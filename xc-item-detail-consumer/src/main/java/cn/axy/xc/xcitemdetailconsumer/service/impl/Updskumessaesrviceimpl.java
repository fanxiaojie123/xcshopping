package cn.axy.xc.xcitemdetailconsumer.service.impl;

import cn.axy.xc.xcitemdetailconsumer.service.Updskumessageservice;
import org.springframework.stereotype.Component;

@Component
public class Updskumessaesrviceimpl implements Updskumessageservice {

    @Override
    public String updmessageinv(Integer mid, Integer psc) {
        return "没了";
    }

    @Override
    public String updskuinv(Integer mid, Long skuid, Integer psc) {
        return "没了";
    }
}
