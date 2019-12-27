package com.fun.uncle.hello.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 创建一个队列
 * @Author: Xian
 * @CreateDate: 2019/12/27  10:43
 * @Version: 0.0.1-SNAPSHOT
 */

@Configuration
public class RabbitMQConfiguration {

    @Bean
    public Queue queue() {
        return new Queue("helloRabbit");
    }
}
