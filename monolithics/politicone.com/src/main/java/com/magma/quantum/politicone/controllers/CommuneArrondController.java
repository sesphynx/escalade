package com.magma.quantum.politicone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.politicone.entities.Departement;
import com.magma.quantum.politicone.entities.CommuneArrond;
import com.magma.quantum.politicone.service.DepartementService;
import com.magma.quantum.politicone.service.CommuneArrondService;

@Controller
public class CommuneArrondController {
	

	@Autowired
	CommuneArrondService service;
	
	@Autowired
	DepartementService departementService;
	
			

	@RequestMapping("/showCreateCommuneArrond")
	public String showCreateCommuneArrond(ModelMap map) {
		CommuneArrond communeArrond = new CommuneArrond();
		map.addAttribute(communeArrond);
		List<Departement> departements = departementService.getAllDepartements();
		map.addAttribute("departements",departements);
		return "createCommuneArrond";
	}

	@RequestMapping("/saveCommuneArrond")
	public String saveCommuneArrond(@ModelAttribute("communeArrond") CommuneArrond communeArrond,@ModelAttribute("departement") Departement departement,
			ModelMap modelMap) {
		CommuneArrond communeArrondSaved = service.saveCommuneArrond(communeArrond);
		communeArrondSaved.setDepartement(departement);
		String msg = "CommuneArrond saved with id :" + communeArrondSaved.getId()+"à la departement"+departement.getNom() ;
		modelMap.addAttribute("msg", msg);
		return "createCommuneArrond";
	}

	@RequestMapping("/displayCommuneArronds")
	public String displayCommuneArronds(ModelMap modelMap) {

		List<CommuneArrond> communeArronds = service.getAllCommuneArronds();
		modelMap.addAttribute("communeArronds", communeArronds);
		return "displayCommuneArronds";
	}

	@RequestMapping("deleteCommuneArrond")
	public String deleteCommuneArrond(@RequestParam("id") Long id, ModelMap modelMap) {
		CommuneArrond communeArrond = new CommuneArrond();
		communeArrond.setId(id);
		service.deleteCommuneArrond(communeArrond);
		List<CommuneArrond> communeArronds = service.getAllCommuneArronds();
		modelMap.addAttribute("communeArronds", communeArronds);
		return "displayCommuneArronds";
	}

	@RequestMapping("/showUpdateCommuneArrond")
	public String showUpdateCommuneArrond(@RequestParam("id") Long  id, ModelMap modelMap) {
		CommuneArrond communeArrond = new CommuneArrond();
		communeArrond.setId(id);
		modelMap.addAttribute("communeArrond", communeArrond);
		return "updateCommuneArrond";
	}

	@RequestMapping("updateCommuneArrond")
	public String updateCommuneArrond(@ModelAttribute("communeArrond") CommuneArrond communeArrond, ModelMap modelMap) {
		service.updateCommuneArrond(communeArrond);
		List<CommuneArrond> communeArronds = service.getAllCommuneArronds();
		modelMap.addAttribute("communeArronds", communeArronds);
		return "displayCommuneArronds";
	}

	

	
}
