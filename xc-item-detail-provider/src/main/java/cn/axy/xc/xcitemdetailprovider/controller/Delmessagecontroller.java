package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.service.Delmessageservice;
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

@Api(value="/delmessage", tags="删除商品详情")
@RestController
public class Delmessagecontroller {
    @Autowired
    private Delmessageservice dms;
    @ApiOperation(value="删除商品详情", notes = "删除商品详情")
    @RequestMapping(value = "/delmessage",method = RequestMethod.POST)
    public String delmessage(@Param("request") HttpServletRequest request,
                             @Param("response") HttpServletResponse response, @ApiParam(name = "mid",value = "商品ID",required = true)Integer mid){
        String delmessage = dms.delmessage(mid);
        return delmessage;
    }
}
