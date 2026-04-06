package com.tech.talkmate_ai.dto.subscription;

import java.time.Instant;

public record SubscriptionResponse(
        PlanResponse plan,
        String status,
        Instant periodEnd,
        Long tokensUsedThisCycle
) {
}
