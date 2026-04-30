package com.tech.talkmate_ai.dto.member;

import com.tech.talkmate_ai.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(
        @NotNull(message = "project role can not be empty!") ProjectRole projectRole
) {
}
