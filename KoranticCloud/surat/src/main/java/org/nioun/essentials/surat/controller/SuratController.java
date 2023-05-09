package org.nioun.essentials.surat.controller;

import org.nioun.essentials.surat.model.Surat;
import org.nioun.essentials.surat.repository.SuratRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuratController {

	@Autowired
	SuratRepos repo ;
	
	@GetMapping("/surat/tour/{tour}")
	public Surat getSuratByTour(@PathVariable ("tour") String tour) {
		
		Surat surat = repo.findByTour(tour);
		
		
		return surat;
	}

	@GetMapping("/surat/ordre/{ordre}")
	public Surat getSuratByOrdre(@PathVariable ("ordre") int ordre ) {
		
		Surat surat = repo.findByOrdre(ordre);
		return surat;
	}
	
}
