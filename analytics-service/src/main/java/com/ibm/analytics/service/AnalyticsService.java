package com.ibm.analytics.service;

import org.springframework.stereotype.Service;

@Service
public class AnalyticsService {

    public void processEvent(String event) {
        // simulate aggregation logic
        System.out.println("Processing analytics event: " + event);
    }
}
