package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.SkuidAll;
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

@Api(value="/upsolrfoo", tags="通过SKUID查询商品详情")
@RestController
public class SkuidAllcontroller {
    @Autowired
    private SkuidAll skuidAll;
    @ApiOperation(value="查询商品详情", notes = "通过SKUID查询商品详情")
    @RequestMapping(value = "/skuidall",method = RequestMethod.POST)
    public String skuidall(@Param("request") HttpServletRequest request,
                           @Param("response") HttpServletResponse response,
                            @ApiParam(name = "skuid",value = "查询输入字段")Long skuid) throws Exception {
        String skuservice = skuidAll.Skuservice(skuid);
        System.out.println(skuservice);
        return skuservice;
    }
}
