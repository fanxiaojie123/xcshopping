package cn.axy.xc.xcitemdetailprovider.service.impl;

import cn.axy.xc.xcitemdetailprovider.dao.*;
import cn.axy.xc.xcitemdetailprovider.pojo.*;
import cn.axy.xc.xcitemdetailprovider.service.Instskuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Instskuserviceimpl implements Instskuservice {
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
    public String insertSelectiveapp(Appliances record) {
        int insertSelective = am.insertSelective(record);
        if (insertSelective > 0){
            count = "200";
        }else {
            count = "403";
        }
        return count;
    }

    @Override
    public String insertSelectiveclo(Clothing record) {
        int insertSelective = cm.insertSelective(record);
        if (insertSelective > 0){
            count = "200";
        }else {
            count = "403";
        }
        return count;
    }

    @Override
    public String insertSelectivecos(Cosmetics record) {
        int insertSelective = com.insertSelective(record);
        if (insertSelective > 0){
            count = "200";
        }else {
            count = "403";
        }
        return count;
    }

    @Override
    public String insertSelectivefoo(Food record) {
        int insertSelective = fm.insertSelective(record);
        if (insertSelective > 0){
            count = "200";
        }else {
            count = "403";
        }
        return count;
    }

    @Override
    public String insertSelectiveon(Ornaments record) {
        int insertSelective = om.insertSelective(record);
        if (insertSelective > 0){
            count = "200";
        }else {
            count = "403";
        }
        return count;
    }

    @Override
    public String instsku(Integer mid, Appliances app, Clothing clo, Cosmetics cos, Food foo, Ornaments orn) {
        if (mid != null){
            Integer midorn = mm.midorn(mid);
            if (midorn != null){
                if (midorn == 1){
                    clo.setmId(mid);
                    insertSelectiveclo(clo);
                }else if (midorn == 2){
                    app.setmId(mid);
                    insertSelectiveapp(app);
                }else if (midorn == 3){
                    insertSelectivefoo(foo);
                    foo.setmId(mid);
                }else if (midorn == 4){
                    insertSelectiveon(orn);
                    orn.setmId(mid);
                }else if (midorn == 5){
                    insertSelectivecos(cos);
                    cos.setmId(mid);
                }else {
                    count = "403";
                }

            }else {
                count = "403";
            }
        }else {
            count = "403";
        }
        return count;
    }
}
