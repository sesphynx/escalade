package com.magma.quantum.machintech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.machintech.entities.Role;
import com.magma.quantum.machintech.repos.RoleRepository;

@Controller
public class RoleController {

	@Autowired 
	RoleRepository roleRepository;
	
	
	/*  Role methods*/
	
	
	
	@RequestMapping("/creerRole")
	private String creerRole(){
		return "creerRole" ;
		
	}
	@RequestMapping("/enregistrerRole")
	private String enregistrerRole(@ModelAttribute("role") Role role,ModelMap modelMap){
		Role savedRole = roleRepository.save(role);
		String msg = ("Role Enregistré avec Id:"+savedRole.getId());
		return "creerRole" ;
	}
	@RequestMapping("/afficherAllRoles")
	private String afficherAllRoles(ModelMap modelMap){
		  List<Role> roles = roleRepository.findAll();
		  modelMap.addAttribute("roles",roles);
		return "afficherAllRoles" ;
	}
	@RequestMapping("/supprimerRole")
	private String supprimerRole(@RequestParam("id") Long id,ModelMap modelMap){
		Role role = new Role();
		role.setId(id);
		roleRepository.delete(role);
		List<Role> roles = roleRepository.findAll();
		  modelMap.addAttribute("roles", roles);
		return "afficherAllRoles" ;
	}
	@RequestMapping("/ciblerRole")
	private String ciblerRole(@RequestParam("id") Long id,ModelMap modelMap){
		Role role = roleRepository.getOne(id);
		modelMap.addAttribute("Role", role);
		return "editerRole" ;
	}
	@RequestMapping("/editerRole")
	private String editerRole(@ModelAttribute("role") Role role,ModelMap modelMap){
		roleRepository.save(role);
		List<Role> roles = roleRepository.findAll();
		  modelMap.addAttribute("roles",roles);
		return "afficherAllRoles" ;
	}

}
