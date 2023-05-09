package org.nioun.essentials.machinter.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.nioun.essentials.machinter.model.User;
import org.nioun.essentials.machinter.repo.UserRepository;

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
