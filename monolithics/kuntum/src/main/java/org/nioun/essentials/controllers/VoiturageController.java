package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Voiturage;
import org.nioun.essentials.service.VoiturageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/voiturage")
public class VoiturageController {


	@Autowired
	VoiturageService service;
	

	@RequestMapping("/ajouterVoiturage")
	public String ajouterVoiturage(ModelMap map) {
		Voiturage voiturage = new Voiturage();
		map.addAttribute(voiturage);
		return "creerVoiturage";
	}

	@RequestMapping("/sauvegarderVoiturage")
	public String sauvegarderVoiturage(@ModelAttribute("voiturage") Voiturage voiturage,
			ModelMap modelMap) {
		Voiturage voiturageSaved = service.saveVoiturage(voiturage);
		String msg = "Voiturage sauvegarder avec l' id :" + voiturageSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerVoiturage";
	}

	@RequestMapping("/toutVoiturages")
	public String toutVoiturages(ModelMap modelMap) {

		List<Voiturage> voiturages = service.getAllVoiturages();
		modelMap.addAttribute("voiturages", voiturages);
		return "toutVoiturages";
	}

	@RequestMapping("supprimerVoiturage")
	public String supprimerVoiturage(@RequestParam("id") Long id, ModelMap modelMap) {
		Voiturage voiturage = new Voiturage();
		voiturage.setId(id);
		service.deleteVoiturage(voiturage);
		List<Voiturage> voiturages = service.getAllVoiturages();
		modelMap.addAttribute("voiturages", voiturages);
		return "toutVoiturages";
	}

	@RequestMapping("/ciblerVoiturage")
	public String ciblerVoiturage(@RequestParam("id") Long  id, ModelMap modelMap) {
		Voiturage voiturage = new Voiturage();
		voiturage.setId(id);
		modelMap.addAttribute("voiturage", voiturage);
		return "ciblerVoiturage";
	}

	@RequestMapping("reglerVoiturage")
	public String reglerVoiturage(@ModelAttribute("voiturage") Voiturage voiturage, ModelMap modelMap) {
		service.updateVoiturage(voiturage);
		List<Voiturage> voiturages = service.getAllVoiturages();
		modelMap.addAttribute("voiturages", voiturages);
		return "toutVoiturages";
	}


}
