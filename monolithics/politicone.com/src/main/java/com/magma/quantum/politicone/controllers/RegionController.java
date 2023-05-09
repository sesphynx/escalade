package com.magma.quantum.politicone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magma.quantum.politicone.entities.Pays;
import com.magma.quantum.politicone.entities.Region;
import com.magma.quantum.politicone.service.PaysService;
import com.magma.quantum.politicone.service.RegionService;

@Controller
public class RegionController {


	@Autowired
	RegionService service;
	
	@Autowired
	PaysService paysService;
	
			

	@RequestMapping("/showCreateRegion")
	public String showCreateRegion(ModelMap map) {
		Region region = new Region();
		map.addAttribute(region);
		List<Pays> payss = paysService.getAllPayss();
		map.addAttribute("payss",payss);
		return "createRegion";
	}

	@RequestMapping("/saveRegion")
	public String saveRegion(@ModelAttribute("region") Region region,
			@RequestParam("id") Long id,
			ModelMap modelMap) {
		Pays savedPays=paysService.getPaysById(id);
		Region regionSaved = service.saveRegion(region);
		regionSaved.setPays(savedPays);
		String msg = "Region saved with id :" + regionSaved.getId()+ "au pays"+savedPays.getNom() ;
		modelMap.addAttribute("msg", msg);
		return "createRegion";
	}

	@RequestMapping("/displayRegions")
	public String displayRegions(ModelMap modelMap) {

		List<Region> regions = service.getAllRegions();
		modelMap.addAttribute("regions", regions);
		return "displayRegions";
	}

	@RequestMapping("deleteRegion")
	public String deleteRegion(@RequestParam("id") Long id, ModelMap modelMap) {
		Region region = new Region();
		region.setId(id);
		service.deleteRegion(region);
		List<Region> regions = service.getAllRegions();
		modelMap.addAttribute("regions", regions);
		return "displayRegions";
	}

	@RequestMapping("/showUpdateRegion")
	public String showUpdateRegion(@RequestParam("id") Long  id, ModelMap modelMap) {
		Region region = new Region();
		region.setId(id);
		modelMap.addAttribute("region", region);
		return "updateRegion";
	}

	@RequestMapping("updateRegion")
	public String updateRegion(@ModelAttribute("region") Region region, ModelMap modelMap) {
		service.updateRegion(region);
		List<Region> regions = service.getAllRegions();
		modelMap.addAttribute("regions", regions);
		return "displayRegions";
	}

	

	
}
