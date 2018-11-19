package cn.axy.xc.xcitemshowconsumer.controller;

import cn.axy.xc.xcitemshowconsumer.pojo.Messagesolr;
import cn.axy.xc.xcitemshowconsumer.service.Messageseleservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
     * @param request
     * @param response
     * @param messagesolr
     * @param model
     * @return
     * @throws Exception
     */
    @ApiOperation(value="查询商品详情", notes = "查询商品详情")
    public String searchProduct(@Param("request") HttpServletRequest request,
                                @Param("response") HttpServletResponse response,
                                @ApiParam(name = "messagesolr",value = "查询输入字段")Messagesolr messagesolr ,
                                @ApiParam(name = "model",value = "页面数据")Model model) throws Exception{
        return messageseleservice.searchProduct(messagesolr,model);
    }
}
