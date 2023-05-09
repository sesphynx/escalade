package org.nioun.essentials.machinter.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.nioun.essentials.machinter.model.Operateur;
import org.nioun.essentials.machinter.repo.OperateurRepository;
import org.nioun.essentials.machinter.service.OperateurService;
@Service
public class OperateurServiceImpl implements OperateurService{
	
	@Autowired
	 OperateurRepository operateurRepository;
	
	public Operateur saveOperateur(Operateur operateur) {
		
		return operateurRepository.save(operateur);
	}

	public Operateur updateOperateur(Operateur operateur) {
	
		return operateurRepository.save(operateur);
	}

	public void deleteOperateur(Operateur operateur) {
		operateurRepository.delete(operateur);

	}

	
	
	public List<Operateur> getAllOperateurs() {
		return operateurRepository.findAll();
	}
	
	
	public Operateur getOperateurById(Long id) {
		return  operateurRepository.getOne(id);
	}
	
	
	public OperateurRepository getRepository() {
		return operateurRepository;
	}

	public void setRepository(OperateurRepository operateurRepository) {
		this.operateurRepository = operateurRepository;
	}

}
