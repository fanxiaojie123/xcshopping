package cn.axy.xc.xcitemdetailprovider.service.impl;

import cn.axy.xc.xcitemdetailprovider.dao.*;
import cn.axy.xc.xcitemdetailprovider.service.Delskuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Delskuserviceimpl implements Delskuservice {
    @Autowired
    private AppliancesMapper am;
    @Autowired
    private ClothingMapper cm;
    @Autowired
    private CosmeticsMapper com;
    @Autowired
    private FoodMapper fm;
    @Autowired
    private OrnamentsMapper om;
    @Autowired
    private MessageMapper mm;
    String count = "";
    @Override
    public String deleteByPrimaryKeyapp(Integer aId) {
        if (aId != null){
            int deleteByPrimaryKey = am.deleteByPrimaryKey(aId);
            if (deleteByPrimaryKey > 0){
                count = "200";
            }else{
                count = "403";
            }
        }else {
            count = "403";
        }
        return count;
    }

    @Override
    public String deleteByPrimaryKeyclo(Integer cId) {
        if (cId != null){
            int deleteByPrimaryKey = cm.deleteByPrimaryKey(cId);
            if (deleteByPrimaryKey > 0){
                count = "200";
            }else{
                count = "403";
            }
        }else {
            count = "403";
        }
        return count;
    }

    @Override
    public String deleteByPrimaryKeycos(Integer coId) {
        if (coId != null){
            int deleteByPrimaryKey = com.deleteByPrimaryKey(coId);
            if (deleteByPrimaryKey > 0){
                count = "200";
            }else{
                count = "403";
            }
        }else {
            count = "403";
        }
        return count;
    }

    @Override
    public String deleteByPrimaryKeyfoo(Integer fId) {
        if (fId != null){
            int deleteByPrimaryKey = fm.deleteByPrimaryKey(fId);
            if (deleteByPrimaryKey > 0){
                count = "200";
            }else{
                count = "403";
            }
        }else {
            count = "403";
        }
        return count;
    }

    @Override
    public String deleteByPrimaryKeyorn(Integer oId) {
        if (oId != null){
            int deleteByPrimaryKey = om.deleteByPrimaryKey(oId);
            if (deleteByPrimaryKey > 0){
                count = "200";
            }else{
                count = "403";
            }
        }else {
            count = "403";
        }
        return count;
    }

    @Override
    public String delsku(Integer mid , Integer skuid) {
        if (mid == null){
            count = "403";
        }else{
            int midorn = mm.midorn(mid);
            if (midorn == 1){
                deleteByPrimaryKeyclo(skuid);
            }else if (midorn == 2){
                deleteByPrimaryKeyapp(skuid);
            }else if (midorn == 3){
                deleteByPrimaryKeyfoo(skuid);
            }else if (midorn == 4){
                deleteByPrimaryKeyorn(skuid);
            }else if (midorn == 5){
                deleteByPrimaryKeycos(skuid);
            }else {
                count = "403";
            }
        }
        return count;
    }
}
