package cn.axy.xc.xcitemdetailconsumer.service.impl;

import cn.axy.xc.xcitemdetailconsumer.pojo.*;
import cn.axy.xc.xcitemdetailconsumer.service.InstMessageservice;
import org.springframework.stereotype.Component;

@Component
public class Instmessageserviceimpl implements InstMessageservice {
    @Override
    public String instmessage(String mName, String mPicture, String mParticulars, String mPoints, String searchCategoryId, String searchCategoryParentId, Integer seller) {
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }

    @Override
    public String instsku(Integer mid, Appliances app, Clothing clo, Cosmetics cos, Food foo, Ornaments orn) {
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }
}
