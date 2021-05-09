package com.rao.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DemoApplicationTests {
    @Value("${spring.profiles.active}")
    private String env;

    @Value("${server.port}")
    private Integer port;

    @Value("${person.name}")
    private String name;

    @Test
    void contextLoads() {
        System.out.println(env);
        System.out.println(port);
        System.out.println(name);
    }

}
