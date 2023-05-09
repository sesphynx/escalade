package org.nioun.essentials.niounfull.controllerui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.nioun.essentials.niounfull.model.Pays;
import org.nioun.essentials.niounfull.model.Federation;
import org.nioun.essentials.niounfull.service.PaysService;
import org.nioun.essentials.niounfull.service.FederationService;

@Controller
public class FederationController {


	@Autowired
	FederationService service;
	
	@Autowired
	PaysService payssService;
	
			

	@RequestMapping("/showCreateFederation")
	public String showCreateFederation(ModelMap map) {
		Federation federation = new Federation();
		map.addAttribute(federation);
		List<Pays> allPays = payssService.getAllPayss();
		map.addAttribute("allPays",allPays);
		return "createFederation";
	}

	@RequestMapping("/saveFederation")
	public String saveFederation(@ModelAttribute("federation") Federation federation,@ModelAttribute("payss") List<Pays> payss,
			ModelMap modelMap) {
		Federation federationSaved = service.saveFederation(federation);
		federationSaved.setPayss(payss);
		String msg = "Federation saved with id :" + federationSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "createFederation";
	}

	@RequestMapping("/displayFederations")
	public String displayFederations(ModelMap modelMap) {

		List<Federation> federations = service.getAllFederations();
		modelMap.addAttribute("federations", federations);
		return "displayFederations";
	}

	@RequestMapping("deleteFederation")
	public String deleteFederation(@RequestParam("id") Long id, ModelMap modelMap) {
		Federation federation = new Federation();
		federation.setId(id);
		service.deleteFederation(federation);
		List<Federation> federations = service.getAllFederations();
		modelMap.addAttribute("federations", federations);
		return "displayFederations";
	}

	@RequestMapping("/showUpdateFederation")
	public String showUpdateFederation(@RequestParam("id") Long  id, ModelMap modelMap) {
		Federation federation = new Federation();
		federation.setId(id);
		modelMap.addAttribute("federation", federation);
		return "updateFederation";
	}

	@RequestMapping("updateFederation")
	public String updateFederation(@ModelAttribute("federation") Federation federation, ModelMap modelMap) {
		service.updateFederation(federation);
		List<Federation> federations = service.getAllFederations();
		modelMap.addAttribute("federations", federations);
		return "displayFederations";
	}

	


}
