package cn.axy.xc.xcitemshowconsumer.service;

import cn.axy.xc.xcitemshowconsumer.service.impl.Skumessageserviceimpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(name = "xc-item-show-provider",fallback = Skumessageserviceimpl.class)
public interface Skumessageservice {
    @RequestMapping(value = "/skuidall",method = RequestMethod.POST)
    public String skuidall(
            @RequestParam("skuid")Long skuid) throws Exception;
}
