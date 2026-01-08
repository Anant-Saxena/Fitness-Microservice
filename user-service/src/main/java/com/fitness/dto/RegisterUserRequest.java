package com.fitness.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterUserRequest {

    private String firstName;
    private String LastName;
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email")
    private String email;
    @NotBlank(message = "Password is required")
    @Size(min=6, message = "Password must be atleast 6 characters")
    private String password;
}
