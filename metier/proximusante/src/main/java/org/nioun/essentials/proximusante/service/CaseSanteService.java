package org.nioun.essentials.proximusante.service;

import java.util.List;

import org.nioun.essentials.proximusante.model.CaseSante;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

public interface CaseSanteService {

List<CaseSante>	findAll();

CaseSante findById(int id) throws NotFoundException;

List<CaseSante> findCaseSantesWithinSubCounty(int subcountyId); 

List<CaseSante> findCaseSantesByDistanceFromUser(Double userLongitude , Double userLatitude);

void deleteById(int id);	
}
