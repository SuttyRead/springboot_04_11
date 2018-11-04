package com.ua.sutty.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

//    @GetMapping("/")
//    public String standardPage(){
//        return "redirect:/signUp";
//    }
//
//    @GetMapping("/signUp")
//    public String getPageSignUp(){
//        return "signUp";
//    }
//
//    @GetMapping("/signIn")
//    public String getPageSignIn(){
//        return "signIn";
//    }

//    @GetMapping("/home")
//    public String getPageHome(){
//        return "home";
//    }

    @GetMapping("/hello")
    public String getPageHello(){
        return "hello";
    }

}
