package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.Judgeskuservice;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(value="/upsolrsku", tags="查询SKU")
@RestController
public class Judgeskucontroller {
    @Autowired
    private Judgeskuservice judgeskuservice;
    /**
     * 商品SKU
     * @param mid
     * @return
     * @throws Exception
     */
    @ApiOperation(value="查询SKU", notes = "查询SKU")
    @ApiImplicitParams({
            @ApiImplicitParam(name="mid", value="商品ID", dataType = "Long")
    })
    @RequestMapping(value = "/scid",method = RequestMethod.POST)
    public String scid(
                       @RequestParam("mid")Integer mid) throws Exception {
        String scid = judgeskuservice.scid(mid);
        return scid;
    }
}
