package com.magma.quantum.machintech.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.magma.quantum.machintech.entities.User;
import com.magma.quantum.machintech.repos.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		
	User user=userRepository.findByEmail(username);
	
	if (user==null) {
		throw new UsernameNotFoundException("Login not available for Username "+username);
	}
	return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), (Collection<? extends GrantedAuthority>) user.getRole()) ;
	}

}
