package com.blogsbackend.blogs.services;

import java.util.List;

import com.blogsbackend.blogs.services.UserService;
import com.blogsbackend.blogs.payloads.UserDto;


public interface UserService {
    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user, Integer id);
    UserDto getUserById(Integer id);
    List<UserDto> getAllUsers();
    void deleteUser(Integer id);
    void deleteAllUsers();
}
