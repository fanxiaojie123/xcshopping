package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.pojo.Messagesolr;
import cn.axy.xc.xcitemshowprovider.pojo.Messagesolrpojo;
import cn.axy.xc.xcitemshowprovider.service.Messagesolrservice;
import com.alibaba.fastjson.JSON;
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
import java.util.List;
@Api(value="/upsolrfoo", tags="查询商品详情")
@RestController
public class Messagesolrcontroller {
    @Autowired
    private Messagesolrservice messagesolrservice;
    /**
     * 全文检索
     * @param messagesolr
     * @return
     * @throws Exception
     */
    @ApiOperation(value="查询商品详情", notes = "查询商品详情")
    @RequestMapping(value="/list",method = RequestMethod.POST)
    public String searchProduct(
                                @RequestBody Messagesolr messagesolr ) throws Exception{
        //获取到检索的所有结果
        List<Messagesolrpojo> searchProducts = messagesolrservice.searchProduct(messagesolr);
//        //设置回显内容
//        model.addAttribute("productModels", searchProducts);
//        model.addAttribute("queryString", messagesolr.getQueryString());
//        model.addAttribute("catalog_name", messagesolr.getCatalog_name());
//        model.addAttribute("sort", messagesolr.getSort());
//        model.addAttribute("seller", messagesolr.getSeller());
//        model.addAttribute("points", messagesolr.getPoints());
//        model.addAttribute("type", messagesolr.getType());
        return JSON.toJSONString(searchProducts);
    }
}
