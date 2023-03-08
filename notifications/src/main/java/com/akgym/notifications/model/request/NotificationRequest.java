package com.akgym.notifications.model.request;

/**
 * NotificationRequest
 */
public record NotificationRequest(
    String sentBy,
    String message
) {
}
