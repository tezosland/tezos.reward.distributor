package com.tezosland.tezos.reward.distributor.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;


@Controller
public class Route {

    @Value("classpath:static/reports/*")
    private Resource[] resources;

    @RequestMapping("/")
    public String home() throws IOException {
        for (final Resource res : resources) {
            System.out.println(res.getFilename());
        }
        return "report/index";
    }
}
