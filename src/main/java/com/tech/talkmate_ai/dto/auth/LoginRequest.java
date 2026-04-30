package com.tech.talkmate_ai.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LoginRequest(
       @NotBlank(message = "Email can not be empty!") @Email String email,
       @Size(min = 4,max = 50,message = "password should be length 4 to 50") String password
) {
}
