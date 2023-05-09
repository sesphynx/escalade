package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.corniche.entities.SalleReunion;
import com.magma.quantum.corniche.service.SalleReunionService;

@Controller
public class SalleReunionController {
	

	@Autowired 
	SalleReunionService salleReunionService;

	
/*  SalleReunion methods*/
	
	@RequestMapping("/creerSalleReunion")
	private String creerSalleReunion(){
		return "creerSalleReunion" ;
	}
	
	@RequestMapping("/enregistrerSalleReunion")
	private String enregistrerSalleReunion(@ModelAttribute("salleReunion") SalleReunion salleReunion,ModelMap modelMap){
		SalleReunion savedSalleReunion = salleReunionService.saveSalleReunion(salleReunion);
		String msg = "SalleReunion Enregistré avec Id:"+savedSalleReunion.getId();
		return "creerSalleReunion" ;
	}
	@RequestMapping("/afficherAllSalleReunions")
	private String afficherAllSalleReunions(ModelMap modelMap){
		  List<SalleReunion> salleReunions = salleReunionService.getAllSalleReunions();
		  modelMap.addAttribute("salleReunions", salleReunions);
		return "afficherAllSalleReunions" ;
	}
	@RequestMapping("/supprimerSalleReunion")
	private String supprimerSalleReunion(@RequestParam("id") Long id,ModelMap modelMap){
		SalleReunion salleReunion = new SalleReunion();
		salleReunion.setId(id);
		salleReunionService.deleteSalleReunion(salleReunion);
		List<SalleReunion> salleReunions = salleReunionService.getAllSalleReunions();
		  modelMap.addAttribute("salleReunions", salleReunions);
		return "afficherAllSalleReunions" ;
	}
	@RequestMapping("/ciblerSalleReunion")
	private String ciblerSalleReunion(@RequestParam("id") Long id,ModelMap modelMap){
		SalleReunion updatedSalleReunion = salleReunionService.getSalleReunion(id);
		modelMap.addAttribute("salleReunion", updatedSalleReunion);
		return "editerSalleReunion" ;
	}
	@RequestMapping("/editerSalleReunion")
	private String editerSalleReunion(@ModelAttribute("salleReunion") SalleReunion salleReunion,ModelMap modelMap){
		salleReunionService.saveSalleReunion(salleReunion);
		List<SalleReunion> salleReunions = salleReunionService.getAllSalleReunions();
		  modelMap.addAttribute("salleReunions", salleReunions);
		return "afficherAllSalleReunions" ;
	}
}
