package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.pojo.Messagesolr;
import cn.axy.xc.xcitemshowprovider.pojo.Messagesolrpojo;
import cn.axy.xc.xcitemshowprovider.service.Messagesolrservice;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
@Api(value="/upsolrfoo", tags="查询商品详情")
@RestController
public class Messagesolrcontroller {
    @Autowired
    private Messagesolrservice messagesolrservice;
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
    @RequestMapping(value="/list",method = RequestMethod.POST)
    public String searchProduct(@Param("request") HttpServletRequest request,
                                @Param("response") HttpServletResponse response,
                                @ApiParam(name = "messagesolr",value = "查询输入字段")Messagesolr messagesolr ,
                                @ApiParam(name = "model",value = "页面数据")Model model) throws Exception{
        //获取到检索的所有结果
        List<Messagesolrpojo> searchProducts = messagesolrservice.searchProduct(messagesolr);
        //设置回显内容
        model.addAttribute("productModels", searchProducts);
        model.addAttribute("queryString", messagesolr.getQueryString());
        model.addAttribute("catalog_name", messagesolr.getCatalog_name());
        model.addAttribute("sort", messagesolr.getSort());
        model.addAttribute("seller", messagesolr.getSeller());
        model.addAttribute("points", messagesolr.getPoints());
        model.addAttribute("type", messagesolr.getType());
        return "product_list";
    }
}
