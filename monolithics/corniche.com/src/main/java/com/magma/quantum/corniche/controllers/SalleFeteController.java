package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.corniche.entities.SalleFete;
import com.magma.quantum.corniche.service.SalleFeteService;

@Controller
public class SalleFeteController {
	

	@Autowired 
	SalleFeteService salleFeteService;

	
/*  SalleFete methods*/
	
	@RequestMapping("/creerSalleFete")
	private String creerSalleFete(){
		return "creerSalleFete" ;
	}
	
	@RequestMapping("/enregistrerSalleFete")
	private String enregistrerSalleFete(@ModelAttribute("salleFete") SalleFete salleFete,ModelMap modelMap){
		SalleFete savedSalleFete = salleFeteService.saveSalleFete(salleFete);
		String msg = "SalleFete Enregistré avec Id:"+savedSalleFete.getId();
		return "creerSalleFete" ;
	}
	@RequestMapping("/afficherAllSalleFetes")
	private String afficherAllSalleFetes(ModelMap modelMap){
		  List<SalleFete> salleFetes = salleFeteService.getAllSalleFetes();
		  modelMap.addAttribute("salleFetes", salleFetes);
		return "afficherAllSalleFetes" ;
	}
	@RequestMapping("/supprimerSalleFete")
	private String supprimerSalleFete(@RequestParam("id") Long id,ModelMap modelMap){
		SalleFete salleFete = new SalleFete();
		salleFete.setId(id);
		salleFeteService.deleteSalleFete(salleFete);
		List<SalleFete> salleFetes = salleFeteService.getAllSalleFetes();
		  modelMap.addAttribute("salleFetes", salleFetes);
		return "afficherAllSalleFetes" ;
	}
	@RequestMapping("/ciblerSalleFete")
	private String ciblerSalleFete(@RequestParam("id") Long id,ModelMap modelMap){
		SalleFete updatedSalleFete = salleFeteService.getSalleFete(id);
		modelMap.addAttribute("salleFete", updatedSalleFete);
		return "editerSalleFete" ;
	}
	@RequestMapping("/editerSalleFete")
	private String editerSalleFete(@ModelAttribute("salleFete") SalleFete salleFete,ModelMap modelMap){
		salleFeteService.saveSalleFete(salleFete);
		List<SalleFete> salleFetes = salleFeteService.getAllSalleFetes();
		  modelMap.addAttribute("salleFetes", salleFetes);
		return "afficherAllSalleFetes" ;
	}
}
