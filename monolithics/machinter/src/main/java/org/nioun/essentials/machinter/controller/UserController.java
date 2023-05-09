package org.nioun.essentials.machinter.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.nioun.essentials.machinter.model.Groupe;
import org.nioun.essentials.machinter.model.User;
import org.nioun.essentials.machinter.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService ;
	
	@RequestMapping("/creerUser")
	private String creerUser(ModelMap map){
		return "creerUser" ;
	}
	
	@PostMapping("enregistrerUser")
	private String enregistrerUser(@ModelAttribute("user") User user,@RequestParam ("groupe") Groupe groupe, ModelMap modelMap){
		user.setGroupe(groupe);
		User savedUser = userService.saveUser(user);
		String msg = "User Enregistré avec Id:"+savedUser.getId();
		return "creerUser" ;
	}
	@RequestMapping("/afficherAllUsers")
	private String afficherAllUsers(ModelMap modelMap){
		  List<User> users = userService.getAllUsers();
		  modelMap.addAttribute("users", users);
		return "afficherAllUsers" ;
	}
	@RequestMapping("/supprimerUser")
	private String supprimerUser(@RequestParam("id") Long id,ModelMap modelMap){
		User user = new User();
		user.setId(id);
		userService.deleteUser(user);
		List<User> users = userService.getAllUsers();
		  modelMap.addAttribute("users", users);
		return "afficherAllUsers" ;
	}
	@RequestMapping("/ciblerUser")
	private String ciblerUser(@RequestParam("id") Long id,ModelMap modelMap){
		User updatedUser = userService.getUserById(id);
		modelMap.addAttribute("user", updatedUser);
		return "editerUser" ;
	}
	@RequestMapping("/editerUser")
	private String editerUser(@ModelAttribute("user") User user,ModelMap modelMap){
		userService.saveUser(user);
		List<User> users = userService.getAllUsers();
		  modelMap.addAttribute("users", users);
		return "afficherAllUsers" ;
	}
	
	
	@RequestMapping(path="/" , method=RequestMethod.GET)
	public String showIndex() {
		return "index.html";
	}
	
	
	@RequestMapping(path="/showLogin" , method=RequestMethod.GET)
	public String showLoginPage() {
		return "login/login";
	}
	
	@RequestMapping(value = "/login" ,method=RequestMethod.POST   )
	public String login(@RequestParam ("email") String email ,@RequestParam ("password") String password , ModelMap modelMap) {
		User user =  userService.findByEmail(email);
		if (user.getPassword().equals(password)) {
			return "superviseurOffice";
		}else {
			modelMap.addAttribute("msg", "Email ou Mot de passe erroné .Réessayez ");
		}
		return"login/login";
	}
	

}
