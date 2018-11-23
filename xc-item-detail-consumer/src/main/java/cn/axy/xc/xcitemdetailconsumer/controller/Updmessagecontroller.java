package cn.axy.xc.xcitemdetailconsumer.controller;

import cn.axy.xc.xcitemdetailconsumer.pojo.*;
import cn.axy.xc.xcitemdetailconsumer.service.Updmessageservice;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Api(value="/shopping", tags="更新商品信息和SKU接口")
@RestController
public class Updmessagecontroller {
    @Autowired
    private Updmessageservice updmessageservice;

    /**
     * 修改商品
     * @param mes
     * @return
     */
    @ApiOperation(value="更新商品信息接口", notes = "更新商品信息接口")
    @RequestMapping(value = "/updmessage",method = RequestMethod.POST)
    public String updmessage(
                             @ApiParam(name = "mes",value = "商品对象")Message mes){
        return updmessageservice.updmessage(mes);
    }

    /**
     * 修改SKUid
     * @param mid
     * @param skuid
     * @param skuserviceimp
     * @return
     */
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
                         @ApiParam(name="skuserviceimp", value="sku对象")Skuserviceimp skuserviceimp){
        return updmessageservice.updsku(mid, skuid,skuserviceimp);
    }
}
