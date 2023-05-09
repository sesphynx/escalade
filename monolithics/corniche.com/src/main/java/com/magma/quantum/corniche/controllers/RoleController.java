package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.corniche.entities.Role;
import com.magma.quantum.corniche.service.RoleService;

@Controller
public class RoleController {
	

	@Autowired 
	RoleService roleService;

	
/*  Role methods*/
	
	@RequestMapping("/creerRole")
	private String creerRole(){
		return "creerRole" ;
	}
	
	@RequestMapping("/enregistrerRole")
	private String enregistrerRole(@ModelAttribute("role") Role role,ModelMap modelMap){
		Role savedRole = roleService.saveRole(role);
		String msg = "Role Enregistré avec Id:"+savedRole.getId();
		return "creerRole" ;
	}
	@RequestMapping("/afficherAllRoles")
	private String afficherAllRoles(ModelMap modelMap){
		  List<Role> roles = roleService.getAllRoles();
		  modelMap.addAttribute("roles", roles);
		return "afficherAllRoles" ;
	}
	@RequestMapping("/supprimerRole")
	private String supprimerRole(@RequestParam("id") Long id,ModelMap modelMap){
		Role role = new Role();
		role.setId(id);
		roleService.deleteRole(role);
		List<Role> roles = roleService.getAllRoles();
		  modelMap.addAttribute("roles", roles);
		return "afficherAllRoles" ;
	}
	@RequestMapping("/ciblerRole")
	private String ciblerRole(@RequestParam("id") Long id,ModelMap modelMap){
		Role updatedRole = roleService.getRole(id);
		modelMap.addAttribute("role", updatedRole);
		return "editerRole" ;
	}
	@RequestMapping("/editerRole")
	private String editerRole(@ModelAttribute("role") Role role,ModelMap modelMap){
		roleService.saveRole(role);
		List<Role> roles = roleService.getAllRoles();
		  modelMap.addAttribute("roles", roles);
		return "afficherAllRoles" ;
	}
	
}
