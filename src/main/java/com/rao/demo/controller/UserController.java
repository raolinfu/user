package com.rao.demo.controller;

import com.rao.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.jws.WebParam;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping(value = "/user")
    @ResponseBody
    public String getUser(Integer id){
        return userService.gerUser(id).toString();
    }

    @GetMapping(value = "/login")
    public String getLogin(Model model){
        model.addAttribute("name", "rao");
        model.addAttribute("lin", "hu");
        return "login";
    }
}
