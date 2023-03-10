package com.akgym.notifications.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class Receiver {

    @RabbitListener(queues = {"payments_result"})
    public void receiveMessage(PaymentInfo message) {
        log.info("I'VE RECEIVED A MESSAGE ID {} WITH TIMESTAMP {}", message.id(), message.timestamp());
    }
}
