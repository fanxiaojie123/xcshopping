package cn.axy.xc.xcitemdetailconsumer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class InventoryQconfig {
    //正常的消费者的队列
    public static  final  String  CONSUME_QUEUE  = "consume-queue";

    @Bean
    public Queue queue(){
        return new Queue(CONSUME_QUEUE,true,false,false);
    }

    @Autowired
    private RabbitTemplate rabbitTemplate;
//    @Scheduled(fixedRate = 50000)//5秒  initialDelay 程序启动后延迟
//    public Queue send(){
//        return rabbitTemplate.convertAndSend(InventoryQconfig.CONSUME_QUEUE,);
//    }
}
