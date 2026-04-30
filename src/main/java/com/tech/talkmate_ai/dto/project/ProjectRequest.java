package com.tech.talkmate_ai.dto.project;

import jakarta.validation.constraints.NotBlank;

public record ProjectRequest(
        @NotBlank(message = "Project name is not empty!") String name
) {
}
