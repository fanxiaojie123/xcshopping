package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.dao.SearchCategoryMapper;
import cn.axy.xc.xcitemdetailprovider.pojo.Message;
import cn.axy.xc.xcitemdetailprovider.pojo.SearchCategory;
import cn.axy.xc.xcitemdetailprovider.service.Instmessageservice;
import cn.axy.xc.xcitemdetailprovider.service.exit.Messageservicepojo;
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

@Api(value="/instmessage", tags="添加商品")
@RestController
public class Instmessagecontroller {
    @Autowired
    private Instmessageservice ims;
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
        Messageservicepojo mes = new Messageservicepojo();
        mes.setmName(mName);
        mes.setmPicture(mPicture);
        mes.setmParticulars(mParticulars);
        mes.setmPoints(mPoints);
        mes.setSearchCategoryId(searchCategoryId);
        mes.setSearchCategoryParentId(searchCategoryParentId);
        mes.setSeller(seller);
        String insertSelective = ims.insertSelective(mes);
        return insertSelective;
    }
}
