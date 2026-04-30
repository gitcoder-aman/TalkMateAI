package com.tech.talkmate_ai.dto.member;

import com.tech.talkmate_ai.enums.ProjectRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record InviteMemberRequest(
       @Email @NotBlank(message = "Email can not be empty!") String email,
       @NotNull(message = "Project Role can not be empty!") ProjectRole projectRole
) {
}