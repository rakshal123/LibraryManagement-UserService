package com.libraryManager.UserService.controller;

import com.libraryManager.UserService.dto.UserDto;
import com.libraryManager.UserService.model.User;
import com.libraryManager.UserService.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/create-user")
    public ResponseEntity<UserDto> createUser(UserDto userDto, User user) {
        return new ResponseEntity<>(userService.createUser(userDto, user), HttpStatus.CREATED);
    }
}
