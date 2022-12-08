package com.goouoh.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Thread.sleep;

@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(String name) throws InterruptedException {
        sleep(2000);
        return "hello world, " + name;
    }

    @RequestMapping("test")
    public boolean test() {
        return true;
    }
}
