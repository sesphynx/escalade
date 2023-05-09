package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Client;
import org.nioun.essentials.repos.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientRepository clientRepository ;
	
	

	public ClientRepository getClientRepository() {
		return clientRepository;
	}

	public void setClientRepository(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@Override
	public Client saveClient(Client client) {

		return clientRepository.save(client);
	}

	@Override
	public Client updateClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void deleteClient(Client client) {
    clientRepository.delete(client);

	}

	@Override
	public Client getClientById(Long id) {
		return clientRepository.getOne(id);
	}

	@Override
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}


}
