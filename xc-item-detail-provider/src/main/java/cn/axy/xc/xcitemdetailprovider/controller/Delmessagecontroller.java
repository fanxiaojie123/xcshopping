package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.service.Delmessageservice;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(value="/delmessage", tags="删除商品详情")
@RestController
public class Delmessagecontroller {
    @Autowired
    private Delmessageservice dms;
    @ApiOperation(value="删除商品详情", notes = "删除商品详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name="mid", value="商品ID", dataType = "删除商品")
    })
    @RequestMapping(value = "/delmessage",method = RequestMethod.POST)
    public String delmessage(
                             @RequestParam("mid") Integer mid){
        String delmessage = dms.delmessage(mid);
        return delmessage;
    }
}
