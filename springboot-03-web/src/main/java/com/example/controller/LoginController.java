package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("/user/login")
    //url参数中的name必须要和@RequestParam("name")一致
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        //如果用户名和密码正确
        if ("admin".equals(username) && "123456".equals(password))
            return "redirect:/main.html";//重定向到main.html页面,也就是跳转到dashboard页面
            //如果用户名或者密码不正确
        else {
            model.addAttribute("msg", "用户名或者密码错误");//显示错误信息
            return "index";//跳转到首页
        }
    }
}