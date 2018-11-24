package cn.axy.xc.xcorderprovider.controller;

import cn.axy.xc.xcorderprovider.dao.XcOrderODao;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {

    @Autowired
    private static XcOrderODao xcOrderODao;


    public static void main(String[] args) {
        int i = xcOrderODao.selectAll();
        System.out.println(i);


    }
}
