package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Financier;
import org.nioun.essentials.repos.FinancierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancierServiceImpl implements FinancierService {
	@Autowired
	FinancierRepository financierRepository ;
	
	

	public FinancierRepository getFinancierRepository() {
		return financierRepository;
	}

	public void setFinancierRepository(FinancierRepository financierRepository) {
		this.financierRepository = financierRepository;
	}

	@Override
	public Financier saveFinancier(Financier financier) {

		return financierRepository.save(financier);
	}

	@Override
	public Financier updateFinancier(Financier financier) {
		return financierRepository.save(financier);
	}

	@Override
	public void deleteFinancier(Financier financier) {
    financierRepository.delete(financier);

	}

	@Override
	public Financier getFinancierById(Long id) {
		return financierRepository.getOne(id);
	}

	@Override
	public List<Financier> getAllFinanciers() {
		return financierRepository.findAll();
	}


}
