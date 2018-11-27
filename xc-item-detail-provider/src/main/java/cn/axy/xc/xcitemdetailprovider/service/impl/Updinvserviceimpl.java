package cn.axy.xc.xcitemdetailprovider.service.impl;

import cn.axy.xc.xcitemdetailprovider.dao.*;
import cn.axy.xc.xcitemdetailprovider.pojo.InvMQ;
import cn.axy.xc.xcitemdetailprovider.service.Updinvservice;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
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
    public static final String INVENTORY_QUEUE = "inventory";
    public static final String EXCHANGE = "exchange";
    String count = "";
    Double number;

    @Override
    public String updmessageinv(Integer mid, Integer psc) {
        if (mid != null) {
            Double selmessageinv = mm.selmessageinv(mid);
            if (selmessageinv > 0) {
                number = selmessageinv + psc;
                int updmessageinv = mm.updmessageinv(number, mid);
                if (updmessageinv > 0) {
                    count = "200";
                } else {
                    count = "500";
                }
            } else {
                count = "没货500";
            }
        } else {
            count = "500";
        }
        return count;
    }

    @Override
    public String updskuinv(Integer mid, Long skuid, Integer psc) {
        if (mid != null) {
            Integer midorn = mm.midorn(mid);
            if (midorn == 1) {
                Double selcloinv = cm.selcloinv(mid, skuid);
                if (selcloinv > 0) {
                    number = selcloinv + psc;
                    cm.updcloinv(number, mid, skuid);
                } else {
                    count = "500";
                }
            } else if (midorn == 2) {
                Double selappinv = am.selappinv(mid, skuid);
                if (selappinv > 0) {
                    number = selappinv + psc;
                    am.updappinv(number, mid, skuid);
                } else {
                    count = "500";
                }
            } else if (midorn == 3) {
                Double selfooinv = fm.selfooinv(mid, skuid);
                if (selfooinv > 0) {
                    number = selfooinv + psc;
                    fm.updfooinv(number, mid, skuid);
                } else {
                    count = "500";
                }
            } else if (midorn == 4) {
                Double selorninv = om.selorninv(mid, skuid);
                if (selorninv > 0) {
                    number = selorninv + psc;
                    om.updorninv(number, mid, skuid);
                } else {
                    count = "500";
                }
            } else if (midorn == 5) {
                Double selcosinv = com.selcosinv(mid, skuid);
                if (selcosinv > 0) {
                    number = selcosinv + psc;
                    com.updcosinv(number, mid, skuid);
                } else {
                    count = "500";
                }
            } else {
                count = "500";
            }
        } else {
            count = "500";
        }
        return count;
    }

    @Bean
    public Queue queue() {
        return new Queue(INVENTORY_QUEUE, true, false, false);
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(EXCHANGE, true, false);
    }

    @Bean
    public Binding bindingBuilder1() {
        return BindingBuilder.bind(queue()).to(topicExchange()).with("key");
    }

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String invMQ) {
        rabbitTemplate.convertAndSend(Updinvserviceimpl.EXCHANGE, "key", JSON.toJSONString(invMQ));
    }
    @RabbitListener(queues = Updinvserviceimpl.INVENTORY_QUEUE)
    public void consume(String invMQ) {
        List<JSONObject> lists = JSONArray.parseObject(invMQ, List.class);
        String re = null;
        for (JSONObject jsonObject : lists) {
            if (jsonObject.get("position_name") == null) {

                String mid = jsonObject.get("mid").toString();
                Integer mid1 = Integer.valueOf(mid);

                String skuid = jsonObject.get("skuid").toString();
                Long skuid1 = Long.valueOf(skuid);

                String psc = jsonObject.get("psc").toString();
                Integer psc1 = Integer.valueOf(psc);
                updskuinv(mid1,skuid1,psc1);
                updmessageinv(mid1,psc1);
            }
        }
    }
}