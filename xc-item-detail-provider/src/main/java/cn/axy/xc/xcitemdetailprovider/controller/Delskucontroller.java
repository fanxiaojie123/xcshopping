package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.service.Delskuservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Api(value="/shopping", tags="删除sku")
@RestController
public class Delskucontroller {
    @Autowired
    private Delskuservice dss;
    @ApiOperation(value="删除sku", notes = "删除sku")
    @RequestMapping(value = "/delsku",method = RequestMethod.POST)
    public String delsku(@ApiParam(name = "mid",value = "商品ID",required = true)Integer mid,
                         @ApiParam(name = "skuid",value = "商品ID",required = true)Integer skuid){
        String delsku = dss.delsku(mid, skuid);
        return delsku;
    }
}
