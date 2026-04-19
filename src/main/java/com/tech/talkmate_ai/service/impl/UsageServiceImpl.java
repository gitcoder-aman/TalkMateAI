package com.tech.talkmate_ai.service.impl;

import com.tech.talkmate_ai.dto.subscription.PlanLimitsResponse;
import com.tech.talkmate_ai.dto.subscription.UsageTodayResponse;
import com.tech.talkmate_ai.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
