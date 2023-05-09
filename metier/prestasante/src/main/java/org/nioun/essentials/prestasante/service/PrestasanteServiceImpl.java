package org.nioun.essentials.prestasante.service;

import java.util.List;

import org.nioun.essentials.prestasante.model.Prestasante;
import org.nioun.essentials.prestasante.repository.PrestasanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestasanteServiceImpl implements PrestasanteService {


	@Autowired
	PrestasanteRepository prestasanteRepository;
	
	
	
	
	public PrestasanteRepository getPrestasanteRepository() {
		return prestasanteRepository;
	}

	public void setPrestasanteRepository(PrestasanteRepository prestasanteRepository) {
		this.prestasanteRepository = prestasanteRepository;
	}

	@Override
	public Prestasante savePrestasante(Prestasante prestasante) {

		return prestasanteRepository.save(prestasante);
	}

	
	public Prestasante updatePrestasante(Prestasante prestasante) {

		return prestasanteRepository.save(prestasante);
	}

	@Override
	public void deletePrestasante(Prestasante prestasante) {
		prestasanteRepository.delete(prestasante);

	}

	@Override
	public Prestasante getPrestasante(Long prestasanteId) {

		return prestasanteRepository.findById(prestasanteId).get();
	}

	@Override
	public List<Prestasante> getAllPrestasantes() {

		return prestasanteRepository.findAll();
	}

}
