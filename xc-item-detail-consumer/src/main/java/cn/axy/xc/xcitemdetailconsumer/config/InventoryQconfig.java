package cn.axy.xc.xcitemdetailconsumer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

public class InventoryQconfig {
    //正常的消费者的队列
    public static  final  String  CONSUME_QUEUE  = "consume-queue";

    @Bean
    public Queue queue(){
        return new Queue(CONSUME_QUEUE,true,false,false);
    }
}
