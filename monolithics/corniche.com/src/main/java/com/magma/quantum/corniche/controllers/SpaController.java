package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.magma.quantum.corniche.entities.Spa;
import com.magma.quantum.corniche.service.SpaService;

@Controller
public class SpaController {
	

	@Autowired 
	SpaService spaService;

	
/*  Spa methods*/
	
	@RequestMapping("/creerSpa")
	private String creerSpa(){
		return "creerSpa" ;
	}
	
	@RequestMapping("/enregistrerSpa")
	private String enregistrerSpa(@ModelAttribute("spa") Spa spa,ModelMap modelMap){
		Spa savedSpa = spaService.saveSpa(spa);
		String msg = "Spa Enregistré avec Id:"+savedSpa.getId();
		return "creerSpa" ;
	}
	@RequestMapping("/afficherAllSpas")
	private String afficherAllSpas(ModelMap modelMap){
		  List<Spa> spas = spaService.getAllSpas();
		  modelMap.addAttribute("spas", spas);
		return "afficherAllSpas" ;
	}
	@RequestMapping("/supprimerSpa")
	private String supprimerSpa(@RequestParam("id") Long id,ModelMap modelMap){
		Spa spa = new Spa();
		spa.setId(id);
		spaService.deleteSpa(spa);
		List<Spa> spas = spaService.getAllSpas();
		  modelMap.addAttribute("spas", spas);
		return "afficherAllSpas" ;
	}
	@RequestMapping("/ciblerSpa")
	private String ciblerSpa(@RequestParam("id") Long id,ModelMap modelMap){
		Spa updatedSpa = spaService.getSpa(id);
		modelMap.addAttribute("spa", updatedSpa);
		return "editerSpa" ;
	}
	@RequestMapping("/editerSpa")
	private String editerSpa(@ModelAttribute("spa") Spa spa,ModelMap modelMap){
		spaService.saveSpa(spa);
		List<Spa> spas = spaService.getAllSpas();
		  modelMap.addAttribute("spas", spas);
		return "afficherAllSpas" ;
	}
}
