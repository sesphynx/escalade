package org.quantum.nine.magma.pharmog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	UserDetailsService userDetailsService ;
	
	@Autowired
	AuthenticationManager authenticationManager ;
	
	
	public boolean login(String username, String password) {
		
		UserDetails userDetails = userDetailsService.loadUserByUsername(username);
		UsernamePasswordAuthenticationToken  token = new UsernamePasswordAuthenticationToken(username, password,userDetails.getAuthorities());
		 authenticationManager.authenticate(token);	
		boolean result = token.isAuthenticated();
		return result;
	}

}
