package com.libraryManager.UserService.service;

import com.libraryManager.UserService.dto.UserDto;
import com.libraryManager.UserService.model.User;
import com.libraryManager.UserService.repository.UserReporistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl {

    @Autowired
    private UserReporistory userReporistory;

    public UserDto createUser(UserDto userDto, User user) {
       return userReporistory.save(userDto.fromDto(user));

    }

    public Optional<UserDto> getUserById(UUID uuid) {
        return userReporistory.findById(uuid);
    }

    public Optional<List<UserDto>> getAllUsers() {
        return Optional.of(userReporistory.findAll());
    }
}
