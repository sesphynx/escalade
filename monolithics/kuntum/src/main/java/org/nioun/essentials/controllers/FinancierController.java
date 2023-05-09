package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Financier;
import org.nioun.essentials.service.FinancierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


	@Controller
	@RequestMapping("/financier")
	public class FinancierController {


		@Autowired
		FinancierService service;
		

		@RequestMapping("/ajouterFinancier")
		public String ajouterFinancier(ModelMap map) {
			Financier financier = new Financier();
			map.addAttribute(financier);
			return "creerFinancier";
		}

		@RequestMapping("/sauvegarderFinancier")
		public String saveFinancier(@ModelAttribute("financier") Financier financier,
				ModelMap modelMap) {
			Financier financierSaved = service.saveFinancier(financier);
			String msg = "Financier sauvegarder avec l' id :" + financierSaved.getId() ;
			modelMap.addAttribute("msg", msg);
			return "creerFinancier";
		}

		@RequestMapping("/toutFinanciers")
		public String toutFinanciers(ModelMap modelMap) {

			List<Financier> financiers = service.getAllFinanciers();
			modelMap.addAttribute("financiers", financiers);
			return "toutFinanciers";
		}

		@RequestMapping("supprimerFinancier")
		public String supprimerFinancier(@RequestParam("id") Long id, ModelMap modelMap) {
			Financier financier = new Financier();
			financier.setId(id);
			service.deleteFinancier(financier);
			List<Financier> financiers = service.getAllFinanciers();
			modelMap.addAttribute("financiers", financiers);
			return "toutFinanciers";
		}

		@RequestMapping("/ciblerFinancier")
		public String ciblerFinancier(@RequestParam("id") Long  id, ModelMap modelMap) {
			Financier financier = new Financier();
			financier.setId(id);
			modelMap.addAttribute("financier", financier);
			return "ciblerFinancier";
		}

		@RequestMapping("reglerFinancier")
		public String reglerFinancier(@ModelAttribute("financier") Financier financier, ModelMap modelMap) {
			service.updateFinancier(financier);
			List<Financier> financiers = service.getAllFinanciers();
			modelMap.addAttribute("financiers", financiers);
			return "toutFinanciers";
		}


}
