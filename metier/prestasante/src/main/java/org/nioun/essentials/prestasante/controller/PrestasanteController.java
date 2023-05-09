package org.nioun.essentials.prestasante.controller;

import org.nioun.essentials.prestasante.controller.PrestasanteController;
import org.nioun.essentials.prestasante.model.Prestasante;
import org.nioun.essentials.prestasante.repository.PrestasanteRepository;
import org.nioun.essentials.prestasante.service.PrestasanteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrestasanteController {


	Logger logger=LoggerFactory.getLogger(PrestasanteController.class);
	
	@Autowired
	PrestasanteRepository repository;
	
	@Autowired
	Environment environment ;

	@Autowired
	PrestasanteService service; 
	
@GetMapping("/prestasante/domaine/{domaine}/consultation/{consultation}")
 public Prestasante	recupererPrestasante(@PathVariable ("domaine") String domaine , @PathVariable ("consultation") String consultation){
//	 Prestasante prestasante = new Prestasante(1000L,domaine,consultation,BigDecimal.valueOf(1000));
	Prestasante prestasante=repository.findByDomaineAndConsultation(domaine, consultation);
	
	logger.info("recupererPrestasante avec les valeurs domaine {} & consultation  {} ", domaine , consultation );
	
	if (prestasante==null) {
		throw new RuntimeException("Unable to find domaine "+domaine+"with consultation"+consultation);
	}
	
	return prestasante;
 }	

@GetMapping("/prestasante/domaine/{domaine}")
public Prestasante	recupererPrestasanteParDomaine(@PathVariable ("domaine") String domaine ){
//	 Prestasante prestasante = new Prestasante(1000L,domaine,consultation,BigDecimal.valueOf(1000));
	Prestasante prestasante=repository.findByDomaine(domaine);
	
	logger.info("recupererPrestasante avec la valeur domaine {}  ", domaine );
	
	if (prestasante==null) {
		throw new RuntimeException("Unable to find domaine "+domaine);
	}
	
	return prestasante;
}	


@GetMapping("/prestasante/consultation/{consultation}")
public Prestasante	recupererPrestasanteParConsultation( @PathVariable ("consultation") String consultation){

	//	 Prestasante prestasante = new Prestasante(1000L,domaine,consultation,BigDecimal.valueOf(1000));
	
	Prestasante prestasante=repository.findByConsultation( consultation);
	
	logger.info("recupererPrestasante avec la valeur consultation  {} ", consultation );
	
	if (prestasante==null) {
		throw new RuntimeException("Unable to find consultation"+consultation);
	}
	
	return prestasante;
}



@GetMapping("/prestasante/description/{description}")
public Prestasante	recupererPrestasanteParDescription( @PathVariable ("description") String description){
//	 Prestasante prestasante = new Prestasante(1000L,domaine,consultation,BigDecimal.valueOf(1000));
	Prestasante prestasante=repository.findByDescription( description);
	
	logger.info("recupererPrestasante avec la valeur description  {} ", description );
	
	if (prestasante==null) {
		throw new RuntimeException("Unable to find description"+description);
	}
	
	return prestasante;
}


}
