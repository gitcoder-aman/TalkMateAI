package com.tech.talkmate_ai.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record SignupRequest(
        @NotBlank(message = "Email can not be empty!") @Email String email,
       @NotBlank(message = "Name can not be empty!")
       @Size(min = 4,max = 30,message = "user name should be length 4 to 30") String name,
        @Size(min = 4,max = 50,message = "password should be length 4 to 50")  String password
) {
}
