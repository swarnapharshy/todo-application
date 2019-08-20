package com.application.todoapplication.service;

import com.application.todoapplication.entity.User;
import com.application.todoapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if(user == null) {
            return "login";
        }
        else{
            if(!(user.getPassword().equals(password))) {
                return "login";
            }
        }
        return "home";
    }
}
