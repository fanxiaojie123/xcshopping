package cn.axy.xc.xcitemdetailprovider.service;

public interface Delskuservice {
    String deleteByPrimaryKeyapp(Long aId);
    String deleteByPrimaryKeyclo(Long cId);
    String deleteByPrimaryKeycos(Long coId);
    String deleteByPrimaryKeyfoo(Long fId);
    String deleteByPrimaryKeyorn(Long oId);
    String delsku(Integer mid,Long skuid);
}
