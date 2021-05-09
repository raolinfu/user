package com.rao.demo;

import com.rao.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.sql.DataSource;

@SpringBootTest
class DemoApplicationTests {
    @Value("${spring.profiles.active}")
    private String env;

    @Value("${server.port}")
    private Integer port;

    @Value("${person.name}")
    private String name;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println(userMapper.findById(1));
    }

    @Test
    void testUserMapper(){
        System.out.println(userMapper.findById(1));
    }

}
