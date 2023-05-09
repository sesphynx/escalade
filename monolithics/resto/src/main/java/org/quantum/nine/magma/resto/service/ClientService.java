package org.quantum.nine.magma.resto.service;

import java.util.List;

import org.quantum.nine.magma.resto.entities.Client;

public interface ClientService {


	Client saveClient(Client client);

	Client updateClient(Client client);

	void deleteClient(Client client);

	Client getClientById(Long id);

	List<Client> getAllClients();
}
