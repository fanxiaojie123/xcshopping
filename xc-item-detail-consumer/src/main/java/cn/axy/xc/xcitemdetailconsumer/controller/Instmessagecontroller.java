package cn.axy.xc.xcitemdetailconsumer.controller;

import cn.axy.xc.xcitemdetailconsumer.pojo.*;
import cn.axy.xc.xcitemdetailconsumer.service.InstMessageservice;
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
@Api(value="/instmessage", tags="添加商品和SKU")
@RestController
public class Instmessagecontroller {
    @Autowired
    private InstMessageservice instMessageservice;
    /**
     * 添加商品
     * @param request
     * @param response
     * @param mName
     * @param mPicture
     * @param mParticulars
     * @param mPoints
     * @param searchCategoryId
     * @param searchCategoryParentId
     * @param seller
     * @return
     */
    @ApiOperation(value="添加商品", notes = "添加商品")
    @RequestMapping(value = "/instmessage",method = RequestMethod.POST)
    public String instmessage(@Param("request") HttpServletRequest request,
                              @Param("response") HttpServletResponse response,
                              @ApiParam(name = "mName",value = "商品名称",required = true)String mName ,
                              @ApiParam(name = "mPicture",value = "商品图片",required = true)String mPicture,
                              @ApiParam(name = "mParticulars",value = "商品参数",required = true)String mParticulars,
                              @ApiParam(name = "mPoints",value = "商品卖点",required = true)String mPoints,
                              @ApiParam(name = "searchCategoryId",value = "商品小类",required = true)String searchCategoryId,
                              @ApiParam(name = "searchCategoryParentId",value = "商品大类",required = true)String searchCategoryParentId,
                              @ApiParam(name = "seller",value = "商家ID",required = true)Integer seller){
        return instMessageservice.instmessage(mName,mPicture,mParticulars,mPoints,searchCategoryId,searchCategoryParentId,seller);
    }

    /**
     * 添加SKU
     * @param request
     * @param response
     * @param mid
     * @param app
     * @param clo
     * @param cos
     * @param foo
     * @param orn
     * @return
     */
    @ApiOperation(value="增加sku车商品", notes = "增加sku商品")
    @RequestMapping(value = "/instsku",method = RequestMethod.POST)
    public String instsku(@Param("request") HttpServletRequest request,
                          @Param("response") HttpServletResponse response,
            @ApiParam(name = "mid",value = "商品ID",required = true)Integer mid,
            @ApiParam(name = "app",value = "家电对象")Appliances app,
            @ApiParam(name = "clo",value = "服装对象")Clothing clo,
            @ApiParam(name = "cos",value = "化妆品对象")Cosmetics cos,
            @ApiParam(name = "foo",value = "食品对象")Food foo,
            @ApiParam(name = "orn",value = "首饰对象")Ornaments orn){
        return instMessageservice.instsku(mid, app, clo, cos, foo, orn);
    }
}
