package com.libraryManager.UserService.repository;

import com.libraryManager.UserService.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserReporistory extends JpaRepository<UserDto, UUID> {

}
