package com.libraryManager.UserService.dto;

import jakarta.persistence.EnumType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String userName;
    private Integer userMobileNumber;
    private String userEmailId;
    private String userAddress;
    private EnumType userStatus;
    private Date userRegisteredDate;
    private Date userExpiredDate;
    private String userMembershipType;


    @Override
    public String toString() {
        return "UserEntity{" +
                ", userName='" + userName + '\'' +
                ", userMobileNumber=" + userMobileNumber +
                ", userEmailId='" + userEmailId + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", userRegisteredDate=" + userRegisteredDate +
                ", userExpiredDate=" + userExpiredDate +
                ", userMembershipType='" + userMembershipType + '\'' +
                '}';
    }
}
