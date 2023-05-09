package com.magma.quantum.politicone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.politicone.entities.Federation;
import com.magma.quantum.politicone.entities.Pays;
import com.magma.quantum.politicone.service.FederationService;
import com.magma.quantum.politicone.service.PaysService;

@Controller
public class PaysController {


	@Autowired
	PaysService service;
	
	@Autowired
	FederationService federationService;
	
			

	@RequestMapping("/showCreatePays")
	public String showCreatePays(ModelMap map) {
		Pays pays= new Pays();
		map.addAttribute(pays);
		List<Federation> federations = federationService.getAllFederations();
		map.addAttribute("federations",federations);
		return "createPays";
	}

	@RequestMapping("/savePays")
	public String savePays(@ModelAttribute("pays") Pays pays,@ModelAttribute("federation") Federation federation,
			ModelMap modelMap) {
		Pays paysSaved = service.savePays(pays);
		paysSaved.setFederation(federation);
		String msg = "Pays saved with id :" + paysSaved.getId()+" à la federation"+federation.getNom() ;
		modelMap.addAttribute("msg", msg);
		return "createPays";
	}

	@RequestMapping("/displayPayss")
	public String displayPayss(ModelMap modelMap) {

		List<Pays> payss = service.getAllPayss();
		modelMap.addAttribute("payss", payss);
		return "displayPayss";
	}

	@RequestMapping("deletePays")
	public String deletePays(@RequestParam("id") Long id, ModelMap modelMap) {
		Pays pays= new Pays();
		pays.setId(id);
		service.deletePays(pays);
		List<Pays> payss = service.getAllPayss();
		modelMap.addAttribute("payss", payss);
		return "displayPayss";
	}

	@RequestMapping("/showUpdatePays")
	public String showUpdatePays(@RequestParam("id") Long  id, ModelMap modelMap) {
		Pays pays= new Pays();
		pays.setId(id);
		modelMap.addAttribute("pays", pays);
		return "updatePays";
	}

	@RequestMapping("updatePays")
	public String updatePays(@ModelAttribute("pays") Pays pays, ModelMap modelMap) {
		service.updatePays(pays);
		List<Pays> payss = service.getAllPayss();
		modelMap.addAttribute("payss", payss);
		return "displayPayss";
	}

	


	
}
