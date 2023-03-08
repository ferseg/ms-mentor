package com.akgym.model.request.notifications;

/**
 * NotificationRequest
 */
public record NotificationRequest(
    String sentBy,
    String message
) {
}
