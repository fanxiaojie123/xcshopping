package cn.axy.xc.xcorderprovider.rabbit;

import cn.axy.xc.xcorderprovider.config.RabbitConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Sender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String msg) {
        this.rabbitTemplate.convertAndSend(RabbitConfig.ORDER_DELY_QUEUE,msg);
    }

}
