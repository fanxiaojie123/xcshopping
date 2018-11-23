package cn.axy.xc.xcitemshowconsumer.service;

import cn.axy.xc.xcitemshowconsumer.service.impl.Skuseleserviceimpl;
import feign.Param;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "xc-item-show-provider",fallback = Skuseleserviceimpl.class)
public interface Skuseleservice {
    @RequestMapping(value = "/scid",method = RequestMethod.POST)
     String scid(@RequestParam("mid")Integer mid) throws Exception;
}
