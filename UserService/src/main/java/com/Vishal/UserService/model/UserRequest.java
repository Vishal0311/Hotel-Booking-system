package com.Vishal.UserService.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest {

    private String userName;
    private String userEmail;
    private String userPassword;
    private String userPhoneNumber;
}
