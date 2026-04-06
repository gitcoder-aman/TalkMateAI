package com.tech.talkmate_ai.service;

import com.tech.talkmate_ai.dto.subscription.PlanLimitsResponse;
import com.tech.talkmate_ai.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
