package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class TestController {
    
    @RequestMapping("/t1")
    public String test1(Model model){
        //classpath:/templates/test.html
        model.addAttribute("msg","Hello,Thymeleaf");
        return "test";
    }

    @RequestMapping("/t2")
    public String test2(Map<String,Object> map){
        //存入数据
        map.put("msg","<h1>Hello</h1>");
        map.put("users", Arrays.asList("qinjiang","kuangshen"));
        //classpath:/templates/test.html
        return "test2";
    }
}