package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Client;

public interface ClientService {


	Client saveClient(Client client);

	Client updateClient(Client client);

	void deleteClient(Client client);

	Client getClientById(Long id);

	List<Client> getAllClients();
}
