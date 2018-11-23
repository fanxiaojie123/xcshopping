package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.service.Selskuservice;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(value="/selsku", tags="查询sku接口")
@RestController
public class Selskucontroller {
    @Autowired
    private Selskuservice sss;
    @ApiOperation(value="查询sku接口", notes = "查询sku接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name="mid", value="商品ID", dataType = "商品ID")
    })
    @RequestMapping(value = "/selsku",method = RequestMethod.POST)
    public String selsku(@Param("request") HttpServletRequest request,
                         @Param("response") HttpServletResponse response,
                         @RequestParam("mid")Integer mid){
        return sss.selsku(mid);
    }
}
