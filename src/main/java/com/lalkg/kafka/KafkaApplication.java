package com.lalkg.kafka;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaApplication  implements CommandLineRunner {
	
	@Autowired
	KafkaTemplate<String, Message> kafkaTemplate;

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }
 

	public void run(String... args) throws Exception {
		kafkaTemplate.send("cotTeam", new Message("Hello From Kafka", LocalDateTime.now()));
	}

} // The end of Class;
