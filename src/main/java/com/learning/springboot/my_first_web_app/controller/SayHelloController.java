package com.learning.springboot.my_first_web_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SayHelloController {

    @RequestMapping("/say-hello-world")
    public String sayHelloWorld() {
        return "Hello World";
    }

    @RequestMapping("/say-hello-html")
    public String sayHelloHtml(){
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My First HTML Page - Changed</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html page with body - Changed");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    @GetMapping("/say-hello-jsp")
    public String sayHelloJsp(Model model){
        model.addAttribute("message", "\"Hello World avec Spring Boot et JSP!\"");

        return "sayHello";
    }


}
