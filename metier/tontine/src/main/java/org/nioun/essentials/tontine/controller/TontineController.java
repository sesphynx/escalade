package org.nioun.essentials.tontine.controller;

import java.math.BigDecimal;
import java.util.Date;

import org.nioun.essentials.tontine.model.Tontine;
import org.nioun.essentials.tontine.controller.TontineController;
import org.nioun.essentials.tontine.repository.TontineRepository;
import org.nioun.essentials.tontine.service.TontineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TontineController {


	Logger logger=LoggerFactory.getLogger(TontineController.class);
	
	@Autowired
	TontineRepository repository;
	
	@Autowired
	Environment environment ;

	@Autowired
	TontineService service; 
	
@GetMapping("/tontine/mise/{mise}/cagnotte/{cagnotte}")
 public Tontine	recupererPrestasante(@PathVariable ("mise") BigDecimal mise , @PathVariable ("cagnotte") BigDecimal cagnotte){
//	 Tontine tontine = new Tontine(1000L,mise,cagnotte,BigDecimal.valueOf(1000));
	Tontine tontine=repository.findByMiseAndCagnotte(mise, cagnotte);
	
	logger.info("recupererPrestasante avec les valeurs mise {} & cagnotte  {} ", mise , cagnotte );
	
	if (tontine==null) {
		throw new RuntimeException("Unable to find mise "+mise+"with cagnotte"+cagnotte);
	}
	
	return tontine;
 }	

@GetMapping("/tontine/mise/{mise}")
public Tontine	recupererPrestasanteParMise(@PathVariable ("mise") BigDecimal mise ){
//	 Tontine tontine = new Tontine(1000L,mise,cagnotte,BigDecimal.valueOf(1000));
	Tontine tontine=repository.findByMise(mise);
	
	logger.info("recupererPrestasante avec la valeur mise {}  ", mise );
	
	if (tontine==null) {
		throw new RuntimeException("Unable to find mise "+mise);
	}
	
	return tontine;
}	


@GetMapping("/tontine/cagnotte/{cagnotte}")
public Tontine	recupererPrestasanteParCagnotte( @PathVariable ("cagnotte") BigDecimal cagnotte){
//	 Tontine tontine = new Tontine(1000L,mise,cagnotte,BigDecimal.valueOf(1000));
	Tontine tontine=repository.findByCagnotte( cagnotte);
	
	logger.info("recupererPrestasante avec la valeur cagnotte  {} ", cagnotte );
	
	if (tontine==null) {
		throw new RuntimeException("Unable to find cagnotte"+cagnotte);
	}
	
	return tontine;
}



@GetMapping("/tontine/cycle/{cycle}")
public Tontine	recupererPrestasanteParCycle( @PathVariable ("cycle") String cycle){

	Tontine tontine=repository.findByCycle( cycle);
	
	logger.info("recupererPrestasante avec la valeur cycle  {} ", cycle );
	
	if (tontine==null) {
		throw new RuntimeException("Unable to find cycle"+cycle);
	}
	
	return tontine;
}


@GetMapping("/tontine/dateDebut/{dateDebut}")
public Tontine	recupererTontineParDateDebut( @PathVariable ("dateDebut") Date dateDebut){
//	 Tontine tontine = new Tontine(1000L,libelle,dateDebut,BigDecimal.valueOf(1000));
	Tontine tontine=repository.findByDateDebut( dateDebut);
	
	logger.info("recupererTontine avec la valeur dateDebut  {} ", dateDebut );
	
	if (tontine==null) {
		throw new RuntimeException("Unable to find dateDebut"+dateDebut);
	}
	
	return tontine;
}

@GetMapping("/tontine/dateFin/{dateFin}")
public Tontine	recupererTontineParDateFin( @PathVariable ("dateFin") Date dateFin){

	Tontine tontine=repository.findByDateFin( dateFin);
	
	logger.info("recupererTontine avec la valeur dateFin  {} ", dateFin );
	
	if (tontine==null) {
		throw new RuntimeException("Unable to find dateFin"+dateFin);
	}
	
	return tontine;
}



}
