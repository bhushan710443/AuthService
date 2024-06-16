package com.example.AuthService.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserDto {

    private String userId;
    private String name;
    private String email;
    private String mobile;
    private String password;
    private Date dateOfBirth;
    private String gender;
    private AddressDto addressDto;
}