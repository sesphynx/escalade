package org.kuntum.nine.magma.websocketcallback.service;

import org.kuntum.nine.magma.websocketcallback.domain.SMS;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
@Component
public class SMSService {

	 @Value("#{systemEnvironment['TWILIO_ACCOUNT_SID']}")
	    private String ACCOUNT_SID;

	    @Value("#{systemEnvironment['TWILIO_AUTH_TOKEN']}")
	    private String AUTH_TOKEN;

	    @Value("#{systemEnvironment['TWILIO_PHONE_NUMBER']}")
	    private String FROM_NUMBER;

	    public void send(SMS sms) {
	        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

	        Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER), sms.getMessage())
	                .create();
	        System.out.println("here is my id:"+message.getSid());// Unique resource ID created to manage this transaction

	    }

	    public void receive(MultiValueMap<String, String> smscallback) {
	    }
}
