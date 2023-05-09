package org.nioun.essentials.assurance.controller;

import java.util.Date;

import org.nioun.essentials.assurance.controller.AssuranceController;
import org.nioun.essentials.assurance.model.Assurance;
import org.nioun.essentials.assurance.repository.AssuranceRepository;
import org.nioun.essentials.assurance.service.AssuranceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssuranceController {


	Logger logger=LoggerFactory.getLogger(AssuranceController.class);
	
	@Autowired
	AssuranceRepository repository;
	

	@Autowired
	AssuranceService service; 

	
	
@GetMapping("/assurance/libelle/{libelle}")
public Assurance	recupererAssuranceParLibelle(@PathVariable ("libelle") String libelle ){
//	 Assurance assurance = new Assurance(1000L,libelle,dateDebut,BigDecimal.valueOf(1000));
	Assurance assurance=repository.findByLibelle(libelle);
	
	logger.info("recupererAssurance avec la valeur libelle {}  ", libelle );
	
	if (assurance==null) {
		throw new RuntimeException("Unable to find libelle "+libelle);
	}
	
	return assurance;
}	


@GetMapping("/assurance/dateDebut/{dateDebut}")
public Assurance	recupererAssuranceParDateDebut( @PathVariable ("dateDebut") Date dateDebut){
//	 Assurance assurance = new Assurance(1000L,libelle,dateDebut,BigDecimal.valueOf(1000));
	Assurance assurance=repository.findByDateDebut( dateDebut);
	
	logger.info("recupererAssurance avec la valeur dateDebut  {} ", dateDebut );
	
	if (assurance==null) {
		throw new RuntimeException("Unable to find dateDebut"+dateDebut);
	}
	
	return assurance;
}

@GetMapping("/assurance/dateFin/{dateFin}")
public Assurance	recupererAssuranceParDateFin( @PathVariable ("dateFin") Date dateFin){

	Assurance assurance=repository.findByDateFin( dateFin);
	
	logger.info("recupererAssurance avec la valeur dateDebut  {} ", dateFin );
	
	if (assurance==null) {
		throw new RuntimeException("Unable to find dateFin"+dateFin);
	}
	
	return assurance;
}


@GetMapping("/assurance/description/{description}")
public Assurance	recupererAssuranceParDescription( @PathVariable ("description") String description){

	Assurance assurance=repository.findByDescription( description);
	
	logger.info("recupererAssurance avec la valeur description  {} ", description );
	
	if (assurance==null) {
		throw new RuntimeException("Unable to find description"+description);
	}
	
	return assurance;
}


}
