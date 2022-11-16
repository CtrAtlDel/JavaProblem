package com.example.kafkaMissMe;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "missme", groupId = "someGroupId")
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}

