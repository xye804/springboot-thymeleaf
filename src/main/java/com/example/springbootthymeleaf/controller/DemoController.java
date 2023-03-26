package com.example.springbootthymeleaf.controller;

import com.example.springbootthymeleaf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String index(Model model) {
        User user = new User("sbzjy", 100);
        model.addAttribute("user", user);
        return "index";
    }
}
