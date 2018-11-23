package cn.axy.xc.xcitemdetailconsumer.service;

import cn.axy.xc.xcitemdetailconsumer.service.impl.Instmessageserviceimpl;
import cn.axy.xc.xcitemdetailconsumer.service.impl.Selmessageserviceimpl;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "xc-item-detail-provider",fallback = Selmessageserviceimpl.class)
public interface Selmessageservice {
    @RequestMapping(value = "/getall",method = RequestMethod.POST)
    public String Messagegetall(@RequestParam("sid")Integer sid);
    @RequestMapping(value = "/selsku",method = RequestMethod.POST)
    public String selsku(@ApiParam(name = "mid",value = "商品ID",required = true)Integer mid);
}
