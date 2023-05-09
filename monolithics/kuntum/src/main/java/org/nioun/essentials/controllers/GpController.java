package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Gp;
import org.nioun.essentials.service.GpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/gp")
public class GpController {


	@Autowired
	GpService service;
	

	@RequestMapping("/ajouterGp")
	public String ajouterGp(ModelMap map) {
		Gp gp = new Gp();
		map.addAttribute(gp);
		return "creerGp";
	}

	@RequestMapping("/sauvegarderGp")
	public String saveGp(@ModelAttribute("gp") Gp gp,
			ModelMap modelMap) {
		Gp gpSaved = service.saveGp(gp);
		String msg = "Gp sauvegarder avec l' id :" + gpSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerGp";
	}

	@RequestMapping("/toutGps")
	public String toutGps(ModelMap modelMap) {

		List<Gp> gps = service.getAllGps();
		modelMap.addAttribute("gps", gps);
		return "toutGps";
	}

	@RequestMapping("supprimerGp")
	public String supprimerGp(@RequestParam("id") Long id, ModelMap modelMap) {
		Gp gp = new Gp();
		gp.setId(id);
		service.deleteGp(gp);
		List<Gp> gps = service.getAllGps();
		modelMap.addAttribute("gps", gps);
		return "toutGps";
	}

	@RequestMapping("/ciblerGp")
	public String ciblerGp(@RequestParam("id") Long  id, ModelMap modelMap) {
		Gp gp = new Gp();
		gp.setId(id);
		modelMap.addAttribute("gp", gp);
		return "ciblerGp";
	}

	@RequestMapping("reglerGp")
	public String reglerGp(@ModelAttribute("gp") Gp gp, ModelMap modelMap) {
		service.updateGp(gp);
		List<Gp> gps = service.getAllGps();
		modelMap.addAttribute("gps", gps);
		return "toutGps";
	}


}
