package com.magma.quantum.machintech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.magma.quantum.machintech.entities.Groupe;
import com.magma.quantum.machintech.repos.GroupeRepository;

@Controller
@RequestMapping("/groupe")
public class GroupeController {


	

	@Autowired 
	GroupeRepository groupeRepository;
/*  Groupe methods*/
	@RequestMapping("/creerGroupe")
	private String creerGroupe(){
		return "creerGroupe" ;
	}
	@RequestMapping("/enregistrerGroupe")
	private String enregistrerGroupe(@ModelAttribute("groupe") Groupe groupe,ModelMap modelMap){
		Groupe savedGroupe= groupeRepository.save(groupe);
		String msg = "Operateur Enregistré avec Id:"+savedGroupe.getId();
		return "creerGroupe" ;
	}
	@RequestMapping("/afficherAllGroupes")
	private String afficherAllGroupes(ModelMap modelMap){
		  List<Groupe> groupes = groupeRepository.findAll();
		  modelMap.addAttribute("groupes", groupes);
		return "afficherAllGroupes" ;
	}
	@RequestMapping("/supprimerGroupe")
	private String supprimerGroupe(@RequestParam("id") Long id,ModelMap modelMap){
		Groupe groupe = new Groupe();
		groupe.setId(id);
		groupeRepository.delete(groupe);
		List<Groupe> groupes = groupeRepository.findAll();
		  modelMap.addAttribute("groupes", groupes);
		return "afficherAllGroupes" ;
	}
	@RequestMapping("/ciblerGroupe")
	private String ciblerGroupe(@RequestParam("id") Long id,ModelMap modelMap){
		Groupe updatedGroupe = groupeRepository.getOne(id);
		modelMap.addAttribute("groupe", updatedGroupe);
		return "editerGroupe" ;
	}
	@RequestMapping("/editerGroupe")
	private String editerGroupe(@ModelAttribute("groupe") Groupe groupe,ModelMap modelMap){
		groupeRepository.save(groupe);
		List<Groupe> groupes = groupeRepository.findAll();
		  modelMap.addAttribute("groupes", groupes);
		return "afficherAllGroupes" ;
	}
}
