package com.fitness.service;

import com.fitness.dto.RegisterUserRequest;
import com.fitness.dto.UserResponse;
import com.fitness.mapper.UserMapper;
import com.fitness.model.User;
import com.fitness.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public UserResponse register(RegisterUserRequest request) {
        if(userRepository.existsByEmail(request.getEmail()))
        {
            throw new RuntimeException("Email Already Exist");
        }
        User user = UserMapper.toUser(request);
        return UserMapper.toDto(userRepository.save(user));
    }

    public List<UserResponse> getUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(UserMapper::toDto).toList();
    }

    public UserResponse getUserById(UUID id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return UserMapper.toDto(user);
    }
}
