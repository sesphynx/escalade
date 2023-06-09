package org.nioun.essentials.notificate.dto;

import java.security.Principal;
import java.util.Map;
import java.util.UUID;
import com.sun.security.auth.UserPrincipal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

public class UserHandshakeHandler extends DefaultHandshakeHandler {

	private final Logger log = LoggerFactory.getLogger(UserHandshakeHandler.class);
	
	@Override
	protected Principal determineUser(ServerHttpRequest request, 
									  WebSocketHandler wsHandler,
									  Map<String, Object> attributes) {
		String randomId = UUID.randomUUID().toString();
		log.info("User with id '{}' has open page", randomId);
		return new UserPrincipal(randomId) ;
	}
}
