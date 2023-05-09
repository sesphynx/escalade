package org.nioun.essentials.notificate.controller;

import org.nioun.essentials.notificate.dto.Message;
import org.nioun.essentials.notificate.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WSController {
	
	@Autowired
	private MessageService messageService;
	
	@PostMapping("/send-message")
	public void senMessage(@RequestBody final Message message) {
		messageService.notifyFrontEnd(message.getMessageContent());
	}

}
