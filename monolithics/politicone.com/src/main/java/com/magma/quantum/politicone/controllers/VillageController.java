package com.magma.quantum.politicone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.politicone.entities.CommuneArrond;
import com.magma.quantum.politicone.entities.Village;
import com.magma.quantum.politicone.service.CommuneArrondService;
import com.magma.quantum.politicone.service.VillageService;

@Controller
public class VillageController {


	@Autowired
	VillageService service;
	
	@Autowired
	CommuneArrondService communeArrondService;
	
			

	@RequestMapping("/showCreateVillage")
	public String showCreateVillage(ModelMap map) {
		Village village = new Village();
		map.addAttribute(village);
		List<CommuneArrond> communeArronds = communeArrondService.getAllCommuneArronds();
		map.addAttribute("communeArronds",communeArronds);
		return "createVillage";
	}

	@RequestMapping("/saveVillage")
	public String saveVillage(@ModelAttribute("village") Village village,@ModelAttribute("communeArrond") CommuneArrond communeArrond,
			ModelMap modelMap) {
		Village villageSaved = service.saveVillage(village);
		villageSaved.setCommuneArrond(communeArrond);
		String msg = "Village saved with id :" + villageSaved.getId()+"à la communeArrond"+communeArrond.getNom() ;
		modelMap.addAttribute("msg", msg);
		return "createVillage";
	}

	@RequestMapping("/displayVillages")
	public String displayVillages(ModelMap modelMap) {

		List<Village> villages = service.getAllVillages();
		modelMap.addAttribute("villages", villages);
		return "displayVillages";
	}

	@RequestMapping("deleteVillage")
	public String deleteVillage(@RequestParam("id") Long id, ModelMap modelMap) {
		Village village = new Village();
		village.setId(id);
		service.deleteVillage(village);
		List<Village> villages = service.getAllVillages();
		modelMap.addAttribute("villages", villages);
		return "displayVillages";
	}

	@RequestMapping("/showUpdateVillage")
	public String showUpdateVillage(@RequestParam("id") Long  id, ModelMap modelMap) {
		Village village = new Village();
		village.setId(id);
		modelMap.addAttribute("village", village);
		return "updateVillage";
	}

	@RequestMapping("updateVillage")
	public String updateVillage(@ModelAttribute("village") Village village, ModelMap modelMap) {
		service.updateVillage(village);
		List<Village> villages = service.getAllVillages();
		modelMap.addAttribute("villages", villages);
		return "displayVillages";
	}

	


	
}
