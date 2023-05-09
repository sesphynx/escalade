package org.nioun.essentials.machinter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.nioun.essentials.machinter.model.Operateur;
import org.nioun.essentials.machinter.repo.OperateurRepository;
import org.nioun.essentials.machinter.service.OperateurService;

@Controller
@RequestMapping("/operateur")
public class OperateurController {
	
	

	@Autowired 
	OperateurService operateurService;

	
/*  Operateur methods*/
	
	@RequestMapping("/creerOperateur")
	private String creerOperateur(ModelMap map){
		Operateur operateur = new Operateur ();
		operateurService.saveOperateur(operateur);
		map.addAttribute("operateur", operateur);
		return "creerOperateur" ;
	}
	
	@RequestMapping("/enregistrerOperateur")
	private String enregistrerOperateur(@ModelAttribute("operateur") Operateur operateur,ModelMap modelMap){
		Operateur savedOperateur = operateurService.saveOperateur(operateur);
		String msg = "Operateur Enregistré avec Id:"+savedOperateur.getId();
		return "creerOperateur" ;
	}
	@RequestMapping("/afficherAllOperateurs")
	private String afficherAllOperateurs(ModelMap modelMap){
		  List<Operateur> operateurs = operateurService.getAllOperateurs();
		  modelMap.addAttribute("operateurs", operateurs);
		return "afficherAllOperateurs" ;
	}
	@RequestMapping("/supprimerOperateur")
	private String supprimerOperateur(@RequestParam("id") Long id,ModelMap modelMap){
		Operateur operateur = new Operateur();
		operateur.setId(id);
		operateurService.deleteOperateur(operateur);
		List<Operateur> operateurs = operateurService.getAllOperateurs();
		  modelMap.addAttribute("operateurs", operateurs);
		return "afficherAllOperateurs" ;
	}
	@RequestMapping("/ciblerOperateur")
	private String ciblerOperateur(@RequestParam("id") Long id,ModelMap modelMap){
		Operateur updatedOperateur = operateurService.getOperateurById(id);
		modelMap.addAttribute("operateur", updatedOperateur);
		return "editerOperateur" ;
	}
	@RequestMapping("/editerOperateur")
	private String editerOperateur(@ModelAttribute("operateur") Operateur operateur,ModelMap modelMap){
		operateurService.saveOperateur(operateur);
		List<Operateur> operateurs = operateurService.getAllOperateurs();
		  modelMap.addAttribute("operateurs", operateurs);
		return "afficherAllOperateurs" ;
	}
	
	

}
