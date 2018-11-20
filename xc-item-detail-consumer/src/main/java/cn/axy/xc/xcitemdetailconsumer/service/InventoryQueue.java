package cn.axy.xc.xcitemdetailconsumer.service;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface InventoryQueue {
    @RequestMapping(value = "/updmessageinv",method = RequestMethod.POST)
    String updmessageinv(@RequestParam("mid")Integer mid);
    @RequestMapping(value = "/updskuinv",method = RequestMethod.POST)
    String updskuinv(@RequestParam("商品ID")Integer mid,
                     @RequestParam("SKUID")Integer skuid);

}
