package com.libraryManager.UserService.dto;

import com.libraryManager.UserService.model.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Table
public class UserDto {

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


    public UserDto fromDto(User user) {
       return UserDto.builder()
                .userName(user.getUserName())
                .userEmailId(user.getUserEmailId())
                .userMobileNumber(user.getUserMobileNumber())
                .userMembershipType(user.getUserMembershipType())
                .userStatus(user.getUserStatus())
                .userRegisteredDate(user.getUserRegisteredDate())
                .userAddress(user.getUserAddress())
                .userExpiredDate(user.getUserExpiredDate())
                .build();
    }
}
