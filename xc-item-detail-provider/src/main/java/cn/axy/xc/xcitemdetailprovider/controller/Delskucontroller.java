package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.service.Delskuservice;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Api(value="/shopping", tags="删除sku")
@RestController
public class Delskucontroller {
    @Autowired
    private Delskuservice dss;
    @ApiOperation(value="删除sku", notes = "删除sku")
    @ApiImplicitParams({
            @ApiImplicitParam(name="mid", value="商品ID", dataType = "商品ID"),
            @ApiImplicitParam(name="skuid", value="skuID", dataType = "skuID")
    })
    @RequestMapping(value = "/delsku",method = RequestMethod.POST)
    public String delsku(@RequestParam("mid") Integer mid,
                         @RequestParam("skuid") Long skuid){
        String delsku = dss.delsku(mid, skuid);
        return delsku;
    }
}
