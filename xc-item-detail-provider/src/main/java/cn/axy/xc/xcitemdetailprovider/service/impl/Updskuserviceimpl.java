package cn.axy.xc.xcitemdetailprovider.service.impl;

import cn.axy.xc.xcitemdetailprovider.dao.*;
import cn.axy.xc.xcitemdetailprovider.pojo.*;
import cn.axy.xc.xcitemdetailprovider.service.Updskuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Updskuserviceimpl implements Updskuservice {
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
    public String updateByPrimaryKeySelectiveapp(Appliances record) {
        int updateByPrimaryKeySelective = am.updateByPrimaryKeySelective(record);
        if (updateByPrimaryKeySelective < 0){
            count = "403";
        }else {
            count = "200";
        }
        return count;
    }

    @Override
    public String updateByPrimaryKeySelectiveclo(Clothing record) {
        int updateByPrimaryKeySelective = cm.updateByPrimaryKeySelective(record);
        if (updateByPrimaryKeySelective < 0){
            count = "403";
        }else {
            count = "200";
        }
        return count;
    }

    @Override
    public String updateByPrimaryKeySelectivecos(Cosmetics record) {
        int updateByPrimaryKeySelective = com.updateByPrimaryKeySelective(record);
        if (updateByPrimaryKeySelective < 0){
            count = "403";
        }else {
            count = "200";
        }
        return count;
    }

    @Override
    public String updateByPrimaryKeySelectivefoo(Food record) {
        int updateByPrimaryKeySelective = fm.updateByPrimaryKeySelective(record);
        if (updateByPrimaryKeySelective < 0){
            count = "403";
        }else {
            count = "200";
        }
        return count;
    }

    @Override
    public String updateByPrimaryKeySelectiveorn(Ornaments record) {
        int updateByPrimaryKeySelective = om.updateByPrimaryKeySelective(record);
        if (updateByPrimaryKeySelective < 0){
            count = "403";
        }else {
            count = "200";
        }
        return count;
    }

    @Override
    public String updsku(Integer mid, Integer skuid, Appliances app, Clothing clo, Cosmetics cos, Food foo, Ornaments orn) {
        if (mid != null){
            Integer midorn = mm.midorn(mid);
            if (midorn != null){
                if (midorn == 1){
                    count = updateByPrimaryKeySelectiveclo(clo);
                }else if (midorn == 2){
                    count = updateByPrimaryKeySelectiveapp(app);
                }else if (midorn == 3){
                    count = updateByPrimaryKeySelectivefoo(foo);
                }else if (midorn == 4){
                    count = updateByPrimaryKeySelectiveorn(orn);
                }else if (midorn == 5){
                    count = updateByPrimaryKeySelectivecos(cos);
                }else {
                    count = "403";
                }
            }else {

            }

        }else {
            count = "403";
        }
        return count;
    }
}
