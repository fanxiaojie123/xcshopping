package cn.axy.xc.xcitemshowconsumer.controller;

import cn.axy.xc.xcitemshowconsumer.service.Skumessageservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Api(value="/skuidall", tags="通过SKU查询商品详情")
@RestController
public class Skumessageconroller {
    @Autowired
    private Skumessageservice skumessageservice;
    @ApiOperation(value="查询商品详情", notes = "通过SKUID查询商品详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name="skuid", value="skuID", dataType = "Long")
    })
    @RequestMapping(value = "/skuidall",method = RequestMethod.POST)
    public String skuidall(
            @RequestParam("skuid")Long skuid) throws Exception {
        String skuservice = skumessageservice.skuidall(skuid);
        return skuservice;
    }
}
