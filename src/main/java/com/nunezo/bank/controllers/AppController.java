package com.nunezo.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("")
    public String indexDisplay(){
        return "index";
    }

//    @GetMapping("/register")
//    public String register(){
//
//        return "generateAccount";
//    }
}
