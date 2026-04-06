package com.tech.talkmate_ai.service;

import com.tech.talkmate_ai.dto.subscription.CheckoutRequest;
import com.tech.talkmate_ai.dto.subscription.CheckoutResponse;
import com.tech.talkmate_ai.dto.subscription.PortalResponse;
import com.tech.talkmate_ai.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest checkoutRequest, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
