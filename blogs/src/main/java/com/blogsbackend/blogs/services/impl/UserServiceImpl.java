package com.blogsbackend.blogs.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogsbackend.blogs.entities.User;
import com.blogsbackend.blogs.exceptions.ResourceNotFoundException;
import com.blogsbackend.blogs.payloads.UserDto;
import com.blogsbackend.blogs.repositories.UserRepo;
import com.blogsbackend.blogs.services.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    
    public UserDto createUser(UserDto userDto) {
        User user= this.dtoToUser(userDto);
        User savedUser= this.userRepo.save(user);
        return this.userToDto(savedUser);
    }

    public UserDto updateUser(UserDto userDto, Integer id) {
        User user= this.userRepo.findById(id).
                   orElseThrow(()-> new ResourceNotFoundException("User"," Id ",id));
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setAbout(userDto.getAbout());
        User updateuser= this.userRepo.save(user);
        UserDto userDto1 = this.userToDto(updateuser);
        return userDto1;
    }

    public UserDto getUserById(Integer id) {
        User user= this.userRepo.findById(id).
                   orElseThrow(()-> new ResourceNotFoundException("User"," Id ",id));
        return this.userToDto(user);
    }

    public List<UserDto> getAllUsers() {
        List<User> users= this.userRepo.findAll();
        List<UserDto> userDtos=users.stream().
        map(user->this.userToDto(user)).
        collect(Collectors.toList());
        return userDtos;
    }

    public void deleteUser(Integer id) {
        User user= this.userRepo.findById(id).
                   orElseThrow(()-> new ResourceNotFoundException("User"," Id ",id));
        this.userRepo.delete(user);
    }

    public void deleteAllUsers() {
        this.userRepo.deleteAll();
    }

    private User dtoToUser(UserDto userDto) {
        User user= new User();
        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setAbout(userDto.getAbout());
        return user;
    }
    private UserDto userToDto(User user) {
        UserDto userDto= new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setAbout(user.getAbout());
        return userDto;
    }
} 