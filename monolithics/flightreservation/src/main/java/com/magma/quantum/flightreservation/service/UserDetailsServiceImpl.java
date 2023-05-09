package com.magma.quantum.flightreservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.magma.quantum.flightreservation.entities.User;
import com.magma.quantum.flightreservation.repos.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserRepository userRepository ;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		User user = userRepository.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("Login unavailable for this email ");
		}
		
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), user.getRoles());
	}

}
