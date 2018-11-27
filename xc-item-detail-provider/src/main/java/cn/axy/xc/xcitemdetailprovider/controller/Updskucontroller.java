package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.pojo.*;
import cn.axy.xc.xcitemdetailprovider.service.Updskuservice;
import cn.axy.xc.xcitemdetailprovider.service.exit.Skuserviceimp;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(value="/updsku", tags="更新sku接口")
@RestController
public class Updskucontroller {
    @Autowired
    private Updskuservice uss;
    @ApiOperation(value="更新sku", notes = "更新sku")
    @ApiImplicitParams({
            @ApiImplicitParam(name="mid", value="商品ID", dataType = "ShoppingCart")
            ,@ApiImplicitParam(name="skuid", value="skuID", dataType = "java.lang.Long")
           // ,@ApiImplicitParam(name="skuserviceimp", value="sku对象")

    })
    @RequestMapping(value = "/updsku",method = RequestMethod.POST)
    public String updsku(
                        @RequestParam("mid") Integer mid,
                         @RequestParam("skuid")Long skuid,
                         @RequestBody Skuserviceimp skuserviceimp){
        System.out.println(skuid);
        String updsku = uss.updsku(mid, skuid, skuserviceimp);

        return updsku;
    }
}
