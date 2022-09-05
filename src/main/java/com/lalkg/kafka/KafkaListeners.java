package com.lalkg.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "cotTeam", groupId = "groupId", containerGroup = "messageFactory")
    void listener(Message data) {
        System.out.println("Listener received: " + data + " ");
    }

} // The End of Class;
