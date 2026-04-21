package com.yudi.ganteng.controller;


import com.yudi.ganteng.model.User;
import com.yudi.ganteng.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public String createUser(@RequestBody User request){
        userService.addUser(request);
        return "user berhasil dibuat";
    }

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id){
        userService.deleteUser(id);
        return "user berhasil dihapus";
    }

    @GetMapping("/{id}")
    public  User getUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable String id, @RequestBody User request){
        userService.updateUser(id, request);
        return  "user berhasil diupdate";
    }
}
