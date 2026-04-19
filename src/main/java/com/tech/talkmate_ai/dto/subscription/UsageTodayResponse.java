package com.tech.talkmate_ai.dto.subscription;

public record UsageTodayResponse(
        Integer tokenUsed,
        Integer tokensLimit,
        Integer previewsRunning,
        Integer previewsLimit
) {
}
