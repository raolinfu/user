package com.rao.demo.controller;

import com.rao.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserTest {
    @Resource
    private UserController userController;

    @Test
    void getUser() {
        System.out.println(userController.getUser(1));
    }
}
