package com.tsl.Tera_imbere.controller;

import com.tsl.Tera_imbere.model.User;
import com.tsl.Tera_imbere.repository.UserRepository;
import com.tsl.Tera_imbere.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
    public UserRepository userRepository;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userRepository.save(user);
    }

//    @GetMapping("/users")
//    public List<User> userList(){
//        return userService.get
//    }

}
