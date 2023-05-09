package com.magma.quantum.flightreservation.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

	@Autowired
	JavaMailSender sender ;
	
	public void sendItinerary(String toAddress ,String filePath) {
		MimeMessage message = sender.createMimeMessage();
		try {
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
			messageHelper.setTo(toAddress);
			messageHelper.setSubject("Itinerary of your flight");
			messageHelper.setText("Please find within the itinerary of your flight.Thanks");
			messageHelper.addAttachment("itinerary", new File(filePath));
			sender.send(message);
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
