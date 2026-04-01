package com.tech.talkmate_ai.entity;

import com.tech.talkmate_ai.enums.PreviewStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {

    Long id;

    Project project;

    String namespace;

    String podName;

    PreviewStatus status;

    String previewUrl;

    Instant startedAt;
    Instant terminatedAt;
    Instant createdAt;
}
