package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.pojo.Messagegetallsolr;
import cn.axy.xc.xcitemshowprovider.pojo.Messagesolrpojo;
import cn.axy.xc.xcitemshowprovider.service.Messagegetallservice;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(value="/upsolrsku", tags="查询全部")
@RestController
public class Messagegetallcontroller {
    @Autowired
    private Messagegetallservice messagegetallservice;
    @ApiOperation(value="查询全部", notes = "查询全部")
    @RequestMapping(value = "/messagegetall",method = RequestMethod.POST)
    public String Messagegetall() throws Exception {
//        Messagegetallsolr messagegetallsolr = new Messagegetallsolr();
//        messagegetallsolr.setmStatus("1");
        List<Messagesolrpojo> messagesolrpojos = messagegetallservice.searchProduct("1");
        return JSON.toJSONString(messagesolrpojos);
    }
}
