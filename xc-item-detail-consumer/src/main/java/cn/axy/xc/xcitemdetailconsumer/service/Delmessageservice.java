package cn.axy.xc.xcitemdetailconsumer.service;

import cn.axy.xc.xcitemdetailconsumer.service.impl.Delmessageserviceimpl;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "xc-item-detail-provider",fallback = Delmessageserviceimpl.class)
public interface Delmessageservice {
    @RequestMapping(value = "/delmessage",method = RequestMethod.POST)
    String delmessage( @RequestParam("mid")Integer mid);
    @RequestMapping(value = "/delsku",method = RequestMethod.POST)
    public String delsku(@RequestParam("mid")Integer mid,
                         @RequestParam("skuid")Long skuid);
}
