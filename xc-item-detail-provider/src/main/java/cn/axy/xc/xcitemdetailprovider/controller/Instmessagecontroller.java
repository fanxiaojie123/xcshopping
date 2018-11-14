package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.dao.SearchCategoryMapper;
import cn.axy.xc.xcitemdetailprovider.pojo.Message;
import cn.axy.xc.xcitemdetailprovider.pojo.SearchCategory;
import cn.axy.xc.xcitemdetailprovider.service.Instmessageservice;
import cn.axy.xc.xcitemdetailprovider.service.exit.Messageservicepojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Instmessagecontroller {
    @Autowired
    private Instmessageservice ims;
    @RequestMapping("/instmessage")
    public String instmessage(String mName ,String mPicture,String mParticulars,String mPoints,String searchCategoryId,String searchCategoryParentId,Integer seller){
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
