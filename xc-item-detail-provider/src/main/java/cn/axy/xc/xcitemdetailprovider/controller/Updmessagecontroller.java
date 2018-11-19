package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.pojo.Message;
import cn.axy.xc.xcitemdetailprovider.service.Updmessageservice;
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

@Api(value="/shopping", tags="更新商品信息接口")
@RestController
public class Updmessagecontroller {
    @Autowired
    private Updmessageservice uss;
    @ApiOperation(value="更新商品信息接口", notes = "更新商品信息接口")
    @RequestMapping(value = "/updmessage",method = RequestMethod.POST)
    public String updmessage(@Param("request") HttpServletRequest request,
                             @Param("response") HttpServletResponse response,
                             @ApiParam(name = "mes",value = "商品对象")Message mes){
        String updateByPrimaryKeySelective = uss.updateByPrimaryKeySelective(mes);
        return updateByPrimaryKeySelective;
    }
}
