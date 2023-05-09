package org.nioun.essentials.kafkabus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	Environment env ;

@RequestMapping("/home")
String	getResponse(){
		return env.getProperty("message.response");
	}
	
}
