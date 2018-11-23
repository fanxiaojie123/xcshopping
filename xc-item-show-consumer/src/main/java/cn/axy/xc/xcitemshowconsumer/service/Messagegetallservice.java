package cn.axy.xc.xcitemshowconsumer.service;

import cn.axy.xc.xcitemshowconsumer.service.impl.Messagegetallserviceimpl;
import cn.axy.xc.xcitemshowconsumer.service.impl.Skumessageserviceimpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "xc-item-show-provider",fallback = Messagegetallserviceimpl.class)
public interface Messagegetallservice {
    @RequestMapping(value = "/messagegetall",method = RequestMethod.POST)
    String Messagegetall() throws Exception;
}
