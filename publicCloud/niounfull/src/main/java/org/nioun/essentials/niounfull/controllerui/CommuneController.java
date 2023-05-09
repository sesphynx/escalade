package org.nioun.essentials.niounfull.controllerui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.nioun.essentials.niounfull.model.Ville;
import org.nioun.essentials.niounfull.model.Commune;
import org.nioun.essentials.niounfull.service.VilleService;
import org.nioun.essentials.niounfull.service.CommuneService;

@Controller
public class CommuneController {
	

	@Autowired
	CommuneService service;
	
	@Autowired
	VilleService villeService;
	
			

	@RequestMapping("/showCreateCommune")
	public String showCreateCommune(ModelMap map) {
		Commune commune = new Commune();
		map.addAttribute(commune);
		List<Ville> villes = villeService.getAllVilles();
		map.addAttribute("villes",villes);
		return "createCommune";
	}

	@RequestMapping("/saveCommune")
	public String saveCommune(@ModelAttribute("commune") Commune commune,@ModelAttribute("ville") Ville ville,
			ModelMap modelMap) {
		Commune communeSaved = service.saveCommune(commune);
		communeSaved.setVille(ville);
		String msg = "Commune saved with id :" + communeSaved.getId()+"à la ville"+ville.getNom() ;
		modelMap.addAttribute("msg", msg);
		return "createCommune";
	}

	@RequestMapping("/displayCommunes")
	public String displayCommunes(ModelMap modelMap) {

		List<Commune> communes = service.getAllCommunes();
		modelMap.addAttribute("communes", communes);
		return "displayCommunes";
	}

	@RequestMapping("deleteCommune")
	public String deleteCommune(@RequestParam("id") Long id, ModelMap modelMap) {
		Commune commune = new Commune();
		commune.setId(id);
		service.deleteCommune(commune);
		List<Commune> communes = service.getAllCommunes();
		modelMap.addAttribute("communes", communes);
		return "displayCommunes";
	}

	@RequestMapping("/showUpdateCommune")
	public String showUpdateCommune(@RequestParam("id") Long  id, ModelMap modelMap) {
		Commune commune = new Commune();
		commune.setId(id);
		modelMap.addAttribute("commune", commune);
		return "updateCommune";
	}

	@RequestMapping("updateCommune")
	public String updateCommune(@ModelAttribute("commune") Commune commune, ModelMap modelMap) {
		service.updateCommune(commune);
		List<Commune> communes = service.getAllCommunes();
		modelMap.addAttribute("communes", communes);
		return "displayCommunes";
	}

	


}
