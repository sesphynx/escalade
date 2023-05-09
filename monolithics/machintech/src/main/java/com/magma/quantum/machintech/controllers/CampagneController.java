package com.magma.quantum.machintech.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.magma.quantum.machintech.entities.Campagne;
import com.magma.quantum.machintech.entities.Operateur;
import com.magma.quantum.machintech.service.CampagneService;
import com.magma.quantum.machintech.service.OperateurService;

@Controller
public class CampagneController {
	
	@Autowired
	CampagneService campagneService; 
	
	@Autowired
	OperateurService operateurService; 
	
	
	
	
/*  Campagne methods*/
	
	@RequestMapping("/creerCampagne")
	private String creerCampagne(ModelMap modelMap){
		Campagne campagne= new Campagne();
		campagneService.saveCampagne(campagne);
		modelMap.addAttribute(campagne);
		List<Operateur> allOperateurs = operateurService.getAllOperateurs();
		modelMap.addAttribute("allOperateurs", allOperateurs);
		
		return "creerCampagne" ;
	}
	@RequestMapping("/enregistrerCampagne")
	private String enregistrerCampagne(@ModelAttribute("campagne") Campagne campagne,ModelMap modelMap){
		Campagne savedCampagne = campagneService.saveCampagne(campagne);
		String msg = "Campagne Enregistré avec Id:"+savedCampagne.getId();
		return "creerCampagne" ;
	}
	@RequestMapping("/afficherAllCampagnes")
	private String afficherAllCampagnes(ModelMap modelMap){
		  List<Campagne> campagnes = campagneService.getAllCampagnes();
		  modelMap.addAttribute("campagnes", campagnes);
		return "afficherAllCampagnes" ;
	}
	@RequestMapping("/supprimerCampagne")
	private String supprimerCampagne(@RequestParam("id") Long id,ModelMap modelMap){
		Campagne campagne = new Campagne();
		campagne.setId(id);
		campagneService.deleteCampagne(campagne);
		List<Campagne> campagnes = campagneService.getAllCampagnes();
		  modelMap.addAttribute("campagnes", campagnes);
		return "afficherAllCampagnes" ;
	}
	@RequestMapping("/ciblerCampagne")
	private String ciblerCampagne(@RequestParam("id") Long id,ModelMap modelMap){
		Campagne campagne = campagneService.getCampagneById(id);
		modelMap.addAttribute("campagne", campagne);
		return "editerCampagne" ;
	}
	@RequestMapping("/editerCampagne")
	private String editerCampagne(@ModelAttribute("campagne") Campagne campagne,ModelMap modelMap){
		campagneService.saveCampagne(campagne);
		List<Campagne> campagnes = campagneService.getAllCampagnes();
		  modelMap.addAttribute("campagnes", campagnes);
		return "afficherAllCampagnes" ;
	}
	
}
