package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Voiture;
import org.nioun.essentials.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/voiture")
public class VoitureController {


	@Autowired
	VoitureService service;
	

	@RequestMapping("/ajouterVoiture")
	public String ajouterVoiture(ModelMap map) {
		Voiture voiture = new Voiture();
		map.addAttribute(voiture);
		return "creerVoiture";
	}

	@RequestMapping("/sauvegarderVoiture")
	public String sauvegarderVoiture(@ModelAttribute("voiture") Voiture voiture,
			ModelMap modelMap) {
		Voiture voitureSaved = service.saveVoiture(voiture);
		String msg = "Voiture sauvegarder avec l' id :" + voitureSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerVoiture";
	}

	@RequestMapping("/toutVoitures")
	public String toutVoitures(ModelMap modelMap) {

		List<Voiture> voitures = service.getAllVoitures();
		modelMap.addAttribute("voitures", voitures);
		return "toutVoitures";
	}

	@RequestMapping("supprimerVoiture")
	public String supprimerVoiture(@RequestParam("id") Long id, ModelMap modelMap) {
		Voiture voiture = new Voiture();
		voiture.setId(id);
		service.deleteVoiture(voiture);
		List<Voiture> voitures = service.getAllVoitures();
		modelMap.addAttribute("voitures", voitures);
		return "toutVoitures";
	}

	@RequestMapping("/ciblerVoiture")
	public String ciblerVoiture(@RequestParam("id") Long  id, ModelMap modelMap) {
		Voiture voiture = new Voiture();
		voiture.setId(id);
		modelMap.addAttribute("voiture", voiture);
		return "ciblerVoiture";
	}

	@RequestMapping("reglerVoiture")
	public String reglerVoiture(@ModelAttribute("voiture") Voiture voiture, ModelMap modelMap) {
		service.updateVoiture(voiture);
		List<Voiture> voitures = service.getAllVoitures();
		modelMap.addAttribute("voitures", voitures);
		return "toutVoitures";
	}


}
