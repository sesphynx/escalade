package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.magma.quantum.corniche.entities.Hangar;
import com.magma.quantum.corniche.service.HangarService;

@Controller
public class HangarController {
	

	@Autowired 
	HangarService hangarService;

	
/*  Hangar methods*/
	
	@RequestMapping("/creerHangar")
	private String creerHangar(){
		return "creerHangar" ;
	}
	
	@RequestMapping("/enregistrerHangar")
	private String enregistrerHangar(@ModelAttribute("hangar") Hangar hangar,ModelMap modelMap){
		Hangar savedHangar = hangarService.saveHangar(hangar);
		String msg = "Hangar Enregistré avec Id:"+savedHangar.getId();
		return "creerHangar" ;
	}
	@RequestMapping("/afficherAllHangars")
	private String afficherAllHangars(ModelMap modelMap){
		  List<Hangar> hangars = hangarService.getAllHangars();
		  modelMap.addAttribute("hangars", hangars);
		return "afficherAllHangars" ;
	}
	@RequestMapping("/supprimerHangar")
	private String supprimerHangar(@RequestParam("id") Long id,ModelMap modelMap){
		Hangar hangar = new Hangar();
		hangar.setId(id);
		hangarService.deleteHangar(hangar);
		List<Hangar> hangars = hangarService.getAllHangars();
		  modelMap.addAttribute("hangars", hangars);
		return "afficherAllHangars" ;
	}
	@RequestMapping("/ciblerHangar")
	private String ciblerHangar(@RequestParam("id") Long id,ModelMap modelMap){
		Hangar updatedHangar = hangarService.getHangar(id);
		modelMap.addAttribute("hangar", updatedHangar);
		return "editerHangar" ;
	}
	@RequestMapping("/editerHangar")
	private String editerHangar(@ModelAttribute("hangar") Hangar hangar,ModelMap modelMap){
		hangarService.saveHangar(hangar);
		List<Hangar> hangars = hangarService.getAllHangars();
		  modelMap.addAttribute("hangars", hangars);
		return "afficherAllHangars" ;
	}
}
