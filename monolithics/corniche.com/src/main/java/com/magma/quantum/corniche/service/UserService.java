package com.magma.quantum.corniche.service;

import java.util.List;

import com.magma.quantum.corniche.entities.User;

public interface UserService {

	User saveUser(User user);
	User updateUser(User user);
	void deleteUser(User user);
	User getUser(Long id);
	List<User> getAllUsers();
}
