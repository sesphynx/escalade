package org.quantum.nine.magma.pharmog.service;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Addresse;
import org.quantum.nine.magma.pharmog.repos.AddresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddresseServiceImpl implements AddresseService {

	@Autowired
	AddresseRepository addresseRepository ;
	
	

	public AddresseRepository getAddresseRepository() {
		return addresseRepository;
	}

	public void setAddresseRepository(AddresseRepository addresseRepository) {
		this.addresseRepository = addresseRepository;
	}

	@Override
	public Addresse saveAddresse(Addresse addresse) {

		return addresseRepository.save(addresse);
	}

	@Override
	public Addresse updateAddresse(Addresse addresse) {
		return addresseRepository.save(addresse);
	}

	@Override
	public void deleteAddresse(Addresse addresse) {
    addresseRepository.delete(addresse);

	}

	@Override
	public Addresse getAddresseById(Long id) {
		return addresseRepository.getOne(id);
	}

	@Override
	public List<Addresse> getAllAddresses() {
		return addresseRepository.findAll();
	}


}
