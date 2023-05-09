package org.nioun.essentials.kafkacp.controller;
import org.nioun.essentials.kafkacp.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafkapp")
public class KafkaController {

	@Autowired
	Producer producer;
	
	@PostMapping("/post")
	public void post(@RequestParam("msg") String msg ){
		producer.publishToTopic(msg);
	}
	
}
