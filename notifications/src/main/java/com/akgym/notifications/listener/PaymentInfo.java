package com.akgym.notifications.listener;

import java.io.Serializable;
import java.util.UUID;

public record PaymentInfo(
    UUID id,
    int timestamp
) implements Serializable {
}
