package org.nioun.essentials.paiement.controller;

import java.util.List;
import org.nioun.essentials.paiement.model.Paiement;
import org.nioun.essentials.paiement.repository.PaiementRepository;
import org.nioun.essentials.paiement.service.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaiementXController {
	
	
	
		@Autowired
		PaiementService service;

		@Autowired
		PaiementRepository repository;

		
		@RequestMapping("/creerPaiement")
		public String creerPaiement(ModelMap map) {
			Paiement paiement= new Paiement();
			service.savePaiement(paiement);
			map.addAttribute(paiement);
			return "ajouterPaiement";
		}

		@RequestMapping("/savePaiement")
		public String savePaiement(@ModelAttribute("paiement") Paiement paiement, ModelMap modelMap) {
			Paiement paiementSaved = service.savePaiement(paiement);
			String msg = "Paiement saved with id: " + paiementSaved.getPaiementId();
			modelMap.addAttribute("msg", msg);
		/*	 emailUtil.sendEmail("mmdukb@hotmail.com", "Paiement Saved",
					"Paiement Saved Successfully and about to return a response");
		*/
			return "ajouterPaiement";
		}

		@RequestMapping("/displayPaiements")
		public String displayPaiements(ModelMap modelMap) {
			List<Paiement> paiements = service.getAllPaiements();
			modelMap.addAttribute("paiements", paiements);
			return "displayPaiements";
		}

		@RequestMapping("deletePaiement")
		public String deletePaiement(@RequestParam("paiementId") Long paiementId, ModelMap modelMap) {
			 // Paiement paiement = service.getPaiement(paiementId);
			Paiement paiement = new Paiement();
			paiement.setPaiementId(paiementId);
			service.deletePaiement(paiement);
			List<Paiement> paiements = service.getAllPaiements();
			modelMap.addAttribute("paiements", paiements);
			return "displayPaiements";
		}

		@RequestMapping("/showUpdate")
		public String showUpdate(@RequestParam("paiementId") Long paiementId, ModelMap modelMap) {
			Paiement paiement = service.getPaiement(paiementId);
			modelMap.addAttribute("paiement", paiement);
			return "updatePaiement";
		}

		@RequestMapping("/updatePaiement")
		public String updatePaiement(@ModelAttribute("paiement") Paiement paiement, ModelMap modelMap) {
			service.updatePaiement(paiement);
			List<Paiement> paiements = service.getAllPaiements();
			modelMap.addAttribute("paiements", paiements);
			return "afficherPaiements";
		}


	}