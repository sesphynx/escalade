package org.nioun.essentials.machinter.service;

import java.util.List;

import org.nioun.essentials.machinter.model.User;

public interface UserService {

	public User saveUser(User user);
	public User updateUser (User user);
	public void deleteUser(User user) ;
	public User getUserById(Long Id);
	public List<User> getAllUsers();
	public User findByEmail(String email);
	
}
