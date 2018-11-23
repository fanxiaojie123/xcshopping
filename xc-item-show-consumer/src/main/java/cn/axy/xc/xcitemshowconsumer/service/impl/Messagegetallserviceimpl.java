package cn.axy.xc.xcitemshowconsumer.service.impl;

import cn.axy.xc.xcitemshowconsumer.service.Messagegetallservice;
import org.springframework.stereotype.Component;

@Component
public class Messagegetallserviceimpl implements Messagegetallservice {

    @Override
    public String Messagegetall() throws Exception {
        return "本服务已宕机";
    }
}
