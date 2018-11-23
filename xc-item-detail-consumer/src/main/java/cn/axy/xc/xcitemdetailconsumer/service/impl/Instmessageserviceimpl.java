package cn.axy.xc.xcitemdetailconsumer.service.impl;

import cn.axy.xc.xcitemdetailconsumer.pojo.*;
import cn.axy.xc.xcitemdetailconsumer.service.InstMessageservice;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class Instmessageserviceimpl implements InstMessageservice {
    @Override
    public String instmessage(String mName, String mPicture, String mParticulars, String mPoints, String searchCategoryId, String searchCategoryParentId, Integer seller,Double mPrice, Double mCount) {
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }

    @Override
    public String instsku(Integer mid, Skuserviceimp skuserviceimp) {
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }
}
