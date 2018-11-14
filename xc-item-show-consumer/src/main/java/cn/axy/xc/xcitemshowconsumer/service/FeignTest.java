package cn.axy.xc.xcitemshowconsumer.service;

import cn.axy.xc.xcitemshowconsumer.service.impl.FeignTestImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "xc-item-show-provider",fallback = FeignTestImpl.class)
public interface FeignTest {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    String test();

}
