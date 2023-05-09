package org.quantum.nine.magma.resto.service;

import java.util.List;

import org.quantum.nine.magma.resto.entities.Addresse;

public interface AddresseService {


	Addresse saveAddresse(Addresse addresse);

	Addresse updateAddresse(Addresse addresse);

	void deleteAddresse(Addresse addresse);

	Addresse getAddresseById(Long id);

	List<Addresse> getAllAddresses();
}
