package com.application.todoapplication.controller;

import com.application.todoapplication.entity.User;
import com.application.todoapplication.repository.UserRepository;
import com.application.todoapplication.service.LoginService;
import com.application.todoapplication.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/home")
    public String home(@RequestParam("username") String username, @RequestParam("password") String password) {

        return loginService.login(username, password);

    }

}
