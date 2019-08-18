package com.application.todoapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/home/{username}")
    public String home(@PathVariable String username) {
        Optional<User> it = userRepository.findById(username);
        /*if(user.equals(null)) {
            return "login";
        }*/
        return "home";
    }

}
