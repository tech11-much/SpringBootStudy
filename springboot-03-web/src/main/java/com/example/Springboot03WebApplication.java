package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot03WebApplication {

    public static void main(String[] args) {
        System.out.println("输出了");
        SpringApplication.run(Springboot03WebApplication.class, args);
    }

}
