package org.quantum.nine.magma.pharmog.service;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Addresse;

public interface AddresseService {


	Addresse saveAddresse(Addresse addresse);

	Addresse updateAddresse(Addresse addresse);

	void deleteAddresse(Addresse addresse);

	Addresse getAddresseById(Long id);

	List<Addresse> getAllAddresses();
}
