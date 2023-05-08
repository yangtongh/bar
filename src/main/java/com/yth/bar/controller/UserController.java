package com.yth.bar.controller;

import com.yth.bar.pojo.User;
import com.yth.bar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(String username,String password){
        userService.login(username, password);
        return null;
    }

    @PostMapping("/register")
    public String register(User user){
        userService.register(user);
        return "注册成功";
    }
}
