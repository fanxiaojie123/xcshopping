package cn.axy.xc.xcorderprovider.dao;

import cn.axy.xc.xcorderprovider.pojo.XcOrderOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface XcOrderO {

    int selectAll();
}