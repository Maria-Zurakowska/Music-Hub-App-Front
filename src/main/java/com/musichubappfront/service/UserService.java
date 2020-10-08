package com.musichubappfront.service;

import com.musichubappfront.Dto.UserDto;
import org.springframework.web.client.RestTemplate;

public class UserService {

    private static UserService userService;
    private RestTemplate restTemplate = new RestTemplate();

    public static UserService getInstance(){
        if (userService == null){
            userService = new UserService();
        }
        return userService;
    }

    public UserDto createUser(UserDto userDto){
        String url = "http://localhost:8080" + "/user" + "/createUser";
        return restTemplate.postForObject(url, userDto, UserDto.class);
    }

}
