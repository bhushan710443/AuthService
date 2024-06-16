package com.example.AuthService.service;

import com.example.AuthService.Dto.UserDto;
import com.example.AuthService.entity.User;
import com.example.AuthService.mapper.UserMapper;
import com.example.AuthService.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRepository userRepository;

    public UserDto createUser(UserDto userDto){
        String randomDealNumber = UUID.randomUUID().toString();
        userDto.setUserId(randomDealNumber);

        User user = userMapper.map(userDto);
        try{
            userRepository.save(user);
        }catch (Exception exception){
            log.info("Deal Not Created");
        }
        return userDto;
    }

    public UserDto getUserById(String userId) {
        User user = userRepository.findUserByUserId(userId);
        if(user == null){
            log.info("User not exists with id  :" + userId);
        }
        UserDto userDto = userMapper.mapToDto(user);
        return userDto;
    }


}
