package com.special.broccoli.tmdb.spring.boot.controllers;

import com.special.broccoli.tmdb.spring.boot.models.User;
import com.special.broccoli.tmdb.spring.boot.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping(name = "get all users",path = "/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping(name = "create user",path = "/user")
    public User getAllUsers(@RequestBody User user){
        return userService.saveUser(user);
    }

}
