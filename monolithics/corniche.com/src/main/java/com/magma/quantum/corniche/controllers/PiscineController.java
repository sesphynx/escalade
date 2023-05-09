package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.corniche.entities.Piscine;
import com.magma.quantum.corniche.service.PiscineService;

@Controller
public class PiscineController {
	

	@Autowired 
	PiscineService piscineService;

	
/*  Piscine methods*/
	
	@RequestMapping("/creerPiscine")
	private String creerPiscine(){
		return "creerPiscine" ;
	}
	
	@RequestMapping("/enregistrerPiscine")
	private String enregistrerPiscine(@ModelAttribute("piscine") Piscine piscine,ModelMap modelMap){
		Piscine savedPiscine = piscineService.savePiscine(piscine);
		String msg = "Piscine Enregistré avec Id:"+savedPiscine.getId();
		return "creerPiscine" ;
	}
	@RequestMapping("/afficherAllPiscines")
	private String afficherAllPiscines(ModelMap modelMap){
		  List<Piscine> piscines = piscineService.getAllPiscines();
		  modelMap.addAttribute("piscines", piscines);
		return "afficherAllPiscines" ;
	}
	@RequestMapping("/supprimerPiscine")
	private String supprimerPiscine(@RequestParam("id") Long id,ModelMap modelMap){
		Piscine piscine = new Piscine();
		piscine.setId(id);
		piscineService.deletePiscine(piscine);
		List<Piscine> piscines = piscineService.getAllPiscines();
		  modelMap.addAttribute("piscines", piscines);
		return "afficherAllPiscines" ;
	}
	@RequestMapping("/ciblerPiscine")
	private String ciblerPiscine(@RequestParam("id") Long id,ModelMap modelMap){
		Piscine updatedPiscine = piscineService.getPiscine(id);
		modelMap.addAttribute("piscine", updatedPiscine);
		return "editerPiscine" ;
	}
	@RequestMapping("/editerPiscine")
	private String editerPiscine(@ModelAttribute("piscine") Piscine piscine,ModelMap modelMap){
		piscineService.savePiscine(piscine);
		List<Piscine> piscines = piscineService.getAllPiscines();
		  modelMap.addAttribute("piscines", piscines);
		return "afficherAllPiscines" ;
	}	
}
