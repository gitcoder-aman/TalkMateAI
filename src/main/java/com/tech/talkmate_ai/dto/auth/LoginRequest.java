package com.tech.talkmate_ai.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
