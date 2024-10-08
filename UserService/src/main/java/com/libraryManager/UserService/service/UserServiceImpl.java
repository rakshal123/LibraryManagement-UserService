package com.libraryManager.UserService.service;

import com.libraryManager.UserService.dto.UserEntity;
import com.libraryManager.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserEntity createUser(UserEntity userEntity) {
        UserEntity user = new UserEntity();
        user.setUserName(userEntity.getUserName());
        user.setUserMobileNumber(userEntity.getUserMobileNumber());
        user.setUserAddress(userEntity.getUserAddress());
        user.setUserEmailId(userEntity.getUserEmailId());
        user.setUserMembershipType(userEntity.getUserMembershipType());
        user.setUserStatus(user.getUserStatus());
        user.setUserRegisteredDate(userEntity.getUserRegisteredDate());
        user.setUserExpiredDate(userEntity.getUserExpiredDate());
        userRepository.save(userEntity);
        return user;
    }
}
