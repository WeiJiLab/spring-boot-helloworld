package com.goouoh.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(String name) {
        return "hello world, " + name;
    }

    @RequestMapping("test")
    public boolean test() {
        return true;
    }
}
