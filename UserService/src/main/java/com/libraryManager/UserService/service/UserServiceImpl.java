package com.libraryManager.UserService.service;

import com.libraryManager.UserService.dto.UserDto;
import com.libraryManager.UserService.model.UserEntity;
import com.libraryManager.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity createUser(UserDto userDto) {

       UserEntity user = new UserEntity();

       user.setUserId(user.getUserId());
       user.setUserName(userDto.getUserName());
       user.setUserEmailId(userDto.getUserEmailId());
       user.setUserMobileNumber(userDto.getUserMobileNumber());
       user.setUserStatus(userDto.getUserStatus());
       user.setUserMembershipType(userDto.getUserMembershipType());
       user.setUserAddress(userDto.getUserAddress());
       user.setUserRegisteredDate(userDto.getUserRegisteredDate());
       user.setUserExpiredDate(userDto.getUserExpiredDate());
       return userRepository.save(UserEntity.fromEntity(userDto, user));
    }
}
