package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.corniche.entities.Chambre;
import com.magma.quantum.corniche.entities.Chambre;
import com.magma.quantum.corniche.repos.ChambreRepository;
import com.magma.quantum.corniche.service.ChambreService;

@Controller
@RequestMapping("/chambre")
public class ChambreController {
	@Autowired 
	ChambreService chambreService;

	
/*  Chambre methods*/
	
	@RequestMapping("/creerChambre")
	private String creerChambre(){
		return "creerChambre" ;
	}
	
	@RequestMapping("/enregistrerChambre")
	private String enregistrerChambre(@ModelAttribute("chambre") Chambre chambre,ModelMap modelMap){
		Chambre savedChambre = chambreService.saveChambre(chambre);
		String msg = "Chambre Enregistré avec Id:"+savedChambre.getId();
		return "creerChambre" ;
	}
	@RequestMapping("/afficherAllChambres")
	private String afficherAllChambres(ModelMap modelMap){
		  List<Chambre> chambres = chambreService.getAllChambres();
		  modelMap.addAttribute("chambres", chambres);
		return "afficherAllChambres" ;
	}
	@RequestMapping("/supprimerChambre")
	private String supprimerChambre(@RequestParam("id") Long id,ModelMap modelMap){
		Chambre chambre = new Chambre();
		chambre.setId(id);
		chambreService.deleteChambre(chambre);
		List<Chambre> chambres = chambreService.getAllChambres();
		  modelMap.addAttribute("chambres", chambres);
		return "afficherAllChambres" ;
	}
	@RequestMapping("/ciblerChambre")
	private String ciblerChambre(@RequestParam("id") Long id,ModelMap modelMap){
		Chambre updatedChambre = chambreService.getChambre(id);
		modelMap.addAttribute("chambre", updatedChambre);
		return "editerChambre" ;
	}
	@RequestMapping("/editerChambre")
	private String editerChambre(@ModelAttribute("chambre") Chambre chambre,ModelMap modelMap){
		chambreService.saveChambre(chambre);
		List<Chambre> chambres = chambreService.getAllChambres();
		  modelMap.addAttribute("chambres", chambres);
		return "afficherAllChambres" ;
	}
	
	

}
