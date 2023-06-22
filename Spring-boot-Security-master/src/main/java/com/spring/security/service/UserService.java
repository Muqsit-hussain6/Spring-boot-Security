package com.spring.security.service;

import com.spring.security.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    List<User> list = new ArrayList<>();
    public UserService(){
        list.add(new User("abc","abc","abc@gmail.com"));
        list.add(new User("xyz","abcxyz","xyzabc@gmail.com"));

    }

    // We are going to make three methods in service layer so that we can set security in that.

    // 1) Get All User
    // 2) Get single user by name
    // 3)


    public List<User> getAllUsers(){
        return this.list;
    }

    public User getUser(String username){
        return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User addUser(User user){
        this.list.add(user);
        return user;
    }

}
