package org.nioun.essentials.niounfull.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.nioun.essentials.niounfull.model.User;
import org.nioun.essentials.niounfull.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository ;
	
	

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User saveUser(User user) {

		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(User user) {
    userRepository.delete(user);

	}

	@Override
	public User getUserById(Long id) {
		return userRepository.getOne(id);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}


}
