package com.rao.demo.controller;

import com.rao.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping(value = "user")
    public String getUser(Integer id){
        return userService.gerUser(id).toString();
    }

}
