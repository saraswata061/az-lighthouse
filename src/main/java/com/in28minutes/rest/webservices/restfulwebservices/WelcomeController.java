package com.in28minutes.rest.webservices.restfulwebservices;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", "Welcome to DFC");

        return "welcome"; //view
    }
}
