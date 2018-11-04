package com.ua.sutty.springboot.controller;

import com.ua.sutty.springboot.form.UserForm;
import com.ua.sutty.springboot.repository.UserRepository;
import com.ua.sutty.springboot.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signUp")
    public String getSignUpPage(){
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(UserForm userForm){
        signUpService.signUp(userForm);
        return "redirect:/signIn";
    }

}
