package com.tech.talkmate_ai.service;

import com.tech.talkmate_ai.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
