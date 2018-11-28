package cn.axy.xc.xcitemdetailconsumer.service.impl;

import cn.axy.xc.xcitemdetailconsumer.service.OrderChange;
import cn.axy.xc.xcitemdetailconsumer.service.Updmessageservice;
import cn.axy.xc.xcitemdetailconsumer.service.Updskumessageservice;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;



@Component
public class invserviceimpl {
    @Autowired
    private Updskumessageservice updsku;
    @Autowired
    private OrderChange orderChange;
    public static final String INVENTORY_QUEUE = "inventory";
    @Bean
    public Queue queue() {
        return new Queue(INVENTORY_QUEUE, true, false, false);
    }
    @RabbitListener(queues = invserviceimpl.INVENTORY_QUEUE)
    public void consume(String invMQ) {
        List<JSONObject> lists = JSONArray.parseObject(invMQ,List.class);
        String re = null;
        for (JSONObject jsonObject:lists) {

            String mid = jsonObject.get("mid").toString();
            Integer mid1 = Integer.valueOf(mid);

            String skuid = jsonObject.get("skuid").toString();
            Long skuid1 = Long.valueOf(skuid);

            String psc = jsonObject.get("psc").toString();
            Integer psc1 = Integer.valueOf(psc);

            String orderid = jsonObject.get("orderId").toString();

            String updskuinv = updsku.updskuinv(mid1, skuid1, psc1);
            String updmessageinv = updsku.updmessageinv(mid1, psc1);
            if ("500".equals(updskuinv) && "500".equals(updmessageinv)){
                orderChange.orderChangetoClose(orderid);
            }
        }
    }
}
