package com.tezosland.tezos.reward.distributor.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping("/welcome")
    public String loginMessage(){
        return "welcome";
    }
}