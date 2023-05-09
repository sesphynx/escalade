package org.quantum.nine.magma.resto.controllers;

import java.util.List;

import org.quantum.nine.magma.resto.entities.Addresse;
import org.quantum.nine.magma.resto.service.AddresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddresseController {


	@Autowired
	AddresseService service;
	

	@RequestMapping("/ajouterAddresse")
	public String ajouterAddresse(ModelMap map) {
		Addresse addresse = new Addresse();
		map.addAttribute(addresse);
		return "creerAddresse";
	}

	@RequestMapping("/sauvegarderAddresse")
	public String saveAddresse(@ModelAttribute("addresse") Addresse addresse,
			ModelMap modelMap) {
		Addresse addresseSaved = service.saveAddresse(addresse);
		String msg = "Addresse sauvegarder avec l' id :" + addresseSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerAddresse";
	}

	@RequestMapping("/toutAddresses")
	public String toutAddresses(ModelMap modelMap) {

		List<Addresse> addresses = service.getAllAddresses();
		modelMap.addAttribute("addresses", addresses);
		return "addresses";
	}

	@RequestMapping("supprimerAddresse")
	public String supprimerAddresse(@RequestParam("id") Long id, ModelMap modelMap) {
		Addresse addresse = new Addresse();
		addresse.setId(id);
		service.deleteAddresse(addresse);
		List<Addresse> addresses = service.getAllAddresses();
		modelMap.addAttribute("addresses", addresses);
		return "addresses";
	}

	@RequestMapping("/ciblerAddresse")
	public String ciblerAddresse(@RequestParam("id") Long  id, ModelMap modelMap) {
		Addresse addresse = new Addresse();
		addresse.setId(id);
		modelMap.addAttribute("addresse", addresse);
		return "ciblerAddresse";
	}

	@RequestMapping("reglerAddresse")
	public String reglerAddresse(@ModelAttribute("addresse") Addresse addresse, ModelMap modelMap) {
		service.updateAddresse(addresse);
		List<Addresse> addresses = service.getAllAddresses();
		modelMap.addAttribute("addresses", addresses);
		return "addresses";
	}

	


	
}
