package com.magma.quantum.corniche.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.magma.quantum.corniche.entities.Suite;
import com.magma.quantum.corniche.service.SuiteService;

@Controller
public class SuiteController {
	

	@Autowired 
	SuiteService suiteService;

	
/*  Suite methods*/
	
	@RequestMapping("/creerSuite")
	private String creerSuite(){
		return "creerSuite" ;
	}
	
	@RequestMapping("/enregistrerSuite")
	private String enregistrerSuite(@ModelAttribute("suite") Suite suite,ModelMap modelMap){
		Suite savedSuite = suiteService.saveSuite(suite);
		String msg = "Suite Enregistré avec Id:"+savedSuite.getId();
		return "creerSuite" ;
	}
	@RequestMapping("/afficherAllSuites")
	private String afficherAllSuites(ModelMap modelMap){
		  List<Suite> suites = suiteService.getAllSuites();
		  modelMap.addAttribute("suites", suites);
		return "afficherAllSuites" ;
	}
	@RequestMapping("/supprimerSuite")
	private String supprimerSuite(@RequestParam("id") Long id,ModelMap modelMap){
		Suite suite = new Suite();
		suite.setId(id);
		suiteService.deleteSuite(suite);
		List<Suite> suites = suiteService.getAllSuites();
		  modelMap.addAttribute("suites", suites);
		return "afficherAllSuites" ;
	}
	@RequestMapping("/ciblerSuite")
	private String ciblerSuite(@RequestParam("id") Long id,ModelMap modelMap){
		Suite updatedSuite = suiteService.getSuite(id);
		modelMap.addAttribute("suite", updatedSuite);
		return "editerSuite" ;
	}
	@RequestMapping("/editerSuite")
	private String editerSuite(@ModelAttribute("suite") Suite suite,ModelMap modelMap){
		suiteService.saveSuite(suite);
		List<Suite> suites = suiteService.getAllSuites();
		  modelMap.addAttribute("suites", suites);
		return "afficherAllSuites" ;
	}
}
