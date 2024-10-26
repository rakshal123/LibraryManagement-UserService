package com.libraryManager.UserService.model;

import jakarta.persistence.EnumType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

        private String userName;
        private Integer userMobileNumber;
        private String userEmailId;
        private String userAddress;
        private EnumType userStatus;
        private Date userRegisteredDate;
        private Date userExpiredDate;
        private String userMembershipType;
}
