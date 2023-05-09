package com.magma.quantum.machintech.service;

import java.util.List;

import com.magma.quantum.machintech.entities.User;

public interface UserService {

	public User saveUser(User user);
	public User updateUser (User user);
	public void deleteUser(User user) ;
	public User getUserById(Long Id);
	public List<User> getAllUsers();
	public User findByEmail(String email);
	
}
