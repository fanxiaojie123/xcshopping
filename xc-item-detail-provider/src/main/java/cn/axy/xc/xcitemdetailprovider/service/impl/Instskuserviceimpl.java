package cn.axy.xc.xcitemdetailprovider.service.impl;

import cn.axy.xc.xcitemdetailprovider.dao.*;
import cn.axy.xc.xcitemdetailprovider.pojo.*;
import cn.axy.xc.xcitemdetailprovider.service.Instskuservice;
import cn.axy.xc.xcitemdetailprovider.service.exit.Skuserviceimp;
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
    public String instsku(Integer mid, Skuserviceimp skumessage) {
        if (mid != null){
            Integer midorn = mm.midorn(mid);
            if (midorn != null){
                if (midorn == 1){
                    long genItemId = IDGenerator.genItemId(1);
                    Clothing clothing = new Clothing();
                    clothing.setcColor(skumessage.getcColor());
                    clothing.setcCount(skumessage.getcCount());
                    clothing.setcSize(skumessage.getcSize());
                    clothing.setcPrice(skumessage.getcPrice());
                    clothing.setmId(mid);
                    clothing.setcId(genItemId);
                    insertSelectiveclo(clothing);
                }else if (midorn == 2){
                    long genItemId = IDGenerator.genItemId(2);
                    Appliances appliances = new Appliances();
                    appliances.setaColor(skumessage.getaColor());
                    appliances.setaCount(skumessage.getaCount());
                    appliances.setaSize(skumessage.getaSize());
                    appliances.setaPrice(skumessage.getaPrice());
                    appliances.setmId(mid);
                    appliances.setaId( genItemId);
                    insertSelectiveapp(appliances);
                }else if (midorn == 3){
                    long genItemId = IDGenerator.genItemId(3);
                    Food food = new Food();
                    food.setfColor(skumessage.getfColor());
                    food.setfCount(skumessage.getfCount());
                    food.setfPrice(skumessage.getfPrice());
                    food.setfSize(skumessage.getfSize());
                    food.setmId(mid);
                    food.setfId(genItemId);
                    insertSelectivefoo(food);
                }else if (midorn == 4){
                    long genItemId = IDGenerator.genItemId(4);
                    Ornaments ornaments = new Ornaments();
                    ornaments.setoColor(skumessage.getoColor());
                    ornaments.setoCount(skumessage.getoCount());
                    ornaments.setoPrice(skumessage.getoPrice());
                    ornaments.setoSize(skumessage.getoSize());
                    ornaments.setmId(mid);
                    ornaments.setoId(genItemId);
                    insertSelectiveon(ornaments);
                }else if (midorn == 5){
                    long genItemId = IDGenerator.genItemId(5);
                    Cosmetics cosmetics = new Cosmetics();
                    cosmetics.setCoColor(skumessage.getCoColor());
                    cosmetics.setCoCount(skumessage.getCoCount());
                    cosmetics.setCoPrice(skumessage.getCoPrice());
                    cosmetics.setCoSize(skumessage.getCoSize());
                    cosmetics.setmId(mid);
                    cosmetics.setCoId(genItemId);
                    insertSelectivecos(cosmetics);
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
