package org.nioun.essentials.naneurone.controller;

import org.nioun.essentials.naneurone.model.Naneurone;
import org.nioun.essentials.naneurone.repository.NaneuroneRepository;
import org.nioun.essentials.naneurone.service.NaneuroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NaneuroneController {

	@Autowired
	NaneuroneRepository repository;
	
	@Autowired
	Environment environment ;

	@Autowired
	NaneuroneService service; 
	
	

@GetMapping("/naneurone/valeur/{valeur}")
public Naneurone	recupererNaneuroneParValeur(@PathVariable ("valeur") String valeur){

	Naneurone naneurone=repository.findByValeur(valeur);
	
	if (naneurone==null) {
		throw new RuntimeException("Unable to find Naneurone with valeur"+valeur);
	}
	
	return naneurone;
}	


@GetMapping("/naneurone/naneuroneId/{naneuroneId}")
public Naneurone getNaneuroneById(@PathVariable Long naneuroneId) {
	
	Naneurone naneurone = service.getNaneurone(naneuroneId);
	if (naneurone==null) {
		throw new RuntimeException("Naneurone introuvable avec cet Id ");
	}
	return naneurone;
}

}
