package com.goouoh.demo.web;

import com.goouoh.demo.model.User;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/addValidate")
    public User addUser(@Valid @RequestBody User user, BindingResult result) {
        System.out.println("user: " + user);
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
    public User getUser() {
        User user=new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(12);
        user.setGender("male");

        return user;
    }

    @GetMapping("/{name}")
    public User getUser(@PathVariable String name) {
        User user=new User();
        user.setName(name);

        return user;
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return user;
    }

    @PostMapping("/add1")
    public User addUser(@RequestParam String name) {
        User user = new User();
        user.setName(name);
        return user;
    }
}
