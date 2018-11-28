package cn.axy.xc.xcitemdetailconsumer.service;

import cn.axy.xc.xcitemdetailconsumer.service.impl.Updskumessaesrviceimpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "xc-item-detail-provider",fallback = Updskumessaesrviceimpl.class)
public interface Updskumessageservice {
    @RequestMapping(value = "/updmessageinv",method = RequestMethod.POST)
    String updmessageinv(
            @RequestParam("mid")Integer mid,
            @RequestParam("psc")Integer psc);
    @RequestMapping(value = "/updskuinv",method = RequestMethod.POST)
    String updskuinv(
            @RequestParam("mid")Integer mid,
            @RequestParam("skuid")Long skuid,
            @RequestParam("psc")Integer psc);
}
