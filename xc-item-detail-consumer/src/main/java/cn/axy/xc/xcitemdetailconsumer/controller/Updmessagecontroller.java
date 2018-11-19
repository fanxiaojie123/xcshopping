package cn.axy.xc.xcitemdetailconsumer.controller;

import cn.axy.xc.xcitemdetailconsumer.pojo.*;
import cn.axy.xc.xcitemdetailconsumer.service.Updmessageservice;
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
@Api(value="/shopping", tags="更新商品信息和SKU接口")
@RestController
public class Updmessagecontroller {
    @Autowired
    private Updmessageservice updmessageservice;

    /**
     * 修改商品
     * @param request
     * @param response
     * @param mes
     * @return
     */
    @ApiOperation(value="更新商品信息接口", notes = "更新商品信息接口")
    public String updmessage(@Param("request") HttpServletRequest request,
                             @Param("response") HttpServletResponse response,
                             @ApiParam(name = "mes",value = "商品对象")Message mes){
        return updmessageservice.updmessage(mes);
    }

    /**
     * 修改SKU
     * @param request
     * @param response
     * @param mid
     * @param skuid
     * @param app
     * @param clo
     * @param cos
     * @param foo
     * @param orn
     * @return
     */
    @ApiOperation(value="更新sku", notes = "更新sku")
    @RequestMapping(value = "/updsku",method = RequestMethod.POST)
    public String updsku(@Param("request") HttpServletRequest request,
                         @Param("response") HttpServletResponse response,@ApiParam(name = "mid",value = "商品ID",required = true)Integer mid,
                         @ApiParam(name = "skuid",value = "skuID",required = true)Integer skuid,
                         @ApiParam(name = "app",value = "家电对象")Appliances app,
                         @ApiParam(name = "clo",value = "服装对象")Clothing clo,
                         @ApiParam(name = "cos",value = "化妆品对象")Cosmetics cos,
                         @ApiParam(name = "foo",value = "食品对象")Food foo,
                         @ApiParam(name = "orn",value = "首饰对象")Ornaments orn){
        return updmessageservice.updsku(mid, skuid, app, clo, cos, foo, orn);
    }
}
