package cn.axy.xc.xcitemdetailprovider.service.impl;

import cn.axy.xc.xcitemdetailprovider.dao.MessageMapper;
import cn.axy.xc.xcitemdetailprovider.pojo.Message;
import cn.axy.xc.xcitemdetailprovider.service.Messageservice;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class Messageserviceimpl implements Messageservice {
    @Autowired
    private MessageMapper mm;
    @Override
    public String sellgetall(Integer sid) {
        String count = "";
        if (sid ==null){
            count = "没有此商品";
        }else{
            List<Message> sellgetall = mm.sellgetall(sid);
            count = JSON.toJSONString(sellgetall);
        }

        return count;
    }
}
