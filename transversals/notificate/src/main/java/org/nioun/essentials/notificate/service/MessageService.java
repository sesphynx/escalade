package org.nioun.essentials.notificate.service;

import org.nioun.essentials.notificate.dto.ResponseMessage;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

	private final SimpMessagingTemplate messagingTemplate;
	
	public MessageService(SimpMessagingTemplate messagingTemplate) {
		this.messagingTemplate = messagingTemplate ;
	}
	
	public void notifyFrontEnd(final String message) {
		ResponseMessage response = new ResponseMessage(message);
		messagingTemplate.convertAndSend("/topic/messages", response);
	}
}
