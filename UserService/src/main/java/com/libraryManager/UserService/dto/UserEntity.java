package com.libraryManager.UserService.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String userName;
    private Long userMobileNumber;
    private String userEmailId;
    private String userAddress;
    private String userStatus;
    private Date userRegisteredDate;
    private Date userExpiredDate;
    private String userMembershipType;

    public UserEntity(String userName, Long userMobileNumber, String userEmailId, String userAddress, String userStatus, Date userRegisteredDate, Date userExpiredDate, String userMembershipType) {
        this.userName = userName;
        this.userMobileNumber = userMobileNumber;
        this.userEmailId = userEmailId;
        this.userAddress = userAddress;
        this.userStatus = userStatus;
        this.userRegisteredDate = userRegisteredDate;
        this.userExpiredDate = userExpiredDate;
        this.userMembershipType = userMembershipType;
    }

    public UserEntity() {
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserMobileNumber() {
        return userMobileNumber;
    }

    public void setUserMobileNumber(Long userMobileNumber) {
        this.userMobileNumber = userMobileNumber;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public Date getUserRegisteredDate() {
        return userRegisteredDate;
    }

    public void setUserRegisteredDate(Date userRegisteredDate) {
        this.userRegisteredDate = userRegisteredDate;
    }

    public Date getUserExpiredDate() {
        return userExpiredDate;
    }

    public void setUserExpiredDate(Date userExpiredDate) {
        this.userExpiredDate = userExpiredDate;
    }

    public String getUserMembershipType() {
        return userMembershipType;
    }

    public void setUserMembershipType(String userMembershipType) {
        this.userMembershipType = userMembershipType;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
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
