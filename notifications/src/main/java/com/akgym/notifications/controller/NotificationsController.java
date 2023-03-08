package com.akgym.notifications.controller;

import com.akgym.notifications.model.request.NotificationRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Tag(name="notifications")
@RestController
@RequestMapping("/notifications")
public class NotificationsController {

    @ResponseStatus(HttpStatus.CREATED)
    @Operation(description = "Send a notification")
    @ApiResponse(description = "The notification that was sent")
    @PostMapping
    public String sendNotification(@RequestBody NotificationRequest request) {
        log.info("Notification received {}!! It was sent by {}", request.message(), request.sentBy());
        return "Everything went well";
    }
}
