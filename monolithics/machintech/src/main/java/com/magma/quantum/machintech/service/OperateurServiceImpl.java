package com.magma.quantum.machintech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.machintech.entities.Operateur;
import com.magma.quantum.machintech.repos.OperateurRepository;

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
