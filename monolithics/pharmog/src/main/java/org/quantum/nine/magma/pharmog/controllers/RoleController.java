package org.quantum.nine.magma.pharmog.controllers;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Role;
import org.quantum.nine.magma.pharmog.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RoleController {


	@Autowired
	RoleService service;
	

	@RequestMapping("/ajouterRole")
	public String ajouterRole(ModelMap map) {
		Role role = new Role();
		map.addAttribute(role);
		return "creerRole";
	}

	@RequestMapping("sauvegarderRole")
	public String sauvegarderRole(@ModelAttribute("role") Role role,
			ModelMap modelMap) {
		Role roleSaved = service.saveRole(role);
		String msg = "Role saved with id :" + roleSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerRole";
	}

	@RequestMapping("/toutRoles")
	public String toutRoles(ModelMap modelMap) {

		List<Role> roles = service.getAllRoles();
		modelMap.addAttribute("roles", roles);
		return "toutRoles";
	}

	@RequestMapping("supprimerRole")
	public String supprimerRole(@RequestParam("id") Long id, ModelMap modelMap) {
		Role role = new Role();
		role.setId(id);
		service.deleteRole(role);
		List<Role> roles = service.getAllRoles();
		modelMap.addAttribute("roles", roles);
		return "toutRoles";
	}

	@RequestMapping("/ciblerRole")
	public String ciblerRole(@RequestParam("id") Long  id, ModelMap modelMap) {
		Role role = new Role();
		role.setId(id);
		modelMap.addAttribute("role", role);
		return "ciblerRole";
	}

	@RequestMapping("reglerRole")
	public String reglerRole(@ModelAttribute("role") Role role, ModelMap modelMap) {
		service.updateRole(role);
		List<Role> roles = service.getAllRoles();
		modelMap.addAttribute("roles", roles);
		return "toutRoles";
	}

	


	
}
