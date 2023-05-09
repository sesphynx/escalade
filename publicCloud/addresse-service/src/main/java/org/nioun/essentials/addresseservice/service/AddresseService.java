package org.nioun.essentials.addresseservice.service;

import java.util.List;

import org.nioun.essentials.niouncore.*;

public interface AddresseService {


	Addresse saveAddresse(Addresse addresse);

	Addresse updateAddresse(Addresse addresse);

	void deleteAddresse(Addresse addresse);

	Addresse getAddresseById(Long id);

	List<Addresse> getAllAddresses();
}
