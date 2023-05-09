package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.magma.quantum.corniche.entities.Logis;
import com.magma.quantum.corniche.service.LogisService;

@Controller
public class LogisController {
	

	@Autowired 
	LogisService logisService;

	
/*  Logis methods*/
	
	@RequestMapping("/creerLogis")
	private String creerLogis(){
		return "creerLogis" ;
	}
	
	@RequestMapping("/enregistrerLogis")
	private String enregistrerLogis(@ModelAttribute("logis") Logis logis,ModelMap modelMap){
		Logis savedLogis = logisService.saveLogis(logis);
		String msg = "Logis Enregistré avec Id:"+savedLogis.getId();
		return "creerLogis" ;
	}
	@RequestMapping("/afficherAllLogiss")
	private String afficherAllLogiss(ModelMap modelMap){
		  List<Logis> logiss = logisService.getAllLogiss();
		  modelMap.addAttribute("logiss", logiss);
		return "afficherAllLogiss" ;
	}
	@RequestMapping("/supprimerLogis")
	private String supprimerLogis(@RequestParam("id") Long id,ModelMap modelMap){
		Logis logis = new Logis();
		logis.setId(id);
		logisService.deleteLogis(logis);
		List<Logis> logiss = logisService.getAllLogiss();
		  modelMap.addAttribute("logiss", logiss);
		return "afficherAllLogiss" ;
	}
	@RequestMapping("/ciblerLogis")
	private String ciblerLogis(@RequestParam("id") Long id,ModelMap modelMap){
		Logis updatedLogis = logisService.getLogis(id);
		modelMap.addAttribute("logis", updatedLogis);
		return "editerLogis" ;
	}
	@RequestMapping("/editerLogis")
	private String editerLogis(@ModelAttribute("logis") Logis logis,ModelMap modelMap){
		logisService.saveLogis(logis);
		List<Logis> logiss = logisService.getAllLogiss();
		  modelMap.addAttribute("logiss", logiss);
		return "afficherAllLogiss" ;
	}
}
