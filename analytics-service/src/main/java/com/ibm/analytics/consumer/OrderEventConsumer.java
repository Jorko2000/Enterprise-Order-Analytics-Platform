package com.ibm.analytics.consumer;

import com.ibm.analytics.service.AnalyticsService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEventConsumer {

    private final AnalyticsService service;

    public OrderEventConsumer(AnalyticsService service) {
        this.service = service;
    }

    @KafkaListener(topics = "orders", groupId = "analytics-group")
    public void consume(String message) {
        service.processEvent(message);
    }
}
