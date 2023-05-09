package org.quantum.nine.magma.pharmog.service;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.User;

public interface UserService {

	User saveUser(User user);

	User updateUser(User user);

	void deleteUser(User user);

	User getUserById(Long id);

	List<User> getAllUsers();
}
