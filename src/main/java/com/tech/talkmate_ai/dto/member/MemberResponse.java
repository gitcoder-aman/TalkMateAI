package com.tech.talkmate_ai.dto.member;

import com.tech.talkmate_ai.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        String avatarUrl,
        ProjectRole projectRole,
        Instant invitedAt
) {
}
