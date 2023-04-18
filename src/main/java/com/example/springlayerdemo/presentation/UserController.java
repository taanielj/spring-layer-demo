package com.example.springlayerdemo.presentation;

import com.example.springlayerdemo.businesslayer.User;
import com.example.springlayerdemo.businesslayer.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return userService.save(new User(
                user.getId(),
                user.getUserName(),
                user.getFirstName(),
                user.getLastName()
        ));
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable long id) {
        return userService.findUserById(id);
    }

}
