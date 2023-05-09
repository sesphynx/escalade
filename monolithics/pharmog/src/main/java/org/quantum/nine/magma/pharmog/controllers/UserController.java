package org.quantum.nine.magma.pharmog.controllers;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.User;
import org.quantum.nine.magma.pharmog.repos.UserRepository;
import org.quantum.nine.magma.pharmog.service.SecurityService;
import org.quantum.nine.magma.pharmog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class UserController {
	@Autowired
	UserRepository userRepository ;
	@Autowired
	UserService service ;
	
	@Autowired
	SecurityService securityService ;
	
	@RequestMapping(value= {"/index","/"})
	public String index() {	
		return "index";
	}
	
	@RequestMapping(value = "/login" ,method=RequestMethod.POST   )
	public String login(@RequestParam ("email") String email ,@RequestParam ("password") String password , ModelMap modelMap) {
		boolean loginResponse = securityService.login(email, password);
		if (loginResponse) {
			return"index";
		} else {
			modelMap.addAttribute("msg", "Identifiant ou Password erroné.Réessayez!");
		}
		return "index";
	}
	
	

	@RequestMapping("/ajouterUser")
	public String ajouterUser(ModelMap map) {
		User user = new User();
		map.addAttribute(user);
		return "creerUser";
	}

	@RequestMapping("/sauvegarderUser")
	public String sauvegarderUser(@ModelAttribute("user") User user,
							ModelMap modelMap) {
		User userSaved = service.saveUser(user);
		String msg = "User saved with id :" + userSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerUser";
	}

	@RequestMapping("/toutUsers")
	public String toutUsers(ModelMap modelMap) {

		List<User> users = service.getAllUsers();
		modelMap.addAttribute("users", users);
		return "toutUsers";
	}

	@RequestMapping("supprimerUser")
	public String supprimerUser(@RequestParam("id") Long id, ModelMap modelMap) {
		User user = new User();
		user.setId(id);
		service.deleteUser(user);
		List<User> users = service.getAllUsers();
		modelMap.addAttribute("users", users);
		return "toutUsers";
	}

	@RequestMapping("/ciblerUser")
	public String ciblerUser(@RequestParam("id") Long  id, ModelMap modelMap) {
		User user = new User();
		user.setId(id);
		modelMap.addAttribute("user", user);
		return "ciblerUser";
	}

	@RequestMapping("reglerUser")
	public String reglerUser(@ModelAttribute("user") User user, ModelMap modelMap) {
		service.updateUser(user);
		List<User> users = service.getAllUsers();
		modelMap.addAttribute("users", users);
		return "toutUsers";
	}

	
	
}
