package org.spring.springboot;

import org.spring.springboot.dubbo.TestDubboConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 
 * @author pzhang
 *
 */
@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        // 程序启动入口
        ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
        TestDubboConsumerService testDubboConsumerService = run.getBean(TestDubboConsumerService.class);
        testDubboConsumerService.test();
    }
}
