package com.magma.quantum.corniche.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.corniche.entities.User;
import com.magma.quantum.corniche.repos.UserRepository;
import com.magma.quantum.corniche.service.SecurityService;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository ;
	
	@Autowired
	SecurityService securityService;
	
	@RequestMapping("/")
	public String showHome() {
		return "/findChambres";
	}
	
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "login/registerUser";
	}
	
	
	@RequestMapping(value = "/registerUser" ,method=RequestMethod.POST   )
	public String registerUser(@ModelAttribute("user") User user) {
		userRepository.saveAndFlush(user);
		return"login/login";
	}
	
	@RequestMapping("/showLogin")
	public String showLoginPage() {
		return "login/login";
	}
	
	@RequestMapping(value = "/login" ,method=RequestMethod.POST   )
	public String login(@RequestParam ("email") String email ,@RequestParam ("password") String password , ModelMap modelMap) {
		 boolean loginResponse = securityService.login(email, password);
		if (loginResponse) {
			return "findFlights";
		}else {
			modelMap.addAttribute("msg", "Email ou Mot de passe erroné .Réessayez ");
		}
		return"login/login";
	}
	

}
