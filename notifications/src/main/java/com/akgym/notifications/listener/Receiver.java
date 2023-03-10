package com.akgym.notifications.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class Receiver {

    @RabbitListener(queues = {"payments_result"})
    public void receiveMessage(CustomMessage message) {
        log.info("I'VE RECEIVED A MESSAGE ID {} WITH TIMESTAMP {}", message.data().id(), message.data().timestamp());
    }
}
