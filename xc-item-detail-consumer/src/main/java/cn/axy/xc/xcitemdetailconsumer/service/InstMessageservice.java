package cn.axy.xc.xcitemdetailconsumer.service;

import cn.axy.xc.xcitemdetailconsumer.pojo.*;
import cn.axy.xc.xcitemdetailconsumer.service.impl.Delmessageserviceimpl;
import cn.axy.xc.xcitemdetailconsumer.service.impl.Instmessageserviceimpl;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@FeignClient(name = "xc-item-detail-provider",fallback = Instmessageserviceimpl.class)
public interface InstMessageservice {
    @RequestMapping(value = "/instmessage",method = RequestMethod.POST)
    public String instmessage(@RequestParam("mName") String mName ,
                              @RequestParam("mPicture") String mPicture,
                              @RequestParam("mParticulars") String mParticulars,
                              @RequestParam("mPoints") String mPoints,
                              @RequestParam("searchCategoryId") String searchCategoryId,
                              @RequestParam("searchCategoryParentId") String searchCategoryParentId,
                              @RequestParam("seller") Integer seller,
                              @RequestParam("mPrice") Double mPrice,
                              @RequestParam("mCount") Double mCount);
    @RequestMapping(value = "/instsku",method = RequestMethod.POST)
    public String instsku(
            @RequestParam("mid")Integer mid,
            @RequestBody Skuserviceimp skuserviceimp);
}
