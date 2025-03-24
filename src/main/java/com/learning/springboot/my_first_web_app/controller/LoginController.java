package com.learning.springboot.my_first_web_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.learning.springboot.my_first_web_app.service.AuthenticationService;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService){
        super();
        this.authenticationService = authenticationService;
    }

    @GetMapping("login")
        public String goToLoginPage(Model model, ModelMap modelMap){
        model.addAttribute("title", "Welcome to the login page!");
        return "login";
    }

    @PostMapping("login")
        public String goToWelcomePage(
            @RequestParam String name,
            @RequestParam String password,
            ModelMap modelMap, Model model){

        if (authenticationService.authenticate(name, password)) {
            modelMap.put("name", name);
            model.addAttribute("name", name);
            return "welcome";
        }
        model.addAttribute("errorMessage", "Invalid credentials");
        return "login";
    }
}
