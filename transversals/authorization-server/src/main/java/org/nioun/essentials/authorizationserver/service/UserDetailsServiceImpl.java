package org.nioun.essentials.authorizationserver.service;

import java.util.Optional;

import org.nioun.essentials.authorizationserver.model.AuthUserDetail;
import org.nioun.essentials.authorizationserver.model.User;
import org.nioun.essentials.authorizationserver.repos.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailRepository userDetailRepository;

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> optionalUser = userDetailRepository.findByUsername(username);
		
		optionalUser.orElseThrow(() -> new UsernameNotFoundException("username or password wrong"));
		
		UserDetails userDetails = new AuthUserDetail(optionalUser.get());
		
		new AccountStatusUserDetailsChecker().check(userDetails);
		
		return userDetails;
		
	}

}
