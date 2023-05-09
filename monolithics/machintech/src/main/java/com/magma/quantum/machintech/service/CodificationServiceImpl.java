package com.magma.quantum.machintech.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.machintech.dto.CodificationRequest;
import com.magma.quantum.machintech.entities.Codification;
import com.magma.quantum.machintech.entities.Prospect;
import com.magma.quantum.machintech.entities.User;
import com.magma.quantum.machintech.repos.CodificationRepository;
import com.magma.quantum.machintech.repos.ProspectRepository;
import com.magma.quantum.machintech.repos.UserRepository;

@Service
public class CodificationServiceImpl implements CodificationService {


	@Autowired
	CodificationRepository codificationRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ProspectRepository prospectRepository;
	
	
	
	/**
	 * @return the codificationRepository
	 */
	public CodificationRepository getCodificationRepository() {
		return codificationRepository;
	}

	/**
	 * @param codificationRepository the codificationRepository to set
	 */
	public void setCodificationRepository(CodificationRepository codificationRepository) {
		this.codificationRepository = codificationRepository;
	}

	/**
	 * @return the userRepository
	 */
	public UserRepository getUserRepository() {
		return userRepository;
	}

	/**
	 * @param userRepository the userRepository to set
	 */
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	/**
	 * @return the prospectRepository
	 */
	public ProspectRepository getProspectRepository() {
		return prospectRepository;
	}

	/**
	 * @param prospectRepository the prospectRepository to set
	 */
	public void setProspectRepository(ProspectRepository prospectRepository) {
		this.prospectRepository = prospectRepository;
	}

	public Codification saveCodification(Codification Codification) {
		
		return codificationRepository.save(Codification);
	}

	public Codification updateCodification(Codification Codification) {
		// TODO Auto-generated method stub
		return codificationRepository.save(Codification);
	}

	public void deleteCodification(Codification Codification) {
		codificationRepository.delete(Codification);

	}

	public List<Codification> getAllCodifications() {
		// TODO Auto-generated method stub
		return codificationRepository.findAll();
	}

	public CodificationRepository getRepository() {
		return codificationRepository;
	}

	public void setRepository(CodificationRepository codificationRepository) {
		this.codificationRepository = codificationRepository;
	}

	public Codification getCodificationById(Long id) {
		// TODO Auto-generated method stub
		return  codificationRepository.getOne(id);
	}


	public Codification codifierProspectDirect(Long idUser ,Long idProspect) {
		

		Prospect prospect  = prospectRepository.getOne(idProspect);
		User user = userRepository.getOne(idUser);
		
		Codification codification = new Codification ();
		codification.setTypeCodif("");
		codification.setProspect(prospect);
		codification.setUser(user);
		codification.setDateCodif(LocalDate.now().toString());
		
		
		Codification savedCodification = codificationRepository.save(codification);
		
		
		
		return savedCodification;
	}

	public Codification codifierProspect(CodificationRequest codificationRequest) {
		Long idUser = codificationRequest.getIdUser();
		Long idProspect = codificationRequest.getIdProspect();
		 User user = userRepository.getOne(idUser);
		 Prospect prospect = prospectRepository.getOne(idProspect);
		 
		 Codification codification = new Codification();
		 codification.setUser(user);
		 codification.setProspect(prospect);
		 codification.setTypeCodif("");
		 codification.setDateCodif(LocalDate.now().toString());
		 Codification savedCodification = codificationRepository.save(codification);
		return savedCodification;
	}


}
