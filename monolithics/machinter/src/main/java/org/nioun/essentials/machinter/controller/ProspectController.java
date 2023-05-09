package org.nioun.essentials.machinter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.nioun.essentials.machinter.model.Prospect;
import org.nioun.essentials.machinter.model.ProspectExcell;
import org.nioun.essentials.machinter.repo.ProspectRepository;
import org.nioun.essentials.machinter.service.ProspectExcellService;

@Controller
public class ProspectController {
	@Autowired
	ProspectRepository prospectRepository ;
	
	@Autowired
	ProspectExcellService prospectXlsService;
	
	/*  Prospectmethods*/
	
	@RequestMapping("/creerProspect")
	private String creerProspect(){
		return "creerProspect" ;
		
	}
	@RequestMapping("/enregistrerProspect")
	private String enregistrerProspect(@ModelAttribute("prospect") Prospect prospect,ModelMap modelMap){
		Prospect  savedProspect= prospectRepository.save(prospect);
		String msg = ("Prospect Enregistré avec Id:"+savedProspect.getId());
		return "creerProspect" ;
	}
	@RequestMapping("/afficherAllProspects")
	private String afficherAllProspects(ModelMap modelMap){
		  List<Prospect> prospects = prospectRepository.findAll();
		  modelMap.addAttribute("prospects",prospects);
		return "afficherAllProspects" ;
	}
	@RequestMapping("/supprimerProspect")
	private String supprimerProspect(@RequestParam("id") Long id,ModelMap modelMap){
		Prospect prospect= new Prospect();
		prospect.setId(id);
		prospectRepository.delete(prospect);
		List<Prospect> prospects = prospectRepository.findAll();
		  modelMap.addAttribute("prospects", prospects);
		return "afficherAllProspects" ;
	}
	@RequestMapping("/ciblerProspect")
	private String ciblerProspect(@RequestParam("id") Long id,ModelMap modelMap){
		Prospect prospect= prospectRepository.getOne(id);
		modelMap.addAttribute("prospect", prospect);
		return "editerProspect" ;
	}
	
	@RequestMapping("/editerProspect")
	private String editerProspect(@ModelAttribute("prospect") Prospect prospect,ModelMap modelMap){
		prospectRepository.save(prospect);
		List<Prospect> prospects = prospectRepository.findAll();
		  modelMap.addAttribute("prospects",prospects);
		return "afficherAllProspects" ;
	}
	
	/* XLS Prospects
	 * 
	 * 
	 */
	@RequestMapping("/afficherAllXlsProspects")
	private String afficherAllXlsProspects(ModelMap modelMap){
		  List<ProspectExcell> prospectsExcells = prospectXlsService.getDatafromList();
		  modelMap.addAttribute("prospectsExcells",prospectsExcells);
		return "afficherAllXlsProspects" ;
	}

}
