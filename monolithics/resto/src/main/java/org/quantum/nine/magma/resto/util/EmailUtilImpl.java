package org.quantum.nine.magma.resto.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailUtilImpl implements EmailUtil{

		@Autowired
		 JavaMailSenderImpl sender ;
		
		public void sendEmail (String toAddress, String subject, String body) {

			

	MimeMessage message = sender.createMimeMessage();
	MimeMessageHelper mimeMessageHelper = new MimeMessageHelper (message);
	try {
		mimeMessageHelper.setTo(toAddress);
		mimeMessageHelper.setSubject(subject);
		mimeMessageHelper.setText(body);
	} catch (MessagingException e) {
		e.printStackTrace();
	}
	sender.send(message);

		}
	}


