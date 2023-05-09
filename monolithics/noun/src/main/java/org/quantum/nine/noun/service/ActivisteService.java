package org.quantum.nine.noun.service;

import java.util.List;

import org.quantum.nine.noun.entities.Activiste;
import org.springframework.stereotype.Service;

@Service
public interface ActivisteService {

	Activiste saveActiviste(Activiste activiste);

	Activiste updateActiviste(Activiste activiste);

	void deleteActiviste(Activiste activiste);

	Activiste getActivisteById(Long id);

	List<Activiste> getAllActivistes();

}
