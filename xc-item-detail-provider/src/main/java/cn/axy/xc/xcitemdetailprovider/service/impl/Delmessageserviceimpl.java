package cn.axy.xc.xcitemdetailprovider.service.impl;

import cn.axy.xc.xcitemdetailprovider.dao.MessageMapper;
import cn.axy.xc.xcitemdetailprovider.service.Delmessageservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Delmessageserviceimpl implements Delmessageservice {
    @Autowired
    private MessageMapper mm;
    @Override
    public String delmessage(Integer mid) {
        String count = "";
        if (mid > 0){
            int delmessage = mm.delmessage(mid);
            count = "200";
        }else {
            count = "403";
        }

        return count;
    }
}
