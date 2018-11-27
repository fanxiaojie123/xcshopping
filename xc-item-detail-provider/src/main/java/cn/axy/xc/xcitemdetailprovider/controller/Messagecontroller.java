package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.service.Messageservice;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(value="/getall", tags="查询商家商品接口")
@RestController
public class Messagecontroller {
    @Autowired
    private Messageservice ms;
    @ApiOperation(value="查询商家商品接口", notes = "查询商家商品接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name="sid", value="商家ID", dataType = "商家 ID")
    })
    @RequestMapping(value = "/getall",method = RequestMethod.POST)
    public String Messagegetall(
                                @RequestParam("sid")Integer sid){
        String sellgetall = ms.sellgetall(sid);
        return sellgetall;
    }
    @RequestMapping("/a")
    public String aaa(){
        return "132";
    }
}
