package com.spring.security.controller;


import com.spring.security.model.User;
import com.spring.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserControl {

    @Autowired
    private UserService userService;

    //all users
    @GetMapping("/allUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return userService.getUser(username);
    }
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
