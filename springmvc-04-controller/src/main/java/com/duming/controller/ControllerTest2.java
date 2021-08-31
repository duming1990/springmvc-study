package com.duming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest2 {
    @RequestMapping("/hello")
    public  String test(Model model){
        model.addAttribute("msg","test2");
        return "hello";
    }
}
