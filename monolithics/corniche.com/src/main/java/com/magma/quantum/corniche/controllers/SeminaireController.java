package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.corniche.entities.Seminaire;
import com.magma.quantum.corniche.service.SeminaireService;

@Controller
public class SeminaireController {

	

	@Autowired 
	SeminaireService seminaireService;

	
/*  Seminaire methods*/
	
	@RequestMapping("/creerSeminaire")
	private String creerSeminaire(){
		return "creerSeminaire" ;
	}
	
	@RequestMapping("/enregistrerSeminaire")
	private String enregistrerSeminaire(@ModelAttribute("seminaire") Seminaire seminaire,ModelMap modelMap){
		Seminaire savedSeminaire = seminaireService.saveSeminaire(seminaire);
		String msg = "Seminaire Enregistré avec Id:"+savedSeminaire.getId();
		return "creerSeminaire" ;
	}
	@RequestMapping("/afficherAllSeminaires")
	private String afficherAllSeminaires(ModelMap modelMap){
		  List<Seminaire> seminaires = seminaireService.getAllSeminaires();
		  modelMap.addAttribute("seminaires", seminaires);
		return "afficherAllSeminaires" ;
	}
	@RequestMapping("/supprimerSeminaire")
	private String supprimerSeminaire(@RequestParam("id") Long id,ModelMap modelMap){
		Seminaire seminaire = new Seminaire();
		seminaire.setId(id);
		seminaireService.deleteSeminaire(seminaire);
		List<Seminaire> seminaires = seminaireService.getAllSeminaires();
		  modelMap.addAttribute("seminaires", seminaires);
		return "afficherAllSeminaires" ;
	}
	@RequestMapping("/ciblerSeminaire")
	private String ciblerSeminaire(@RequestParam("id") Long id,ModelMap modelMap){
		Seminaire updatedSeminaire = seminaireService.getSeminaire(id);
		modelMap.addAttribute("seminaire", updatedSeminaire);
		return "editerSeminaire" ;
	}
	@RequestMapping("/editerSeminaire")
	private String editerSeminaire(@ModelAttribute("seminaire") Seminaire seminaire,ModelMap modelMap){
		seminaireService.saveSeminaire(seminaire);
		List<Seminaire> seminaires = seminaireService.getAllSeminaires();
		  modelMap.addAttribute("seminaires", seminaires);
		return "afficherAllSeminaires" ;
	}
	
}
