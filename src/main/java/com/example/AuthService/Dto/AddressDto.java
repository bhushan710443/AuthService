package com.example.AuthService.Dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class AddressDto {

    private String addressId;
    private String home;
    private String stereet;
    private String city;
    private String state;
    private String country;
    private String pincode;

}
