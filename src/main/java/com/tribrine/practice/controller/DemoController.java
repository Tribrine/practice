package com.tribrine.practice.controller;

import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    public String hello() {
        return "hello controller";
    }
}
