package com.blogsbackend.blogs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogsbackend.blogs.payloads.UserDto;
import com.blogsbackend.blogs.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/users")
public class UserController {
    //Inject UserService
    @Autowired
    private UserService userService;
    //Post - create user
    @PostMapping("/")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto createdUserDto = this.userService.createUser(userDto);
        return new ResponseEntity<>(createdUserDto, HttpStatus.CREATED);
    }
    //Put - update user
    //Get - get user by id
    //Get - get all users
}
