package com.magma.quantum.politicone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.politicone.entities.Pays;
import com.magma.quantum.politicone.entities.Role;
import com.magma.quantum.politicone.service.RoleService;

@Controller
public class RoleController {


	@Autowired
	RoleService service;
	

	@RequestMapping("/showCreateRole")
	public String showCreateRole(ModelMap map) {
		Role role = new Role();
		map.addAttribute(role);
		return "createRole";
	}

	@RequestMapping("/saveRole")
	public String saveRole(@ModelAttribute("role") Role role,@ModelAttribute("pays") Pays pays,
			ModelMap modelMap) {
		Role roleSaved = service.saveRole(role);
		String msg = "Role saved with id :" + roleSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "createRole";
	}

	@RequestMapping("/displayRoles")
	public String displayRoles(ModelMap modelMap) {

		List<Role> roles = service.getAllRoles();
		modelMap.addAttribute("roles", roles);
		return "displayRoles";
	}

	@RequestMapping("deleteRole")
	public String deleteRole(@RequestParam("id") Long id, ModelMap modelMap) {
		Role role = new Role();
		role.setId(id);
		service.deleteRole(role);
		List<Role> roles = service.getAllRoles();
		modelMap.addAttribute("roles", roles);
		return "displayRoles";
	}

	@RequestMapping("/showUpdateRole")
	public String showUpdateRole(@RequestParam("id") Long  id, ModelMap modelMap) {
		Role role = new Role();
		role.setId(id);
		modelMap.addAttribute("role", role);
		return "updateRole";
	}

	@RequestMapping("updateRole")
	public String updateRole(@ModelAttribute("role") Role role, ModelMap modelMap) {
		service.updateRole(role);
		List<Role> roles = service.getAllRoles();
		modelMap.addAttribute("roles", roles);
		return "displayRoles";
	}

	


	
}
