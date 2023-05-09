package org.nioun.essentials.verset.controller;

import org.nioun.essentials.verset.model.Verset;
import org.nioun.essentials.verset.repository.VersetRepository;
import org.nioun.essentials.verset.service.VersetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersetController {

	@Autowired
	VersetRepository repository;
	
	@Autowired
	Environment environment ;

	@Autowired
	VersetService service; 
	
@GetMapping("/verset/libelle/{libelle}")
 public Verset	recupererVersetParLibelle(@PathVariable ("libelle") String libelle){
//	 Verset verset = new Verset(1000L,name,description,BigDecimal.valueOf(1000));
	Verset verset=repository.findByLibelle(libelle);
	
	if (verset==null) {
		throw new RuntimeException("Unable to find libelle "+libelle);
	}
	
	return verset;
 }	

@GetMapping("/verset/extraction/{extraction}")
public Verset	recupererVersetParExtraction(@PathVariable ("extraction") String extraction){

	Verset verset=repository.findByExtraction(extraction);
	
	if (verset==null) {
		throw new RuntimeException("Unable to find extraction "+extraction);
	}
	
	return verset;
}	


@GetMapping("/verset/versetId/{versetId}")
public Verset getVersetById(@PathVariable Long versetId) {
	
	Verset verset = service.getVerset(versetId);
	if (verset==null) {
		throw new RuntimeException("Verset introuvable avec cet Id ");
	}
	return verset;
}

}
