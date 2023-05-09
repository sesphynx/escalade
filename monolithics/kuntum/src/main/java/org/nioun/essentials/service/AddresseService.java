package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Addresse;

public interface AddresseService {


	Addresse saveAddresse(Addresse addresse);

	Addresse updateAddresse(Addresse addresse);

	void deleteAddresse(Addresse addresse);

	Addresse getAddresseById(Long id);

	List<Addresse> getAllAddresses();
}
