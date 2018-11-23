package cn.axy.xc.xcitemdetailprovider.service.impl;

import cn.axy.xc.xcitemdetailprovider.dao.*;
import cn.axy.xc.xcitemdetailprovider.pojo.*;
import cn.axy.xc.xcitemdetailprovider.service.Updskuservice;
import cn.axy.xc.xcitemdetailprovider.service.exit.Skuserviceimp;
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
    public String updsku(Integer mid, Long skuid, Skuserviceimp skuserviceimp) {
        if (mid != null){
            Integer midorn = mm.midorn(mid);
            if (midorn != null){
                if (midorn == 1){
                    Clothing clothing = new Clothing();
                    clothing.setcId(skuid);
                    clothing.setcColor(skuserviceimp.getcColor());
                    clothing.setcCount(skuserviceimp.getcCount());
                    clothing.setcSize(skuserviceimp.getcSize());
                    clothing.setcPrice(skuserviceimp.getcPrice());
                    count = updateByPrimaryKeySelectiveclo(clothing);
                }else if (midorn == 2){
                    Appliances appliances = new Appliances();
                    appliances.setaId(skuid);
                    appliances.setaColor(skuserviceimp.getaColor());
                    appliances.setaCount(skuserviceimp.getaCount());
                    appliances.setaSize(skuserviceimp.getaSize());
                    appliances.setaPrice(skuserviceimp.getaPrice());
                    count = updateByPrimaryKeySelectiveapp(appliances);
                }else if (midorn == 3){
                    Food food = new Food();
                    food.setfId(skuid);
                    food.setfColor(skuserviceimp.getfColor());
                    food.setfCount(skuserviceimp.getfCount());
                    food.setfPrice(skuserviceimp.getfPrice());
                    food.setfSize(skuserviceimp.getfSize());
                    count = updateByPrimaryKeySelectivefoo(food);
                }else if (midorn == 4){
                    Ornaments ornaments = new Ornaments();
                    ornaments.setoId(skuid);
                    ornaments.setoColor(skuserviceimp.getoColor());
                    ornaments.setoCount(skuserviceimp.getoCount());
                    ornaments.setoPrice(skuserviceimp.getoPrice());
                    ornaments.setoSize(skuserviceimp.getoSize());
                    count = updateByPrimaryKeySelectiveorn(ornaments);
                }else if (midorn == 5){
                    Cosmetics cosmetics = new Cosmetics();
                    cosmetics.setCoId(skuid);
                    cosmetics.setCoColor(skuserviceimp.getCoColor());
                    cosmetics.setCoCount(skuserviceimp.getCoCount());
                    cosmetics.setCoPrice(skuserviceimp.getCoPrice());
                    cosmetics.setCoSize(skuserviceimp.getCoSize());
                    count = updateByPrimaryKeySelectivecos(cosmetics);
                }else {
                    count = "4033";
                }
            }else {
                count = "4032";
            }
        }else {
            count = "4031";
        }
        return count;
    }
}
