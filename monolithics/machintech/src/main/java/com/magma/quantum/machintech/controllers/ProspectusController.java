package com.magma.quantum.machintech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.machintech.entities.Prospectus;
import com.magma.quantum.machintech.repos.ProspectusRepository;

@Controller
public class ProspectusController {
	@Autowired
	ProspectusRepository prospectusRepository ;
	
	/*  Prospectusmethods*/
	
	@RequestMapping("/creerProspectus")
	private String creerProspectus(){
		return "creerProspectus" ;
		
	}
	@RequestMapping("/enregistrerProspectus")
	private String enregistrerProspectus(@ModelAttribute("Prospectus") Prospectus prospectus,ModelMap modelMap){
		Prospectus  savedProspectus= prospectusRepository.save(prospectus);
		String msg = ("Prospectus Enregistré avec Id:"+savedProspectus.getId());
		return "creerProspectus" ;
	}
	@RequestMapping("/afficherAllProspectuss")
	private String afficherAllProspectuss(ModelMap modelMap){
		  List<Prospectus> prospectuss = prospectusRepository.findAll();
		  modelMap.addAttribute("prospectuss",prospectuss);
		return "afficherAllProspectuss" ;
	}
	@RequestMapping("/supprimerProspectus")
	private String supprimerProspectus(@RequestParam("id") Long id,ModelMap modelMap){
		Prospectus prospectus= new Prospectus();
		prospectus.setId(id);
		prospectusRepository.delete(prospectus);
		List<Prospectus> prospectuss = prospectusRepository.findAll();
		  modelMap.addAttribute("prospectuss", prospectuss);
		return "afficherAllProspectuss" ;
	}
	@RequestMapping("/ciblerProspectus")
	private String ciblerProspectus(@RequestParam("id") Long id,ModelMap modelMap){
		Prospectus prospectus= prospectusRepository.getOne(id);
		modelMap.addAttribute("prospectus", prospectus);
		return "editerProspectus" ;
	}
	
	@RequestMapping("/editerProspectus")
	private String editerProspectus(@ModelAttribute("prospectus") Prospectus prospectus,ModelMap modelMap){
		prospectusRepository.save(prospectus);
		List<Prospectus> prospectuss = prospectusRepository.findAll();
		  modelMap.addAttribute("prospectuss",prospectuss);
		return "afficherAllProspectuss" ;
	}
	
	
	@RequestMapping("/afficherProspectus")
	private String afficherProspectus(@RequestParam("id") Long id,ModelMap modelMap){
		Prospectus prospectus= prospectusRepository.getOne(id);
		modelMap.addAttribute("prospectus", prospectus);
		return "afficherProspectus" ;
	}
	
	@RequestMapping("/codifierProspectus")
	private String codifierProspectus(@ModelAttribute("prospectus") Prospectus prospectus,ModelMap modelMap){
		prospectusRepository.save(prospectus);
		List<Prospectus> prospectuss = prospectusRepository.findAll();
		  modelMap.addAttribute("prospectuss",prospectuss);
		return "afficherAllProspectuss" ;
	}
}
