package cn.axy.xc.xcitemdetailprovider.service;

public interface Delskuservice {
    String deleteByPrimaryKeyapp(Integer aId);
    String deleteByPrimaryKeyclo(Integer cId);
    String deleteByPrimaryKeycos(Integer coId);
    String deleteByPrimaryKeyfoo(Integer fId);
    String deleteByPrimaryKeyorn(Integer oId);
    String delsku(Integer mid,Integer skuid);
}
