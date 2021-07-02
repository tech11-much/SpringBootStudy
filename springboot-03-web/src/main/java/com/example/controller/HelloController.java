package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//不会跳转视图
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello, world!";
    }
}
