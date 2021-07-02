package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//如果在自动配置类当中配置了页面转发路径，那么这个类就可以不用写
@Controller
public class IndexController {
    @RequestMapping({"/", "/index.html"})
    public String index(){
        return "index";
    }
}

