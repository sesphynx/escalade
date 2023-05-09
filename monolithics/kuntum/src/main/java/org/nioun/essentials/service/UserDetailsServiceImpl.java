package org.nioun.essentials.service;


import org.nioun.essentials.entities.User;
import org.nioun.essentials.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findByEmail(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("utilisateur inconnu,veuillez vous inscrire ou revoir vos paramétres" +username);
		}
		
		return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),user.getRoles());
	}

}
