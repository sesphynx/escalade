package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.User;

public interface UserService {

	User saveUser(User user);

	User updateUser(User user);

	void deleteUser(User user);

	User getUserById(Long id);

	List<User> getAllUsers();
}
