package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.magma.quantum.corniche.entities.Collation;
import com.magma.quantum.corniche.service.CollationService;

@Controller
@RequestMapping("/collation")
public class CollationController {
	

	@Autowired 
	CollationService collationService;

	
/*  Collation methods*/
	
	@RequestMapping("/creerCollation")
	private String creerCollation(){
		return "creerCollation" ;
	}
	
	@RequestMapping("/enregistrerCollation")
	private String enregistrerCollation(@ModelAttribute("collation") Collation collation,ModelMap modelMap){
		Collation savedCollation = collationService.saveCollation(collation);
		String msg = "Collation Enregistré avec Id:"+savedCollation.getId();
		return "creerCollation" ;
	}
	@RequestMapping("/afficherAllCollations")
	private String afficherAllCollations(ModelMap modelMap){
		  List<Collation> collations = collationService.getAllCollations();
		  modelMap.addAttribute("collations", collations);
		return "afficherAllCollations" ;
	}
	@RequestMapping("/supprimerCollation")
	private String supprimerCollation(@RequestParam("id") Long id,ModelMap modelMap){
		Collation collation = new Collation();
		collation.setId(id);
		collationService.deleteCollation(collation);
		List<Collation> collations = collationService.getAllCollations();
		  modelMap.addAttribute("collations", collations);
		return "afficherAllCollations" ;
	}
	@RequestMapping("/ciblerCollation")
	private String ciblerCollation(@RequestParam("id") Long id,ModelMap modelMap){
		Collation updatedCollation = collationService.getCollation(id);
		modelMap.addAttribute("collation", updatedCollation);
		return "editerCollation" ;
	}
	@RequestMapping("/editerCollation")
	private String editerCollation(@ModelAttribute("collation") Collation collation,ModelMap modelMap){
		collationService.saveCollation(collation);
		List<Collation> collations = collationService.getAllCollations();
		  modelMap.addAttribute("collations", collations);
		return "afficherAllCollations" ;
	}
	

}
