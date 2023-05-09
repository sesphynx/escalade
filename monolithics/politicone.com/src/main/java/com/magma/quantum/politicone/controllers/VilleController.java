package com.magma.quantum.politicone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.politicone.entities.Region;
import com.magma.quantum.politicone.entities.Ville;
import com.magma.quantum.politicone.service.RegionService;
import com.magma.quantum.politicone.service.VilleService;

@Controller
public class VilleController {


	@Autowired
	VilleService service;
	
	@Autowired
	RegionService regionService;
	
			

	@RequestMapping("/showCreateVille")
	public String showCreateVille(ModelMap map) {
		Ville ville = new Ville();
		map.addAttribute(ville);
		List<Region> regions = regionService.getAllRegions();
		map.addAttribute("regions",regions);
		return "createVille";
	}

	@RequestMapping("/saveVille")
	public String saveVille(@ModelAttribute("ville") Ville ville,@ModelAttribute("region") Region region,
			ModelMap modelMap) {
		Ville villeSaved = service.saveVille(ville);
		villeSaved.setRegion(region);
		String msg = "Ville saved with id :" + villeSaved.getId()+"à la region"+region.getNom() ;
		modelMap.addAttribute("msg", msg);
		return "createVille";
	}

	@RequestMapping("/displayVilles")
	public String displayVilles(ModelMap modelMap) {

		List<Ville> villes = service.getAllVilles();
		modelMap.addAttribute("villes", villes);
		return "displayVilles";
	}

	@RequestMapping("deleteVille")
	public String deleteVille(@RequestParam("id") Long id, ModelMap modelMap) {
		Ville ville = new Ville();
		ville.setId(id);
		service.deleteVille(ville);
		List<Ville> villes = service.getAllVilles();
		modelMap.addAttribute("villes", villes);
		return "displayVilles";
	}

	@RequestMapping("/showUpdateVille")
	public String showUpdateVille(@RequestParam("id") Long  id, ModelMap modelMap) {
		Ville ville = new Ville();
		ville.setId(id);
		modelMap.addAttribute("ville", ville);
		return "updateVille";
	}

	@RequestMapping("updateVille")
	public String updateVille(@ModelAttribute("ville") Ville ville, ModelMap modelMap) {
		service.updateVille(ville);
		List<Ville> villes = service.getAllVilles();
		modelMap.addAttribute("villes", villes);
		return "displayVilles";
	}

	


	
}
