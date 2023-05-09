package org.quantum.nine.magma.pharmog.service;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Client;

public interface ClientService {


	Client saveClient(Client client);

	Client updateClient(Client client);

	void deleteClient(Client client);

	Client getClientById(Long id);

	List<Client> getAllClients();
}
