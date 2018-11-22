package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.pojo.*;
import cn.axy.xc.xcitemdetailprovider.service.Instskuservice;
import cn.axy.xc.xcitemdetailprovider.service.exit.Skuserviceimp;
import cn.axy.xc.xcitemdetailprovider.util.IDGenerator;
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

@Api(value="/instsku", tags="添加sku接口")
@RestController
public class Instskucontroller {
    @Autowired
    private Instskuservice iss;
    @ApiOperation(value="增加sku车商品", notes = "增加sku商品")
    @RequestMapping(value = "/instsku",method = RequestMethod.POST)
    public String instsku(@Param("request") HttpServletRequest request,
                          @Param("response") HttpServletResponse response,
                          @ApiParam(name = "mid",value = "商品ID",required = true)Integer mid,
                          @ApiParam(name = "skumessage",value = "sku信息")Skuserviceimp skumessage){
        String instsku = iss.instsku(mid,skumessage);
        return instsku;
    }
}
