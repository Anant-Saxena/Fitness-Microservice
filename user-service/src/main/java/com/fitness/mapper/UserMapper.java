package com.fitness.mapper;

import com.fitness.dto.RegisterUserRequest;
import com.fitness.dto.UserResponse;
import com.fitness.model.User;

public class UserMapper {
    public static UserResponse toDto(User user){
        UserResponse response = new UserResponse();
        response.setId(user.getId().toString());
        response.setFirstName(user.getFirstName());
        response.setLastName(user.getLastName());
        response.setEmail(user.getEmail());
        response.setPassword(user.getPassword());
        response.setCreatedAt(user.getCreatedAt());
        response.setUpdatedAt(user.getUpdatedAt());
        return response;
    }

    public static User toUser(RegisterUserRequest request){
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        return user;
    }

}
