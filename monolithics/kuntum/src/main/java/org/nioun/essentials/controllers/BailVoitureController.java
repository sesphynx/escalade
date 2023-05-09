package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.BailVoiture;
import org.nioun.essentials.service.BailVoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bailVoiture")
public class BailVoitureController {


	@Autowired
	BailVoitureService service;
	

	@RequestMapping("/ajouterBailVoiture")
	public String ajouterBailVoiture(ModelMap map) {
		BailVoiture bailVoiture = new BailVoiture();
		map.addAttribute(bailVoiture);
		return "creerBailVoiture";
	}

	@RequestMapping("/sauvegarderBailVoiture")
	public String sauvegarderBailVoiture(@ModelAttribute("bailVoiture") BailVoiture bailVoiture,
			ModelMap modelMap) {
		BailVoiture bailVoitureSaved = service.saveBailVoiture(bailVoiture);
		String msg = "BailVoiture sauvegarder avec l' id :" + bailVoitureSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerBailVoiture";
	}

	@RequestMapping("/toutBailVoitures")
	public String toutBailVoitures(ModelMap modelMap) {

		List<BailVoiture> bailVoitures = service.getAllBailVoitures();
		modelMap.addAttribute("bailVoitures", bailVoitures);
		return "toutBailVoitures";
	}

	@RequestMapping("supprimerBailVoiture")
	public String supprimerBailVoiture(@RequestParam("id") Long id, ModelMap modelMap) {
		BailVoiture bailVoiture = new BailVoiture();
		bailVoiture.setId(id);
		service.deleteBailVoiture(bailVoiture);
		List<BailVoiture> bailVoitures = service.getAllBailVoitures();
		modelMap.addAttribute("bailVoitures", bailVoitures);
		return "toutBailVoitures";
	}

	@RequestMapping("/ciblerBailVoiture")
	public String ciblerBailVoiture(@RequestParam("id") Long  id, ModelMap modelMap) {
		BailVoiture bailVoiture = new BailVoiture();
		bailVoiture.setId(id);
		modelMap.addAttribute("bailVoiture", bailVoiture);
		return "ciblerBailVoiture";
	}

	@RequestMapping("reglerBailVoiture")
	public String reglerBailVoiture(@ModelAttribute("bailVoiture") BailVoiture bailVoiture, ModelMap modelMap) {
		service.updateBailVoiture(bailVoiture);
		List<BailVoiture> bailVoitures = service.getAllBailVoitures();
		modelMap.addAttribute("bailVoitures", bailVoitures);
		return "toutBailVoitures";
	}


}
