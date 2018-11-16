package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.*;
import cn.axy.xc.xcitemshowprovider.pojo.*;
import cn.axy.xc.xcitemshowprovider.service.Skupriceservice;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Skupriceserviceimpl implements Skupriceservice {
    @Autowired
    private Apppricedao apppricedao;
    @Autowired
    private Clopricedao clopricedao;
    @Autowired
    private Cospricedao cospricedao;
    @Autowired
    private Foopricedao foopricedao;
    @Autowired
    private Ornpricedao ornpricedao;
    @Autowired
    private MessageSolrMapper mm;
    @Override
    public List<Clothing> cloprice(Skupricesolr skupricesolr) throws Exception {
        return clopricedao.colprice(skupricesolr);
    }

    @Override
    public List<Food> fooprice(Skupricesolr skupricesolr) throws Exception {
        return foopricedao.fooprice(skupricesolr);
    }

    @Override
    public List<Cosmetics> cosprice(Skupricesolr skupricesolr) throws Exception {
        return cospricedao.cosprice(skupricesolr);
    }

    @Override
    public List<Appliances> appprice(Skupricesolr skupricesolr) throws Exception {
        return apppricedao.appprice(skupricesolr);
    }

    @Override
    public List<Ornaments> ornprice(Skupricesolr skupricesolr) throws Exception {
        return ornpricedao.ornprice(skupricesolr);
    }

    @Override
    public String skuprice(Skupricesolr skupricesolr) throws Exception {
        String count = "";
        String id = skupricesolr.getmId();
        if (id != null){
            Integer scid = mm.scid(Integer.parseInt(id));
            if (scid != null){
                if (scid == 1){
                    count = JSON.toJSONString(cloprice(skupricesolr));
                }else if (scid == 2){
                    count = JSON.toJSONString(appprice(skupricesolr));
                }else if (scid == 3){
                    count = JSON.toJSONString(fooprice(skupricesolr));
                }else if (scid == 4){
                    count = JSON.toJSONString(ornprice(skupricesolr));
                }else if (scid == 5){
                    count = JSON.toJSONString(cosprice(skupricesolr));
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
