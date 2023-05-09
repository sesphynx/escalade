package org.nioun.essentials.bien.controller;

import java.math.BigDecimal;
import java.util.List;

import org.nioun.essentials.bien.VO.FournisseurBienVO;
import org.nioun.essentials.bien.controller.BienController;
import org.nioun.essentials.bien.model.Bien;
import org.nioun.essentials.bien.repository.BienRepository;
import org.nioun.essentials.bien.service.BienService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/bien")
public class BienController {
	
Logger logger=LoggerFactory.getLogger(BienController.class);
	
	@Autowired
	BienRepository repository;
	

	@Autowired
	BienService service; 
	
@GetMapping("/bien/name/{name}/description/{description}")
 public Bien	recupererBien(@PathVariable ("name") String name , @PathVariable ("description") String description){
//	 Bien bien = new Bien(1000L,name,description,BigDecimal.valueOf(1000));
	Bien bien=repository.findByNameAndDescription(name, description);
	
	logger.info("recupererBien avec les valeurs name {} & description  {} ", name , description );
	
	if (bien==null) {
		throw new RuntimeException("Unable to find name "+name+"with description"+description);
	}
	
	
	return bien;
 }	
@GetMapping("/bienss")
public List<Bien> getAllBiens(){
	List<Bien> allBiens = service.getAllBiens();
	return allBiens;
	 
}

@PostMapping("/")
public Bien saveBien (@RequestBody Bien bien ) {

	logger.info("Saving goodies method ");
	return service.saveBien(bien);	
}

@PostMapping(path = "/creerBien")
public ResponseEntity<Bien> create(@RequestBody Bien newBien) {
Bien bien = service.saveBien(newBien);

if (bien==null) {
	throw new RuntimeException("Remplir la fiche Bien  ");
}
return new ResponseEntity<>(bien, HttpStatus.CREATED);

}

@PostMapping(path="/createBien",
		consumes = MediaType.APPLICATION_JSON_VALUE, 
		produces = MediaType.APPLICATION_JSON_VALUE)
public String saveBienToRestDB(@RequestParam("file") MultipartFile file ,@RequestParam("name") String name ,
		@RequestParam("description") String description ,@RequestParam("price") BigDecimal price,
		@RequestParam("env")  String env) {
            
    service.saveBienToDB(file, name, description, price, env);
    return "index";
}


@GetMapping("/{id}")
public Bien findBienById(Long bienId) {
	logger.info("within goodie localisation method for id  "+bienId);
	return service.getBien(bienId);
}


@GetMapping("/bien/bienId/{bienId}")
public FournisseurBienVO getBienWithFournisseurById(@PathVariable ("bienId") Long bienId) {
	
	return  service.getBienWithFournisseurById(bienId);
	
	
}

}
