package com.oyc.cloud.nacosserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author oyc
 * @Date 2020/12/30 11:48 下午
 */
@RestController
@RequestMapping("server")
@Slf4j
public class HelloWorld {

    @GetMapping("hello")
    public String hello() {
        log.info("invoked Hello World");
        return "Hello World from Server";
    }

    @GetMapping("admin")
    public String admin() {
        log.info("invoked Hello admin");
        return "Hello admin from Server";
    }


    @GetMapping("user")
    public String user() {
        log.info("invoked Hello user");
        return "Hello user from Server";
    }
}
