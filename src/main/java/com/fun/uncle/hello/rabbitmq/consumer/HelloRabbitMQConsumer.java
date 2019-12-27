package com.fun.uncle.hello.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/12/27  10:53
 * @Version: 0.0.1-SNAPSHOT
 */
@Component
@RabbitListener(queues = "helloRabbit")
public class HelloRabbitMQConsumer {

    @RabbitHandler
    public void  process(String message) {
        System.out.println("【consumer】:" + message);
    }
}
