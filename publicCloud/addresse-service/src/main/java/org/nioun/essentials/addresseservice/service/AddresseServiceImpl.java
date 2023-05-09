package org.nioun.essentials.addresseservice.service;

import java.util.List;

import org.nioun.essentials.addresseservice.repos.AddresseRepository;
import org.nioun.essentials.niouncore.Addresse;
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

	
	public Addresse saveAddresse(Addresse addresse) {

		return addresseRepository.save(addresse);
	}

	
	public Addresse updateAddresse(Addresse addresse) {
		return addresseRepository.save(addresse);
	}

	
	public void deleteAddresse(Addresse addresse) {
    addresseRepository.delete(addresse);

	}

	
	public Addresse getAddresseById(Long id) {
		return addresseRepository.getOne(id);
	}

	
	public List<Addresse> getAllAddresses() {
		return addresseRepository.findAll();
	}

	
}
