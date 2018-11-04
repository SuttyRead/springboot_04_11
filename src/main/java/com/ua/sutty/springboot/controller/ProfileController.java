package com.ua.sutty.springboot.controller;

import com.ua.sutty.springboot.model.User;
import com.ua.sutty.springboot.security.details.UserDetailsImpl;
import com.ua.sutty.springboot.transfer.UserDTO;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class ProfileController {

    @GetMapping("/")
    public String getProfilePage(ModelMap modelMap, Authentication authentication){

        if (authentication == null){
            return "redirect:/signIn";
        }

        UserDetailsImpl userDetails = (UserDetailsImpl)authentication.getPrincipal();
        UserDTO userDTO = UserDTO.from(userDetails.getUser());

        modelMap.addAttribute("user", userDTO);
        System.out.println(userDTO);
        return "profile";
    }

//    @GetMapping("/logout")
//    public String logout(HttpServletRequest httpServletRequest) throws ServletException {
//        httpServletRequest.logout();
//        return "/signIn";
//    }

//    @GetMapping("/exit")
//    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        System.out.println(1);
//        if (auth != null){
//            new SecurityContextLogoutHandler().logout(request, response, auth);
//        }
//        System.out.println(2);
//        return "redirect:/";
//    }

}
