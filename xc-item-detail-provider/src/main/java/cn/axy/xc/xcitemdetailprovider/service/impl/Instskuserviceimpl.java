package cn.axy.xc.xcitemdetailprovider.service.impl;

import cn.axy.xc.xcitemdetailprovider.dao.*;
import cn.axy.xc.xcitemdetailprovider.pojo.*;
import cn.axy.xc.xcitemdetailprovider.service.Instskuservice;
import cn.axy.xc.xcitemdetailprovider.util.IDGenerator;
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
    @Autowired
    private IDGenerator idGenerator;
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
                    long genItemId = IDGenerator.genItemId(1);
                    clo.setmId(mid);
                    clo.setcId((int) genItemId);
                    insertSelectiveclo(clo);
                }else if (midorn == 2){
                    long genItemId = IDGenerator.genItemId(2);
                    app.setmId(mid);
                    app.setaId((int) genItemId);
                    insertSelectiveapp(app);
                }else if (midorn == 3){
                    long genItemId = IDGenerator.genItemId(3);
                    foo.setmId(mid);
                    foo.setfId((int) genItemId);
                    insertSelectivefoo(foo);
                }else if (midorn == 4){
                    long genItemId = IDGenerator.genItemId(4);
                    orn.setmId(mid);
                    orn.setoId((int) genItemId);
                    insertSelectiveon(orn);
                }else if (midorn == 5){
                    long genItemId = IDGenerator.genItemId(5);
                    cos.setmId(mid);
                    cos.setCoId((int) genItemId);
                    insertSelectivecos(cos);
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
