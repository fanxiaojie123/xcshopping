package cn.axy.xc.xcorderconsumer.service;

import cn.axy.xc.xcorderconsumer.service.impl.StoreServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "XC-ITEM-DETAIL-PROVIDER",fallback = StoreServiceImpl.class)
public interface StoreService {

    @RequestMapping(value = "/invsend",method = RequestMethod.POST)
    public void invsend(@RequestParam("invMQ") String invMQ);

}
