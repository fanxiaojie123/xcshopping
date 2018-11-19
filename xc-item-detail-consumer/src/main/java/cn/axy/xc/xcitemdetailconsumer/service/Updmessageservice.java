package cn.axy.xc.xcitemdetailconsumer.service;

import cn.axy.xc.xcitemdetailconsumer.pojo.*;
import cn.axy.xc.xcitemdetailconsumer.service.impl.Instmessageserviceimpl;
import cn.axy.xc.xcitemdetailconsumer.service.impl.Updmessageserviceimpl;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@FeignClient(name = "xc-item-detail-provider",fallback = Updmessageserviceimpl.class)
public interface Updmessageservice {
    @RequestMapping(value = "/updmessage",method = RequestMethod.POST)
    public String updmessage(@RequestParam("mes")Message mes);
    @RequestMapping(value = "/updsku",method = RequestMethod.POST)
    public String updsku(@RequestParam("mid")Integer mid,
                         @RequestParam("skuid")Integer skuid,
                         @RequestParam("app")Appliances app,
                         @RequestParam("clo")Clothing clo,
                         @RequestParam("cos")Cosmetics cos,
                         @RequestParam("foo")Food foo,
                         @RequestParam("orn")Ornaments orn);
}
