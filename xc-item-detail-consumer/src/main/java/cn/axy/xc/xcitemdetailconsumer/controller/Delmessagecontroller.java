package cn.axy.xc.xcitemdetailconsumer.controller;

import cn.axy.xc.xcitemdetailconsumer.service.Delmessageservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Api(value="/delmessage", tags="删除商品和SKU")
@RestController
public class Delmessagecontroller {
    @Autowired
    private Delmessageservice delmessageservice;

    /**
     * 删除商品
     * @param request
     * @param response
     * @param mid
     * @return
     */
    @ApiOperation(value="删除商品详情", notes = "删除商品详情")
    @RequestMapping(value = "/delmessage1")
    String delmessage(@Param("request") HttpServletRequest request,
                      @Param("response") HttpServletResponse response,
                      @ApiParam(name = "mid",value = "商品ID",required = true)Integer mid){
        return delmessageservice.delmessage(mid);
    }

    /**
     * 删除SKU
     * @param request
     * @param response
     * @param mid
     * @param skuid
     * @return
     */
    @ApiOperation(value="删除sku", notes = "删除sku")
    @RequestMapping(value = "/delsku1",method = RequestMethod.POST)
    public String delsku(@Param("request") HttpServletRequest request,
                         @Param("response") HttpServletResponse response,
                         @ApiParam(name = "mid",value = "商品ID",required = true)Integer mid,
                         @ApiParam(name = "skuid",value = "商品ID",required = true)Integer skuid){
        return delmessageservice.delsku(mid, skuid);
    }
}
