package cn.axy.xc.xcitemdetailprovider.controller;

import cn.axy.xc.xcitemdetailprovider.pojo.Message;
import cn.axy.xc.xcitemdetailprovider.service.Updmessageservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Updmessagecontroller {
    @Autowired
    private Updmessageservice uss;
    @RequestMapping("/updmessage")
    public String updmessage(Message mes){
        String updateByPrimaryKeySelective = uss.updateByPrimaryKeySelective(mes);
        return updateByPrimaryKeySelective;
    }
}
