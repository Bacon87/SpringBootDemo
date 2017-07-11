package com.ronbreier.bacon.first.time.springboot.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RootController {

    private static final Logger LOGGER = Logger.getLogger(RootController.class.getName());

    @GetMapping
    public String enterProject() {
        LOGGER.info("Root Accessed");
        return "welcome";
    }
}
