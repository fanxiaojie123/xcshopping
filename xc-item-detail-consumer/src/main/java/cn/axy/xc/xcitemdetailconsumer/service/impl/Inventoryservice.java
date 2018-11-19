package cn.axy.xc.xcitemdetailconsumer.service.impl;

import cn.axy.xc.xcitemdetailconsumer.config.InventoryQconfig;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class Inventoryservice {
    @RabbitListener(queues = {InventoryQconfig.CONSUME_QUEUE})
    public void receive(Message msg){
        System.out.println(new String(msg.getBody()));
    }
}
