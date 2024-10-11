package com.libraryManager.UserService.service;

import com.libraryManager.UserService.dto.UserDto;
import com.libraryManager.UserService.model.UserEntity;


public interface UserService {

    public UserEntity createUser(UserDto userDto);

}
