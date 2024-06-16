package com.example.AuthService.mapper;

import com.example.AuthService.Dto.UserDto;
import com.example.AuthService.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper{

    @Mapping( source = "addressDto", target = "address")
    User map(UserDto userDto);

    @Mapping( source = "address", target = "addressDto")
    UserDto mapToDto(User user);

}
