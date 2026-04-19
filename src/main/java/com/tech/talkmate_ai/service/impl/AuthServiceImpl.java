package com.tech.talkmate_ai.service.impl;

import com.tech.talkmate_ai.dto.auth.AuthResponse;
import com.tech.talkmate_ai.dto.auth.LoginRequest;
import com.tech.talkmate_ai.dto.auth.SignupRequest;
import com.tech.talkmate_ai.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl  implements AuthService {
    @Override
    public AuthResponse signUp(SignupRequest signupRequest) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest loginRequest) {
        return null;
    }
}
