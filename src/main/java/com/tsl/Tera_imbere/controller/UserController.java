package com.tsl.Tera_imbere.controller;

import com.tsl.Tera_imbere.model.User;
import com.tsl.Tera_imbere.repository.UserRepository;
import com.tsl.Tera_imbere.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> userList(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable ("id") Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/update/user/{id}")
    public User updateUser(@PathVariable ("id") Long id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/user/{id}")
    public void removeUser(@PathVariable ("id") Long id){
        userService.removeUser(id);
    }
}
