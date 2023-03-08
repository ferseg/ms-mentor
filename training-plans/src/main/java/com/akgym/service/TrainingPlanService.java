package com.akgym.service;

import com.akgym.client.NotificationClient;
import com.akgym.model.request.notifications.NotificationRequest;
import com.akgym.model.response.TrainingPlanListResponse;
import com.akgym.model.response.TrainingPlanResponse;
import com.akgym.repository.TrainingPlanRepository;

import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Singleton
public class TrainingPlanService {

    private final TrainingPlanRepository repository;
    private final NotificationClient notificationClient;

    public TrainingPlanService(final TrainingPlanRepository repository, final NotificationClient notificationClient) {
        this.repository = repository;
        this.notificationClient = notificationClient;
    }

    public TrainingPlanListResponse findAll() {
        return new TrainingPlanListResponse(repository.findAll());
    }

    public TrainingPlanResponse create(final String plan) {
        if (!repository.insert(plan)) {
            throw new RuntimeException("The plan is already registered");
        }
        final NotificationRequest request = new NotificationRequest("Micronaut application", "I've registered this plan: " + plan);
        final String notificationResponse = notificationClient.sendNotification(request);
        log.info("SpringBoot has responded with {}", notificationResponse);
        return new TrainingPlanResponse(plan);
    }
}
