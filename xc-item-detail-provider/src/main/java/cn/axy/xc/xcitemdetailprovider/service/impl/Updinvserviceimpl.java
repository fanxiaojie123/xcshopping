package cn.axy.xc.xcitemdetailprovider.service.impl;

import cn.axy.xc.xcitemdetailprovider.dao.*;
import cn.axy.xc.xcitemdetailprovider.service.Updinvservice;
import org.springframework.beans.factory.annotation.Autowired;

public class Updinvserviceimpl implements Updinvservice {
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
    Double number;
    @Override
    public String updmessageinv(Integer mid) {
        if (mid != null){
            Double selmessageinv = mm.selmessageinv(mid);
            if (selmessageinv > 0){
                number = selmessageinv - 1;
                int updmessageinv = mm.updmessageinv(number, mid);
                if (updmessageinv > 0){
                    count = "200";
                }else {
                    count = "500";
                }
            }else {
                count = "没货500";
            }
        }else {
            count = "500";
        }
        return count;
    }

    @Override
    public String updskuinv(Integer mid, Integer skuid) {
        if (mid != null){
            Integer midorn = mm.midorn(mid);
            if (midorn == 1){
                Double selcloinv = cm.selcloinv(mid, skuid);
                if (selcloinv > 0){
                    number = selcloinv -1;
                    cm.updcloinv(number,mid,skuid);
                }else {
                    count = "500";
                }
            }else if (midorn == 2){
                Double selappinv = am.selappinv(mid, skuid);
                if (selappinv > 0){
                    number = selappinv - 1;
                    am.updappinv(number,mid,skuid);
                }else {
                    count = "500";
                }
            }else if (midorn == 3){
                Double selfooinv = fm.selfooinv(mid, skuid);
                if (selfooinv > 0){
                    number = selfooinv - 1;
                    fm.updfooinv(number,mid,skuid);
                }else {
                    count = "500";
                }
            }else if (midorn == 4){
                Double selorninv = om.selorninv(mid, skuid);
                if (selorninv > 0){
                    number = selorninv - 1;
                    om.updorninv(number,mid,skuid);
                }else {
                    count = "500";
                }
            }else if (midorn == 5){
                Double selcosinv = com.selcosinv(mid, skuid);
                if (selcosinv > 0 ){
                    number = selcosinv - 1;
                    com.updcosinv(number,mid,skuid);
                }else {
                    count = "500";
                }
            }else {
                count = "500";
            }
        }else {
            count = "500";
        }
        return count;
    }
}
