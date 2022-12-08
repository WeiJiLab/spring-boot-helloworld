package com.goouoh.demo.web;

import com.goouoh.demo.model.User;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Thread.sleep;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/addValidate")
    public User addUser(@Valid @RequestBody User user, BindingResult result) throws InterruptedException {
        System.out.println("user: " + user);
        sleep(2000);
        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getCode() + "-" + error.getDefaultMessage());
            }
        }

        return user;
    }
    //三种传参方式 json  PathVariable    RequestParam
    @GetMapping("/u")
    public User getUser() throws InterruptedException {
        User user=new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(12);
        user.setGender("male");
        sleep(2000);

        return user;
    }

    @GetMapping("/{name}")
    public User getUser(@PathVariable String name) throws InterruptedException {
        User user=new User();
        user.setName(name);
        sleep(2000);

        return user;
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user) throws InterruptedException {
        sleep(2000);
        return user;
    }

    @PostMapping("/add1")
    public User addUser(@RequestParam String name) throws InterruptedException {
        User user = new User();
        user.setName(name);
        sleep(2000);
        return user;
    }
}
