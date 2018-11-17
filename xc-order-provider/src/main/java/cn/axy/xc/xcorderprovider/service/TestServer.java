package cn.axy.xc.xcorderprovider.service;

import cn.axy.xc.xcorderprovider.dao.XcOrderODao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.PortUnreachableException;

@Service
public class TestServer {

    @Autowired
    private XcOrderODao xcOrderODao;

     public  String ser(){

         int i = xcOrderODao.selectAll();

         return i+"" ;

     }

}
