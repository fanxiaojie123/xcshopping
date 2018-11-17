package cn.axy.xc.xcitemshowprovider.service.impl;

import cn.axy.xc.xcitemshowprovider.dao.MessageSolrMapper;
import cn.axy.xc.xcitemshowprovider.pojo.*;
import cn.axy.xc.xcitemshowprovider.service.*;
import cn.axy.xc.xcitemshowprovider.util.SkuList;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Judgeskuserviceimpl implements Judgeskuservice {
    @Autowired
    private MessageSolrMapper messageSolrMapper;
    @Autowired
    private SkuList skuList;
    Skusolr ss = new Skusolr();
    @Override
    public String scid(Integer mid) throws Exception {
        String count = "";
        if (mid != null){
            String value = String.valueOf(mid);
            ss.setSkuid(value);
            Integer scid = messageSolrMapper.scid(mid);
            if (scid != null){
                if (scid == 1){
                    count = skuList.closolr(ss);
                }else if (scid == 2){
                    count = skuList.appsolr(ss);
                }else if (scid == 3){
                    count = skuList.foosolr(ss);
                }else if (scid == 4){
                    count = skuList.ornsolr(ss);
                }else if (scid == 5){
                    count = skuList.cossolr(ss);
                }else{
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
