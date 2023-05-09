package com.magma.quantum.machintech.service;


import java.util.List;

import com.magma.quantum.machintech.dto.CodificationRequest;
import com.magma.quantum.machintech.entities.Codification;



public interface CodificationService {
	

	Codification saveCodification(Codification Codification);

	Codification updateCodification(Codification Codification);

	void deleteCodification(Codification Codification);

	Codification getCodificationById(Long id);

	List<Codification> getAllCodifications();

	 Codification codifierProspect(CodificationRequest request);

	 Codification codifierProspectDirect(Long idConseiller, Long idProspect);
	
	

}
