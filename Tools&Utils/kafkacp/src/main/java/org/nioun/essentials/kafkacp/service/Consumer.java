package org.nioun.essentials.kafkacp.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics="mytopic" , groupId = "mygroup")
	public void consumeFromTopic(String message){
		System.out.println("Consuming :" + message);
	}
	
}
