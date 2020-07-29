package com.banking.creditcard.controller;

import com.banking.creditcard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/")
    public String indexPage(){
        return "index";
    }

    @GetMapping(value = "/check")
    public String checkEligibility(@RequestParam("pan")String pan) {
        String panNumber = pan.toUpperCase();
        String output = userService.getEligibility(panNumber);
        return output;
    }
}
