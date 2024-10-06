package com.libraryManager.UserService.repository;

import com.libraryManager.UserService.dto.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
