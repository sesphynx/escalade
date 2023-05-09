package org.nioun.essentials.niounfull.controllerui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.nioun.essentials.niounfull.model.Region;
import org.nioun.essentials.niounfull.model.Commission;
import org.nioun.essentials.niounfull.service.RegionService;
import org.nioun.essentials.niounfull.service.CommissionService;

@Controller
public class CommissionController {


	@Autowired
	CommissionService service;
	
	@Autowired
	RegionService regionService;
	
			

	@RequestMapping("/showCreateCommission")
	public String showCreateCommission(ModelMap map) {
		Commission commission = new Commission();
		map.addAttribute(commission);
		List<Region> regions = regionService.getAllRegions();
		map.addAttribute("regions",regions);
		return "createCommission";
	}

	@RequestMapping("/saveCommission")
	public String saveCommission(@ModelAttribute("commission") Commission commission,@ModelAttribute("region") Region region,
			ModelMap modelMap) {
		Commission commissionSaved = service.saveCommission(commission);
		commissionSaved.setRegion(region);
		String msg = "Commission saved with id :" + commissionSaved.getId()+"à la region"+region.getNom() ;
		modelMap.addAttribute("msg", msg);
		return "createCommission";
	}

	@RequestMapping("/displayCommissions")
	public String displayCommissions(ModelMap modelMap) {

		List<Commission> commissions = service.getAllCommissions();
		modelMap.addAttribute("commissions", commissions);
		return "displayCommissions";
	}

	@RequestMapping("deleteCommission")
	public String deleteCommission(@RequestParam("id") Long id, ModelMap modelMap) {
		Commission commission = new Commission();
		commission.setId(id);
		service.deleteCommission(commission);
		List<Commission> commissions = service.getAllCommissions();
		modelMap.addAttribute("commissions", commissions);
		return "displayCommissions";
	}

	@RequestMapping("/showUpdateCommission")
	public String showUpdateCommission(@RequestParam("id") Long  id, ModelMap modelMap) {
		Commission commission = new Commission();
		commission.setId(id);
		modelMap.addAttribute("commission", commission);
		return "updateCommission";
	}

	@RequestMapping("updateCommission")
	public String updateCommission(@ModelAttribute("commission") Commission commission, ModelMap modelMap) {
		service.updateCommission(commission);
		List<Commission> commissions = service.getAllCommissions();
		modelMap.addAttribute("commissions", commissions);
		return "displayCommissions";
	}

	

}
