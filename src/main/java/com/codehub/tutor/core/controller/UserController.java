package com.codehub.tutor.core.controller;

import com.codehub.tutor.core.model.User;
import com.codehub.tutor.core.service.api.UserServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserServiceAPI userService;

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id")Long id){
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<User> addUser(User user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<User> deleteUser(User user){
        userService.deleteUserById(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<User> updateUser(User user){
        return new ResponseEntity<>(userService.updateUserById(user), HttpStatus.OK);
    }
}
