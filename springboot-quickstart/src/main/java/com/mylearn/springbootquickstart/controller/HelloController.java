package com.mylearn.springbootquickstart.controller;

import com.mylearn.springbootquickstart.pojo.EmailProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private EmailProperties emailProperties;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println(emailProperties.toString());
        return "hello world";
    }
}
