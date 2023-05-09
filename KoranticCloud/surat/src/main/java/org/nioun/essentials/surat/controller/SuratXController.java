package org.nioun.essentials.surat.controller;

import java.util.List;

import org.nioun.essentials.surat.model.Surat;
import org.nioun.essentials.surat.repository.SuratRepos;
import org.nioun.essentials.surat.service.SuratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SuratXController {
	@Autowired
	SuratService service;

	@Autowired
	SuratRepos repository;


	@RequestMapping("/creerSurat")
	public String creerSurat(ModelMap map) {
		Surat surat= new Surat();
		map.addAttribute(surat);
		return "ajouterSurat";
	}

	@RequestMapping("/saveSurat")
	public String saveSurat(@ModelAttribute("surat") Surat surat, ModelMap modelMap) {
		Surat suratSaved = service.saveSurat(surat);
		String msg = "Surat saved with id: " + suratSaved.getSuratId();
		modelMap.addAttribute("msg", msg);
/*		 emailUtil.sendEmail("mmdukb@hotmail.com", "Surat Saved",
				"Surat Saved Successfully and about to return a response");
*/
		return "ajouterSurat";
	}

	@RequestMapping("/displaySurats")
	public String displaySurats(ModelMap modelMap) {
		List<Surat> surats = service.getAllSurats();
		modelMap.addAttribute("surats", surats);
		return "displaySurats";
	}

	@RequestMapping("deleteSurat")
	public String deleteSurat(@RequestParam("suratId") Long suratId, ModelMap modelMap) {
		 // Surat Surat = service.getSurat(SuratId);
		Surat surat = new Surat();
		surat.setSuratId(suratId);
		service.deleteSurat(surat);
		List<Surat> surats = service.getAllSurats();
		modelMap.addAttribute("surats", surats);
		return "displaySurats";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("suratId") Long suratId, ModelMap modelMap) {
		Surat surat = service.getSurat(suratId);
		modelMap.addAttribute("surat", surat);
		return "updateSurat";
	}

	@RequestMapping("/updateSurat")
	public String updateSurat(@ModelAttribute("surat") Surat surat, ModelMap modelMap) {
		service.updateSurat(surat);
		List<Surat> surats = service.getAllSurats();
		modelMap.addAttribute("surats", surats);
		return "afficherSurats";
	}

}
