package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.service.Updinvservice;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    @ApiImplicitParams({
            @ApiImplicitParam(name="mid", value="商品ID", dataType = "商品ID"),
            @ApiImplicitParam(name="psc", value="购买的数量", dataType = "购买的数量")
    })
    @RequestMapping(value = "/updmessageinv",method = RequestMethod.POST)
    public String updmessageinv(@Param("request") HttpServletRequest request,
                                @Param("response") HttpServletResponse response,
                                @RequestParam("mid")Integer mid,
                                @RequestParam("psc")Integer psc){
        count = updinvservice.updmessageinv(mid,psc);
        return count;
    }
    @ApiOperation(value="增减sku库存接口", notes = "增减sku库存接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name="mid", value="商品ID", dataType = "商品ID"),
            @ApiImplicitParam(name="skuid", value="SKUID", dataType = "SKUID"),
            @ApiImplicitParam(name="psc", value="购买的数量", dataType = "购买的数量")
    })
    @RequestMapping(value = "/updskuinv",method = RequestMethod.POST)
    public String updskuinv(@Param("request") HttpServletRequest request,
                            @Param("response") HttpServletResponse response,
                            @RequestParam("mid")Integer mid,
                            @RequestParam("skuid")Long skuid,
                            @RequestParam("psc")Integer psc){
        count = updinvservice.updskuinv(mid,skuid,psc);
        return count;
    }
}
