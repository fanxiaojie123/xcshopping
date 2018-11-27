package cn.axy.xc.xcitemdetailprovider.service;

public interface Updinvservice {
    String updmessageinv(Integer mid,Integer pcs);
    String updskuinv(Integer mid,Long skuid,Integer pcs);
    void send(String invMQ);
}
