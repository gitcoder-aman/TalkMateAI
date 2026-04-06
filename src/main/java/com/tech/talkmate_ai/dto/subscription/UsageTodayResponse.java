package com.tech.talkmate_ai.dto.subscription;

public record UsageTodayResponse(
        int tokenUsed,
        int tokensLimit,
        int previewsRunning,
        int previewsLimit
) {
}
