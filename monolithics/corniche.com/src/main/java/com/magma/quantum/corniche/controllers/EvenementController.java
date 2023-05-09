package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.corniche.entities.Evenement;
import com.magma.quantum.corniche.service.EvenementService;

@Controller
public class EvenementController {
	@Autowired 
	EvenementService evenementService;

/*  Evenement methods*/
	
	@RequestMapping("/creerEvenement")
	private String creerEvenement(){
		return "creerEvenement" ;
	}
	
	@RequestMapping("/enregistrerEvenement")
	private String enregistrerEvenement(@ModelAttribute("evenement") Evenement evenement,ModelMap modelMap){
		Evenement savedEvenement = evenementService.saveEvenement(evenement);
		String msg = "Evenement Enregistré avec Id:"+savedEvenement.getId();
		return "creerEvenement" ;
	}
	@RequestMapping("/afficherAllEvenements")
	private String afficherAllEvenements(ModelMap modelMap){
		  List<Evenement> evenements = evenementService.getAllEvenements();
		  modelMap.addAttribute("evenements", evenements);
		return "afficherAllEvenements" ;
	}
	@RequestMapping("/supprimerEvenement")
	private String supprimerEvenement(@RequestParam("id") Long id,ModelMap modelMap){
		Evenement evenement = new Evenement();
		evenement.setId(id);
		evenementService.deleteEvenement(evenement);
		List<Evenement> evenements = evenementService.getAllEvenements();
		  modelMap.addAttribute("evenements", evenements);
		return "afficherAllEvenements" ;
	}
	@RequestMapping("/ciblerEvenement")
	private String ciblerEvenement(@RequestParam("id") Long id,ModelMap modelMap){
		Evenement updatedEvenement = evenementService.getEvenement(id);
		modelMap.addAttribute("evenement", updatedEvenement);
		return "editerEvenement" ;
	}
	@RequestMapping("/editerEvenement")
	private String editerEvenement(@ModelAttribute("evenement") Evenement evenement,ModelMap modelMap){
		evenementService.saveEvenement(evenement);
		List<Evenement> evenements = evenementService.getAllEvenements();
		  modelMap.addAttribute("evenements", evenements);
		return "afficherAllEvenements" ;
	}
}
