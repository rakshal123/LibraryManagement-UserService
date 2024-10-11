package com.libraryManager.UserService.model;

import com.libraryManager.UserService.dto.UserDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user_table")
public class UserEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "UserId")
    private UUID userId;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "ContactNumber")
    private Integer userMobileNumber;

    @Column(name = "EmailId")
    private String userEmailId;

    @Column(name = "Address")
    private String userAddress;

    @Column(name = "Status")
    private EnumType userStatus;

    @Column(name = "RegisteredDate")
    private Date userRegisteredDate;

    @Column(name = "ExpiredDate")
    private Date userExpiredDate;

    @Column(name = "MembershipType")
    private String userMembershipType;

    public static UserEntity fromEntity(UserDto userDto, UserEntity user) {
       return UserEntity.builder()
                .userId(user.getUserId())
                .userEmailId(userDto.getUserEmailId())
                .userName(user.getUserName())
                .userMobileNumber(user.getUserMobileNumber())
                .userStatus(user.getUserStatus())
                .userMembershipType(userDto.getUserMembershipType())
                .userRegisteredDate(userDto.getUserRegisteredDate())
                .userAddress(userDto.getUserAddress())
                .userExpiredDate(userDto.getUserExpiredDate())
                .build();
    }

}
