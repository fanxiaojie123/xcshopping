package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.service.Updinvservice;
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

@Api(value="/Messageinv", tags="增减库存接口")
@RestController
public class Messageinvcontroller {
    @Autowired
    private Updinvservice updinvservice;
    String count = "";
    @ApiOperation(value="增减总库存接口", notes = "增减总库存接口")
    @RequestMapping(value = "/updmessageinv",method = RequestMethod.POST)
    public String updmessageinv(@Param("request") HttpServletRequest request,
                                @Param("response") HttpServletResponse response,
                                @ApiParam(name = "mid",value = "品家ID",required = true)Integer mid,
                                @ApiParam(name = "psc",value = "购买的数量",required = true)Integer psc){
        count = updinvservice.updmessageinv(mid,psc);
        return count;
    }
    @ApiOperation(value="增减sku库存接口", notes = "增减sku库存接口")
    @RequestMapping(value = "/updskuinv",method = RequestMethod.POST)
    public String updskuinv(@Param("request") HttpServletRequest request,
                            @Param("response") HttpServletResponse response,
                            @ApiParam(name = "mid",value = "商品ID",required = true)Integer mid,
                            @ApiParam(name = "skuid",value = "SKUID",required = true)Integer skuid,
                            @ApiParam(name = "psc",value = "购买数量",required = true)Integer psc){
        count = updinvservice.updskuinv(mid,skuid,psc);
        return count;
    }
}
