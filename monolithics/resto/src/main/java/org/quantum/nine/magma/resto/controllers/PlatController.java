package org.quantum.nine.magma.resto.controllers;

import java.util.List;

import org.quantum.nine.magma.resto.entities.Plat;
import org.quantum.nine.magma.resto.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class PlatController {
	
	@Autowired
	CatalogueService service ;
	
	@RequestMapping("/ajouterPlat")
	public String ajouterPlat(ModelMap map) {
		Plat plat = new Plat();
		map.addAttribute(plat);
		return "creerPlat";
	}

	@RequestMapping("/sauvegarderPlat")
	public String sauvegarderPlat(@ModelAttribute("plat") Plat plat,
							ModelMap modelMap) {
		Plat platSaved = service.savePlat(plat);
		String msg = "Plat saved with id :" + platSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerPlat";
	}

	@RequestMapping("/toutPlats")
	public String toutPlats(ModelMap modelMap) {

		List<Plat> plats = service.getAllPlats();
		modelMap.addAttribute("plats", plats);
		return "toutPlats";
	}

	@RequestMapping("supprimerPlat")
	public String supprimerPlat(@RequestParam("id") Long id, ModelMap modelMap) {
		Plat plat = new Plat();
		plat.setId(id);
		service.deletePlat(plat);
		List<Plat> plats = service.getAllPlats();
		modelMap.addAttribute("plats", plats);
		return "toutPlats";
	}

	@RequestMapping("/ciblerPlat")
	public String ciblerPlat(@RequestParam("id") Long  id, ModelMap modelMap) {
		Plat plat = new Plat();
		plat.setId(id);
		modelMap.addAttribute("plat", plat);
		return "ciblerProduit";
	}

	@RequestMapping("reglerPlat")
	public String reglerPlat(@ModelAttribute("plat") Plat plat, ModelMap modelMap) {
		service.updatePlat(plat);
		List<Plat> plats = service.getAllPlats();
		modelMap.addAttribute("plats", plats);
		return "toutPlats";
	}

	
	
}
