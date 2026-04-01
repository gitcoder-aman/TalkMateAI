package com.tech.talkmate_ai.entity;

import com.tech.talkmate_ai.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    Long id;
    ChatSession chatSession;
    String content;
    MessageRole messageRole;
    String toolCalls; //JSON array of Tools Called
    Integer tokensUsed;
    Instant createdAt;
}
