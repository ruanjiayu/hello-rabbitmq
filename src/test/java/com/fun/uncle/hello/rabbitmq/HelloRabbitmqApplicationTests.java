package com.fun.uncle.hello.rabbitmq;

import com.fun.uncle.hello.rabbitmq.provider.HelloRabbitMQProvider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = HelloRabbitmqApplication.class)
class HelloRabbitmqApplicationTests {

    @Autowired
    private HelloRabbitMQProvider helloRabbitMQProvider;

    @Test
    public void testSender() {
        for (int i = 0; i < 100; i++) {
            helloRabbitMQProvider.send();
        }
    }

}
