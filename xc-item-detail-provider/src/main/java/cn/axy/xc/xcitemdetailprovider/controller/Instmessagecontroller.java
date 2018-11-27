package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.dao.SearchCategoryMapper;
import cn.axy.xc.xcitemdetailprovider.pojo.Message;
import cn.axy.xc.xcitemdetailprovider.pojo.SearchCategory;
import cn.axy.xc.xcitemdetailprovider.service.Instmessageservice;
import cn.axy.xc.xcitemdetailprovider.service.exit.Messageservicepojo;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(value="/instmessage", tags="添加商品")
@RestController
public class Instmessagecontroller {
    @Autowired
    private Instmessageservice ims;
    @ApiOperation(value="添加商品", notes = "添加商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name="mName", value="商品名称", dataType = "商品名称"),
            @ApiImplicitParam(name="mPicture", value="商品图片", dataType = "商品图片"),
            @ApiImplicitParam(name="mParticulars", value="商品参数", dataType = "商品参数"),
            @ApiImplicitParam(name="mPoints", value="商品卖点", dataType = "商品卖点"),
            @ApiImplicitParam(name="searchCategoryId", value="商品小类", dataType = "商品小类"),
            @ApiImplicitParam(name="searchCategoryParentId", value="商品大类", dataType = "商品大类"),
            @ApiImplicitParam(name="seller", value="商家ID", dataType = "商家ID"),
            @ApiImplicitParam(name="mPrice", value="单价", dataType = "单价"),
            @ApiImplicitParam(name="mCount", value="总库存", dataType = "总库存")
    })
    @RequestMapping(value = "/instmessage",method = RequestMethod.POST)
    public String instmessage(
                              @RequestParam("mName") String mName ,
                              @RequestParam("mPicture") String mPicture,
                              @RequestParam("mParticulars") String mParticulars,
                              @RequestParam("mPoints") String mPoints,
                              @RequestParam("searchCategoryId") String searchCategoryId,
                              @RequestParam("searchCategoryParentId") String searchCategoryParentId,
                              @RequestParam("seller") Integer seller,
                              @RequestParam("mPrice") Double mPrice,
                              @RequestParam("mCount") Double mCount){
        Messageservicepojo mes = new Messageservicepojo();
        mes.setmName(mName);
        mes.setmPicture(mPicture);
        mes.setmParticulars(mParticulars);
        mes.setmPoints(mPoints);
        mes.setSearchCategoryId(searchCategoryId);
        mes.setSearchCategoryParentId(searchCategoryParentId);
        mes.setSeller(seller);
        mes.setmCount(mCount);
        mes.setmPrice(mPrice);
        String insertSelective = ims.insertSelective(mes);
        return insertSelective;
    }
}
