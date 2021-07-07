package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.exceptions.UserNotFoundException;

@RestController
@RequestMapping("/users/")
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @PostMapping
    public ResponseEntity<?> SaveUser(@RequestBody User u){
        return new ResponseEntity(userService.save(u), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<?> UpdateUser(@RequestBody User d){
        userService.updateById(d);
        return new ResponseEntity("User updated",HttpStatus.OK);

    }
    @GetMapping
    public ResponseEntity<?> GetUsers(){
        return new ResponseEntity(userService.getAll(), HttpStatus.OK);

    }
    @GetMapping
    public ResponseEntity<?> GetUsers(Long id){
        if(!userService.existById(id)){
            return new ResponseEntity(new UserNotFoundException("User not found"),HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(userService.getById(id), HttpStatus.OK);

    }
    @DeleteMapping
    public ResponseEntity<?> deleteUser(Long id){
        if(!userService.existById(id)){
            return new ResponseEntity(new UserNotFoundException("User not found"),HttpStatus.BAD_REQUEST);
        }
        userService.deleteById(id);
        return new ResponseEntity("User deleted", HttpStatus.OK);
    }

}
