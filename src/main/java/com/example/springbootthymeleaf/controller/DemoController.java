package com.example.springbootthymeleaf.controller;

import com.example.springbootthymeleaf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class DemoController {

//    @GetMapping("/")
//    public String index(Model model) {
//        User user = new User("sbzjy", 100);
//        model.addAttribute("user", user);
//        return "index";
//    }

    @GetMapping("/")
    public ModelAndView index() {
        ArrayList<String> names = new ArrayList<>();
        ModelAndView modelAndView = new ModelAndView("index");
        names.add("zjy");
        names.add("sb");
        names.add("dsb");
        names.add("cjdsb");
        modelAndView.addObject("names", names);
        return modelAndView;
    }
}
