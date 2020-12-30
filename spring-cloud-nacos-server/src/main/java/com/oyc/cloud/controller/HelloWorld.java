package com.oyc.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author oyc
 * @Date 2020/12/30 11:48 下午
 */
@RestController
@RequestMapping("server")
public class HelloWorld {

    @GetMapping("hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("admin")
    public String admin(){
        return "Hello admin";
    }


    @GetMapping("user")
    public String user(){
        return "Hello user";
    }
}
