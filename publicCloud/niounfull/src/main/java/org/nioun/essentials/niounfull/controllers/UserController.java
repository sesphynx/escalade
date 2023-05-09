package org.nioun.essentials.niounfull.controllers;

import java.util.List;

import org.nioun.essentials.niounfull.exceptions.ResourceNotFoundException;
import org.nioun.essentials.niounfull.model.User;
import org.nioun.essentials.niounfull.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository ;
	}
	
	@PostMapping("/user/save")
	public User saveUser(@RequestBody User user) {
		return this.userRepository.save(user);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers(){
		return ResponseEntity.ok(
				this.userRepository.findAll());
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable(value="id") Long id){
		 User user= this.userRepository.findById(id).orElseThrow(
								() -> new ResourceNotFoundException("User not Found") 
							
						);
	return ResponseEntity.ok().body(user);
	}


	@PutMapping("/user/{id}")
	public User updateUser(@RequestBody User newUser , @PathVariable  (value="id")Long id) {
		
	return	this.userRepository.findById(id)
			.map(user->{
			user.setName(newUser.getName());
			user.setName(newUser.getSurname());
			user.setName(newUser.getEmail());
			user.setName(newUser.getUsername());
			user.setName(newUser.getPassword());
			return this.userRepository.save(user);
		}).orElseGet(()->{
			newUser.setId(id);
			return this.userRepository.save(newUser);
		});
		
		
	}


	@DeleteMapping("/user/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable (value="id") Long id ) {
		
		User user = this.userRepository.findById(id)
				.orElseThrow(
						()-> new ResourceNotFoundException("User Not Found")
						
						);
		 this.userRepository.delete(user);
		 return ResponseEntity.ok().build();
	}

}
