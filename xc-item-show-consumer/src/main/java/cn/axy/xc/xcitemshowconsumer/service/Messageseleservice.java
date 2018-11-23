package cn.axy.xc.xcitemshowconsumer.service;

import cn.axy.xc.xcitemshowconsumer.pojo.Messagesolr;
import cn.axy.xc.xcitemshowconsumer.service.impl.Messageseleserviceimpl;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "xc-item-show-provider",fallback = Messageseleserviceimpl.class)
public interface Messageseleservice {
    @RequestMapping(value="/list",method = RequestMethod.POST)
    String searchProduct(@RequestBody  Messagesolr messagesolr) throws Exception;
}
