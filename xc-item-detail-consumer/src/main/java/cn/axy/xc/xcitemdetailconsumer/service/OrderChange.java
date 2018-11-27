package cn.axy.xc.xcitemdetailconsumer.service;

import cn.axy.xc.xcitemdetailconsumer.service.impl.Updmessageserviceimpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "xc-order-provider",fallback = Updmessageserviceimpl.class)
public interface OrderChange {
    @RequestMapping(value = "orderChangetoClose",method = RequestMethod.POST)
    String orderChangetoClose(@RequestParam("orderid") String orderid);
}
