package com.learning.springboot.my_first_web_app.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String name, String password){

        boolean isValidUsername = name.equalsIgnoreCase("cheikh");
        boolean isValidPassword = password.equalsIgnoreCase("P@ssword!");

        return isValidUsername && isValidPassword;
    }
}
