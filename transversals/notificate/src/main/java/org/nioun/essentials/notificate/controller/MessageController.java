package org.nioun.essentials.notificate.controller;

import java.security.Principal;

import org.nioun.essentials.notificate.dto.Message;
import org.nioun.essentials.notificate.dto.ResponseMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {

	@MessageMapping("/message")
	@SendTo("/topic/messages")
	public ResponseMessage getMessage(final Message message) throws InterruptedException {
		Thread.sleep(1000);
		return  new ResponseMessage(HtmlUtils.htmlEscape(message.getMessageContent()));
	}
	
	
	@MessageMapping("/private-message")
	@SendTo("/topic/private-messages")
	public ResponseMessage getPrivateMessage(final Message message , final Principal princpal ) throws InterruptedException {
		Thread.sleep(1000);
		return  new ResponseMessage(HtmlUtils.htmlEscape( "sending private message to user "+ princpal.getName() 
															+ "::" + message.getMessageContent())
				                    );
	}
	
}
