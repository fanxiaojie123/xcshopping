package cn.axy.xc.xcitemdetailconsumer.service.impl;

import cn.axy.xc.xcitemdetailconsumer.config.InventoryQconfig;
import cn.axy.xc.xcitemdetailconsumer.service.InventoryQueue;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Inventoryservice {
//    @Autowired
//    private InventoryQueue inventoryQueue;
//    @RabbitListener(queues = {InventoryQconfig.CONSUME_QUEUE})
//    public void receive(Message msg){
//        System.out.println(new String(msg.getBody()));
//        inventoryQueue.updmessageinv();
//        inventoryQueue.updskuinv();
//    }
}
