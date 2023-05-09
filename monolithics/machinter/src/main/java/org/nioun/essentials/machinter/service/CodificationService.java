package org.nioun.essentials.machinter.service;


import java.util.List;
import org.nioun.essentials.machinter.dto.CodificationRequest;
import org.nioun.essentials.machinter.model.Codification;



public interface CodificationService {
	

	Codification saveCodification(Codification Codification);

	Codification updateCodification(Codification Codification);

	void deleteCodification(Codification Codification);

	Codification getCodificationById(Long id);

	List<Codification> getAllCodifications();

	 Codification codifierProspect(CodificationRequest request);

	 Codification codifierProspectDirect(Long idConseiller, Long idProspect);
	
	

}
