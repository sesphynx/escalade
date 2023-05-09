package com.magma.quantum.politicone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.magma.quantum.politicone.entities.User;
import com.magma.quantum.politicone.repos.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findByEmail(username);
		if (user==null) {
			throw new UsernameNotFoundException("Usename not found for :"+username);
		}
		
		return new  
				org.springframework.security.core.userdetails.User
				(user.getEmail(),user.getPassword(),user.getRoles());
	}

	

}
