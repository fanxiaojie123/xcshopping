package cn.axy.xc.xcitemshowconsumer.controller;

import cn.axy.xc.xcitemshowconsumer.pojo.Messagesolr;
import cn.axy.xc.xcitemshowconsumer.service.Messageseleservice;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Api(value="/upsolrmes", tags="查询商品详情")
@RestController
public class Messageselecontroller {
    @Autowired
    private Messageseleservice messageseleservice;

    /**
     * 全文检索
     * @param messagesolr
     * @return
     * @throws Exception
     */
    @ApiOperation(value="查询商品详情", notes = "查询商品详情")
    @RequestMapping(value = "/list1",method = RequestMethod.GET)
    public String searchProduct(
                                @RequestBody Messagesolr messagesolr ) throws Exception{
        return messageseleservice.searchProduct(messagesolr);
    }
}
