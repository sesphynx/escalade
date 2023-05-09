package org.quantum.nine.noun.controllers;

import org.quantum.nine.noun.entities.User;
import org.quantum.nine.noun.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class UserController {

	@Autowired
	UserRepository userRepository ;
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@RequestMapping(value="registerUser" , method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user){
		user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);
		
		return "index";
	}
	
	
	@RequestMapping("admin/showCoreCorantic")
	public String showCoreCorantic() {
		 
		return "coreCorantic";
	}
	
	
}
