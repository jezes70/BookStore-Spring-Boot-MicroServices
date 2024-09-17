package com.cyngofokglobal.orderservice.domain.models;

import com.cyngofokglobal.orderservice.domain.Customer;

import java.time.LocalDateTime;
import java.util.Set;

public record OrderCancelledEvent(
        String eventId,
        String orderNumber,
        Set<OrderItem> items,
        Customer customer,
        Address deliveryAddress,
        String reason,
        LocalDateTime createdAt) { }
