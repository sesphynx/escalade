package org.nioun.essentials.machinter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.nioun.essentials.machinter.model.Offre;
import org.nioun.essentials.machinter.model.Operateur;
import org.nioun.essentials.machinter.service.OffreService;
import org.nioun.essentials.machinter.service.OperateurService;

@Controller
@RequestMapping("/offre")
public class OffreController {
	
	@Autowired
	OffreService offreService;
	
	@Autowired
	OperateurService operateurService;
	
	
/*  Offre methods*/
	
	@GetMapping(path="/creerOffre")
	public String creerOffre(ModelMap modelMap){
		Offre offre = new Offre();
		offreService.saveOffre(offre);
		modelMap.addAttribute(offre);
		List<Operateur> allOperateurs = operateurService.getAllOperateurs();
		modelMap.addAttribute("allOperateurs", allOperateurs);
		return "creerOffre" ;
	}
	@PostMapping(path="/enregistrerOffre" )
	public String enregistrerOffre(@RequestParam Long operateurId ,@ModelAttribute("Offre") Offre offre,ModelMap modelMap){
		
		Operateur operateurOffre = operateurService.getOperateurById(operateurId);
		offre.setOperateur(operateurOffre);
		Offre savedOffre = offreService.saveOffre(offre);
		String msg = "Offre Enregistré avec Id:"+savedOffre.getId();
		modelMap.addAttribute("msg", msg);
		return "creerOffre" ;
	}
	@GetMapping(path = "/afficherAllOffres" )
	public String afficherAllOffres(ModelMap modelMap){
		  List<Offre> offres = offreService.getAllOffres();
		  modelMap.addAttribute("offres", offres);
		return "afficherAllOffres" ;
	}
	@DeleteMapping(path="/supprimerOffre" )
	public String supprimerOffre(@RequestParam("id") Long id,ModelMap modelMap){
		Offre offre = new Offre();
		offre.setId(id);
		offreService.deleteOffre(offre);
		List<Offre> offres = offreService.getAllOffres();
		  modelMap.addAttribute("offres", offres);
		return "afficherAllOffres" ;
	}
	@GetMapping(path="/ciblerOffre" )
	public String ciblerOffre(@RequestParam("id") Long id,ModelMap modelMap){
		Offre offre = offreService.getOffreById(id);
		modelMap.addAttribute("offre", offre);
		return "editerOffre" ;
	}
	@PutMapping(path="/editerOffre" )
	public String editerOffre(@ModelAttribute("offre") Offre offre,ModelMap modelMap){
		offreService.saveOffre(offre);
		List<Offre> offres = offreService.getAllOffres();
		  modelMap.addAttribute("offres", offres);
		return "afficherAllOffres" ;
	}
	

}
