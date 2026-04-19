package com.tech.talkmate_ai.service.impl;

import com.tech.talkmate_ai.dto.subscription.CheckoutRequest;
import com.tech.talkmate_ai.dto.subscription.CheckoutResponse;
import com.tech.talkmate_ai.dto.subscription.PortalResponse;
import com.tech.talkmate_ai.dto.subscription.SubscriptionResponse;
import com.tech.talkmate_ai.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest checkoutRequest, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
