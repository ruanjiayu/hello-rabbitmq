package com.fun.uncle.hello.rabbitmq.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/12/27  10:44
 * @Version: 0.0.1-SNAPSHOT
 */

@Component
public class HelloRabbitMQProvider {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello" + LocalDateTime.now() + "----" + LocalDate.now();
        System.out.println("Provider: " + context);
        amqpTemplate.convertAndSend("helloRabbit", context);
    }
}
