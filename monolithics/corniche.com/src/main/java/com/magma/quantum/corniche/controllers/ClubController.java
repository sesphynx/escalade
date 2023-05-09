package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.magma.quantum.corniche.entities.Club;
import com.magma.quantum.corniche.service.ClubService;

@Controller
@RequestMapping("/club")

public class ClubController {
	
	@Autowired
	ClubService clubService; 
	
	/*  Club methods*/
	
	@RequestMapping("/creerClub")
	private String creerClub(ModelMap modelMap){
		Club club= new Club();
		clubService.saveClub(club);
		modelMap.addAttribute(club);
		
		return "creerClub" ;
	}
	@RequestMapping("/enregistrerClub")
	private String enregistrerClub (@ModelAttribute("club") Club club,ModelMap modelMap){
		Club savedClub = clubService.saveClub(club);
		String msg = "Campagne Enregistré avec Id:"+savedClub.getId();
		return "creerClub" ;
	}
	@RequestMapping("/afficherAllClubs")
	private String afficherAllClubs(ModelMap modelMap){
		  List<Club> clubs = clubService.getAllClubs();
		  modelMap.addAttribute("clubs", clubs);
		return "afficherAllClubs" ;
	}
	@RequestMapping("/supprimerClub")
	private String supprimerClub(@RequestParam("id") Long id,ModelMap modelMap){
		Club club = new Club();
		club.setId(id);
		clubService.deleteClub(club);
		List<Club> clubs = clubService.getAllClubs();
		  modelMap.addAttribute("clubs", clubs);
		return "afficherAllClubs" ;
	}
	@RequestMapping("/ciblerClub")
	private String ciblerClub(@RequestParam("id") Long id,ModelMap modelMap){
		Club club = clubService.getClubById(id);
		modelMap.addAttribute("club", club);
		return "editerClub" ;
	}
	@RequestMapping("/editerClub")
	private String editerClub(@ModelAttribute("club") Club club,ModelMap modelMap){
		clubService.saveClub(club);
		List<Club> clubs = clubService.getAllClubs();
		  modelMap.addAttribute("clubs", clubs);
		return "afficherAllClubs" ;
	}
	
}
