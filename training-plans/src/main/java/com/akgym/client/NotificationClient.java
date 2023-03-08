package com.akgym.client;

import com.akgym.model.request.notifications.NotificationRequest;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client("http://127.0.0.1:8081/notifications")
public interface NotificationClient {
    @Post
    String sendNotification(@Body NotificationRequest notification);
}
