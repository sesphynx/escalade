package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.User;

public interface UserService {

	User saveUser(User user);

	User updateUser(User user);

	void deleteUser(User user);

	User getUserById(Long id);

	List<User> getAllUsers();
}
