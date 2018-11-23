package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.pojo.*;
import cn.axy.xc.xcitemdetailprovider.service.Instskuservice;
import cn.axy.xc.xcitemdetailprovider.service.exit.Skuserviceimp;
import cn.axy.xc.xcitemdetailprovider.util.IDGenerator;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(value="/instsku", tags="添加sku接口")
@RestController
public class Instskucontroller {
    @Autowired
    private Instskuservice iss;
    @ApiOperation(value="增加sku车商品", notes = "增加sku商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name="mid", value="商品ID", dataType = "商品ID")
    })
    @RequestMapping(value = "/instsku",method = RequestMethod.POST)
    public String instsku(@Param("request") HttpServletRequest request,
                          @Param("response") HttpServletResponse response,
                          @RequestParam("mid")Integer mid,
                          @ApiParam(name = "skumessage",value = "sku信息")Skuserviceimp skumessage){
        String instsku = iss.instsku(mid,skumessage);
        return instsku;
    }
}
