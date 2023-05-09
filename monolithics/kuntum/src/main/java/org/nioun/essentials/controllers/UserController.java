package org.nioun.essentials.controllers;

import org.nioun.essentials.entities.User;
import org.nioun.essentials.repos.UserRepository;
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
	

	@RequestMapping("/")
	public String showIndex() {
		 return "index";
	}
	
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
