package cn.axy.xc.xcitemshowconsumer.controller;

import cn.axy.xc.xcitemshowconsumer.service.Skuseleservice;
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

@Api(value="/upsolrsku", tags="查询SKU")
@RestController
public class Skuselecontroller {
    @Autowired
    private Skuseleservice skuseleservice;

    /**
     * 商品SKU
     * @param request
     * @param response
     * @param mid
     * @return
     * @throws Exception
     */
    @ApiOperation(value="查询SKU", notes = "查询SKU")
    @RequestMapping(value = "/scid",method = RequestMethod.POST)
    public String scid(@Param("request") HttpServletRequest request,
                       @Param("response") HttpServletResponse response,
                       @ApiParam(name = "mid",value = "商品ID",required = true)Integer mid) throws Exception{
        return skuseleservice.scid(mid);
    }
}
