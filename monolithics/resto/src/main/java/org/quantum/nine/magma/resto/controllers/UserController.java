package org.quantum.nine.magma.resto.controllers;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.quantum.nine.magma.resto.entities.User;
import org.quantum.nine.magma.resto.repos.UserRepository;
import org.quantum.nine.magma.resto.service.UserService;
@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository ;
	
	@Autowired
	UserService service ;
	
	
	
	
	
	@RequestMapping(value = "/login" ,method=RequestMethod.POST   )
	public String login(@RequestParam ("email") String email ,@RequestParam ("password") String password , ModelMap modelMap) {
		
		return"index.html";
	}
	
	

	@RequestMapping("/showCreateUser")
	public String showCreateUser(ModelMap map) {
		User user = new User();
		map.addAttribute(user);
		return "createUser";
	}

	@RequestMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user,
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
