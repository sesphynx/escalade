package com.magma.quantum.machintech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.machintech.entities.Operateur;
import com.magma.quantum.machintech.repos.OperateurRepository;

@Controller
@RequestMapping("/operateur")
public class OperateurController {
	
	

	@Autowired 
	OperateurRepository operateurRepository;

	
/*  Operateur methods*/
	
	@RequestMapping("/creerOperateur")
	private String creerOperateur(){
		return "creerOperateur" ;
	}
	
	@RequestMapping("/enregistrerOperateur")
	private String enregistrerOperateur(@ModelAttribute("operateur") Operateur operateur,ModelMap modelMap){
		Operateur savedOperateur = operateurRepository.save(operateur);
		String msg = "Operateur Enregistré avec Id:"+savedOperateur.getId();
		return "creerOperateur" ;
	}
	@RequestMapping("/afficherAllOperateurs")
	private String afficherAllOperateurs(ModelMap modelMap){
		  List<Operateur> operateurs = operateurRepository.findAll();
		  modelMap.addAttribute("operateurs", operateurs);
		return "afficherAllOperateurs" ;
	}
	@RequestMapping("/supprimerOperateur")
	private String supprimerOperateur(@RequestParam("id") Long id,ModelMap modelMap){
		Operateur operateur = new Operateur();
		operateur.setId(id);
		operateurRepository.delete(operateur);
		List<Operateur> operateurs = operateurRepository.findAll();
		  modelMap.addAttribute("operateurs", operateurs);
		return "afficherAllOperateurs" ;
	}
	@RequestMapping("/ciblerOperateur")
	private String ciblerOperateur(@RequestParam("id") Long id,ModelMap modelMap){
		Operateur updatedOperateur = operateurRepository.getOne(id);
		modelMap.addAttribute("operateur", updatedOperateur);
		return "editerOperateur" ;
	}
	@RequestMapping("/editerOperateur")
	private String editerOperateur(@ModelAttribute("operateur") Operateur operateur,ModelMap modelMap){
		operateurRepository.save(operateur);
		List<Operateur> operateurs = operateurRepository.findAll();
		  modelMap.addAttribute("operateurs", operateurs);
		return "afficherAllOperateurs" ;
	}
	
	

}
