package com.magma.quantum.politicone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.politicone.entities.Pays;
import com.magma.quantum.politicone.entities.User;
import com.magma.quantum.politicone.repos.UserRepository;
import com.magma.quantum.politicone.service.UserService;
import com.magma.quantum.politicone.service.SecurityService;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository ;
	
	@Autowired
	UserService service ;
	
	@Autowired
	SecurityService securityService;
	
	
	
	@RequestMapping(value = "/login" ,method=RequestMethod.POST   )
	public String login(@RequestParam ("email") String email ,@RequestParam ("password") String password , ModelMap modelMap) {
		 boolean loginResponse = securityService.login(email, password);
		if (loginResponse) {
			return "findFlights";
		}else {
			modelMap.addAttribute("msg", "Email ou Mot de passe erroné .Réessayez ");
		}
		return"index.html";
	}
	
	

	@RequestMapping("/showCreateUser")
	public String showCreateUser(ModelMap map) {
		User user = new User();
		map.addAttribute(user);
		return "createUser";
	}

	@RequestMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user,@ModelAttribute("pays") Pays pays,
			ModelMap modelMap) {
		User userSaved = service.saveUser(user);
		String msg = "User saved with id :" + userSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "createUser";
	}

	@RequestMapping("/displayUsers")
	public String displayUsers(ModelMap modelMap) {

		List<User> users = service.getAllUsers();
		modelMap.addAttribute("users", users);
		return "displayUsers";
	}

	@RequestMapping("deleteUser")
	public String deleteUser(@RequestParam("id") Long id, ModelMap modelMap) {
		User user = new User();
		user.setId(id);
		service.deleteUser(user);
		List<User> users = service.getAllUsers();
		modelMap.addAttribute("users", users);
		return "displayUsers";
	}

	@RequestMapping("/showUpdateUser")
	public String showUpdateUser(@RequestParam("id") Long  id, ModelMap modelMap) {
		User user = new User();
		user.setId(id);
		modelMap.addAttribute("user", user);
		return "updateUser";
	}

	@RequestMapping("updateUser")
	public String updateUser(@ModelAttribute("user") User user, ModelMap modelMap) {
		service.updateUser(user);
		List<User> users = service.getAllUsers();
		modelMap.addAttribute("users", users);
		return "displayUsers";
	}

	
	
}
