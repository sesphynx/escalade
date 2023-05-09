package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.corniche.entities.Jeux;
import com.magma.quantum.corniche.service.JeuxService;

@Controller
public class JeuxController {
	

	@Autowired 
	JeuxService jeuxService;

	
/*  Jeux methods*/
	
	@RequestMapping("/creerJeux")
	private String creerJeux(){
		return "creerJeux" ;
	}
	
	@RequestMapping("/enregistrerJeux")
	private String enregistrerJeux(@ModelAttribute("jeux") Jeux jeux,ModelMap modelMap){
		Jeux savedJeux = jeuxService.saveJeux(jeux);
		String msg = "Jeux Enregistré avec Id:"+savedJeux.getId();
		return "creerJeux" ;
	}
	@RequestMapping("/afficherAllJeuxs")
	private String afficherAllJeuxs(ModelMap modelMap){
		  List<Jeux> jeuxs = jeuxService.getAllJeuxs();
		  modelMap.addAttribute("jeuxs", jeuxs);
		return "afficherAllJeuxs" ;
	}
	@RequestMapping("/supprimerJeux")
	private String supprimerJeux(@RequestParam("id") Long id,ModelMap modelMap){
		Jeux jeux = new Jeux();
		jeux.setId(id);
		jeuxService.deleteJeux(jeux);
		List<Jeux> jeuxs = jeuxService.getAllJeuxs();
		  modelMap.addAttribute("jeuxs", jeuxs);
		return "afficherAllJeuxs" ;
	}
	@RequestMapping("/ciblerJeux")
	private String ciblerJeux(@RequestParam("id") Long id,ModelMap modelMap){
		Jeux updatedJeux = jeuxService.getJeux(id);
		modelMap.addAttribute("jeux", updatedJeux);
		return "editerJeux" ;
	}
	@RequestMapping("/editerJeux")
	private String editerJeux(@ModelAttribute("jeux") Jeux jeux,ModelMap modelMap){
		jeuxService.saveJeux(jeux);
		List<Jeux> jeuxs = jeuxService.getAllJeuxs();
		  modelMap.addAttribute("jeuxs", jeuxs);
		return "afficherAllJeuxs" ;
	}
}
