package cn.axy.xc.xcitemdetailprovider.service.impl;

import cn.axy.xc.xcitemdetailprovider.dao.MessageMapper;
import cn.axy.xc.xcitemdetailprovider.dao.SearchCategoryMapper;
import cn.axy.xc.xcitemdetailprovider.pojo.Message;
import cn.axy.xc.xcitemdetailprovider.pojo.SearchCategory;
import cn.axy.xc.xcitemdetailprovider.service.Instmessageservice;
import cn.axy.xc.xcitemdetailprovider.service.exit.Messageservicepojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class Instmessageserviceimpl implements Instmessageservice {
    @Autowired
    private MessageMapper mm;
    @Autowired
    private SearchCategoryMapper scm;
    @Override
    public String insertSelective(Messageservicepojo record) {
        Message mes = new Message();
        String count = "";
        String searchCategoryId = record.getSearchCategoryParentId();
        if ("服装".equals(searchCategoryId)){
            mes.setSearchCategoryParentId(1);
        }else if ("家电".equals(searchCategoryId)){
            mes.setSearchCategoryParentId(2);
        }else if ("食品".equals(searchCategoryId)){
            mes.setSearchCategoryParentId(3);
        }else if ("首饰".equals(searchCategoryId)){
            mes.setSearchCategoryParentId(4);
        }else if ("化妆品".equals(searchCategoryId)){
            mes.setSearchCategoryParentId(5);
        }

        SearchCategory categoryId = scm.searchcategoryid(searchCategoryId);
        mes.setSearchCategoryId(categoryId.getSearchCategoryId());
        //获取当前日期
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sf.format(date);
        mes.setmCreated(format);
        mes.setmName(record.getmName());
        mes.setmPoints(record.getmPoints());
        mes.setmPicture(record.getmPicture());
        mes.setsId(record.getSeller());
        mes.setmParticulars(record.getmParticulars());
        int insertSelective = mm.insertSelective(mes);
        if (insertSelective > 0){
            count = "200";
        }else {
            count = "403";
        }
        return count;
    }
}
