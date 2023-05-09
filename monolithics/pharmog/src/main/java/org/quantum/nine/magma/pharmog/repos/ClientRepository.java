package org.quantum.nine.magma.pharmog.repos;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
	Client  findByEmail(String email);
	
	Client  findByPhone(String phone);
	
	 List<Client> findByFirstName(String firstName);
	
	 List<Client> findByLastName(String lastName);
	 
}
