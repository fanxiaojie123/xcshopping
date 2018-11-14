package cn.axy.xc.xcitemdetailprovider.service.impl;

import cn.axy.xc.xcitemdetailprovider.dao.*;
import cn.axy.xc.xcitemdetailprovider.pojo.*;
import cn.axy.xc.xcitemdetailprovider.service.Selskuservice;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Selskuserviceimpl implements Selskuservice {
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
    public String selfoo(Integer mid) {
        List<Food> selfoo = fm.selfoo(mid);
        if (selfoo == null){
            count = "403";
        }else {
            count = JSON.toJSONString(selfoo);
            System.out.println(count+"foo");
        }
        return count;
    }

    @Override
    public String selapp(Integer mid) {
        List<Appliances> selapp = am.selapp(mid);
        if (selapp == null){
            count = "403";
        }else{
            count = JSON.toJSONString(selapp);
            System.out.println(count+"app");
        }
        return count;
    }

    @Override
    public String selclo(Integer mid) {
        List<Clothing> selclo = cm.selclo(mid);
        System.out.println(selclo);
        if (selclo == null){
            count = "403";
        }else {
            count = JSON.toJSONString(selclo);
            System.out.println(count+"clo");
        }
        return count;
    }

    @Override
    public String selcos(Integer mid) {
        List<Cosmetics> selcos = com.selcos(mid);
        if (selcos == null){
            count = "403";
        }else {
            count = JSON.toJSONString(selcos);
            System.out.println(count+"cos");
        }
        return count;
    }

    @Override
    public String selorn(Integer mid) {
        List<Ornaments> selorn = om.selorn(mid);
        if (selorn == null){
            count = "403";
        }else {
            count = JSON.toJSONString(selorn);
            System.out.println(count+"orn");
        }
        return count;
    }

    @Override
    public String selsku(Integer mid) {
        if (mid == null){
            count = "403";
        }else {
            Integer midorn = mm.midorn(mid);
            if(midorn != null){
                if (midorn == 2){
                    count = selapp(mid);
                    System.out.println(count + "123");
                }else if (midorn == 1){
                    count = selclo(mid);
                    System.out.println(count + "798");
                }else if (midorn == 5){
                    count = selcos(mid);
                }else if (midorn == 3){
                    count = selfoo(mid);
                }else if (midorn == 4){
                    count = selorn(mid);
                }else {
                    count = "403";
                }
            } else{
                count = "403";
            }
        }
        return count;
    }
}
