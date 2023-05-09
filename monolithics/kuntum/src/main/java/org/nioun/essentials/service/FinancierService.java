package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Financier;

public interface FinancierService {

	Financier saveFinancier(Financier financier);

	Financier updateFinancier(Financier financier);

	void deleteFinancier(Financier financier);

	Financier getFinancierById(Long id);

	List<Financier> getAllFinanciers();
	
}
