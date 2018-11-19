package cn.axy.xc.xcitemdetailprovider.service.impl;

import cn.axy.xc.xcitemdetailprovider.dao.MessageMapper;
import cn.axy.xc.xcitemdetailprovider.pojo.Message;
import cn.axy.xc.xcitemdetailprovider.service.Updmessageservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class Updmessageserviceimpl implements Updmessageservice {
    @Autowired
    private MessageMapper mm;
    @Override
    public String updateByPrimaryKeySelective(Message record) {
        String count = "";
        //获取当前日期
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sf.format(date);
        record.setmUpdated(format);
        int updateByPrimaryKeySelective = mm.updateByPrimaryKeySelective(record);
        if (updateByPrimaryKeySelective > 0){
            count = "200";
        }else {
            count = "403";
        }
        return count;
    }
}
