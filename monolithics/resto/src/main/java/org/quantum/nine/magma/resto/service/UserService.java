package org.quantum.nine.magma.resto.service;

import java.util.List;

import org.quantum.nine.magma.resto.entities.User;

public interface UserService {

	User saveUser(User user);

	User updateUser(User user);

	void deleteUser(User user);

	User getUserById(Long id);

	List<User> getAllUsers();
}
