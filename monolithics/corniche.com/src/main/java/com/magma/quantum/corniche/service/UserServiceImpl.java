package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.User;
import com.magma.quantum.corniche.repos.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	
	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	
	public void deleteUser(User user) {
	userRepository.delete(user);
	}

	
	public User getUser(Long id) {
		return userRepository.getOne(id);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
