package com.libraryManager.UserService.repository;

import com.libraryManager.UserService.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
