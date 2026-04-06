package com.tech.talkmate_ai.dto.member;

import com.tech.talkmate_ai.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole projectRole
) {
}