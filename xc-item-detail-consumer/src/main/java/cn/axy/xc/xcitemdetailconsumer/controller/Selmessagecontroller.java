package cn.axy.xc.xcitemdetailconsumer.controller;

import cn.axy.xc.xcitemdetailconsumer.service.Selmessageservice;
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
@Api(value="/getall", tags="查询商家商品和SKU接口")
@RestController
public class Selmessagecontroller {
    @Autowired
    private Selmessageservice selmessageservice;

    /**
     * 查看商家所有商品
     * @param request
     * @param response
     * @param sid
     * @return
     */
    @ApiOperation(value="查询商家商品接口", notes = "查询商家商品接口")
    @RequestMapping(value = "/getall",method = RequestMethod.POST)
    public String Messagegetall(@Param("request") HttpServletRequest request,
                                @Param("response") HttpServletResponse response,
                                @ApiParam(name = "sid",value = "商家ID",required = true)Integer sid){
        return selmessageservice.Messagegetall(sid);
    }

    /**
     * 查看商品的所有SKU
     * @param request
     * @param response
     * @param mid
     * @return
     */
    @ApiOperation(value="查询sku接口", notes = "查询sku接口")
    @RequestMapping(value = "/selsku",method = RequestMethod.POST)
    public String selsku(@Param("request") HttpServletRequest request,
                         @Param("response") HttpServletResponse response,
                         @ApiParam(name = "mid",value = "商品ID",required = true)Integer mid){
        return selmessageservice.selsku(mid);
    }
}