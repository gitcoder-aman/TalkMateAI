package com.tech.talkmate_ai.service;

import com.tech.talkmate_ai.dto.auth.AuthResponse;
import com.tech.talkmate_ai.dto.auth.LoginRequest;
import com.tech.talkmate_ai.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signUp(SignupRequest signupRequest);

    AuthResponse login(LoginRequest loginRequest);
}
