package com.magma.quantum.politicone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.politicone.entities.Region;
import com.magma.quantum.politicone.entities.Departement;
import com.magma.quantum.politicone.service.RegionService;
import com.magma.quantum.politicone.service.DepartementService;

@Controller
@RequestMapping("/departement")
public class DepartementController {


	@Autowired
	DepartementService service;
	
	@Autowired
	RegionService regionService;
	
			

	@RequestMapping("/showCreateDepartement")
	public String showCreateDepartement(ModelMap map) {
		Departement departement = new Departement();
		map.addAttribute(departement);
		List<Region> regions = regionService.getAllRegions();
		map.addAttribute("regions",regions);
		return "createDepartement";
	}

	@RequestMapping("/saveDepartement")
	public String saveDepartement(@ModelAttribute("departement") Departement departement,@ModelAttribute("region") Region region,
			ModelMap modelMap) {
		Departement departementSaved = service.saveDepartement(departement);
		departementSaved.setRegion(region);
		String msg = "Departement saved with id :" + departementSaved.getId()+"à la region"+region.getNom() ;
		modelMap.addAttribute("msg", msg);
		return "createDepartement";
	}

	@RequestMapping("/displayDepartements")
	public String displayDepartements(ModelMap modelMap) {

		List<Departement> departements = service.getAllDepartements();
		modelMap.addAttribute("departements", departements);
		return "displayDepartements";
	}

	@RequestMapping("deleteDepartement")
	public String deleteDepartement(@RequestParam("id") Long id, ModelMap modelMap) {
		Departement departement = new Departement();
		departement.setId(id);
		service.deleteDepartement(departement);
		List<Departement> departements = service.getAllDepartements();
		modelMap.addAttribute("departements", departements);
		return "displayDepartements";
	}

	@RequestMapping("/showUpdateDepartement")
	public String showUpdateDepartement(@RequestParam("id") Long  id, ModelMap modelMap) {
		Departement departement = new Departement();
		departement.setId(id);
		modelMap.addAttribute("departement", departement);
		return "updateDepartement";
	}

	@RequestMapping("updateDepartement")
	public String updateDepartement(@ModelAttribute("departement") Departement departement, ModelMap modelMap) {
		service.updateDepartement(departement);
		List<Departement> departements = service.getAllDepartements();
		modelMap.addAttribute("departements", departements);
		return "displayDepartements";
	}

	

	
}
