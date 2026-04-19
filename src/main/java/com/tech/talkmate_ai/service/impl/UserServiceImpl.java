package com.tech.talkmate_ai.service.impl;

import com.tech.talkmate_ai.dto.auth.UserProfileResponse;
import com.tech.talkmate_ai.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
