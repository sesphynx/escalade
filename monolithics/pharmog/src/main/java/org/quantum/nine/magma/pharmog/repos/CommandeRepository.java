package org.quantum.nine.magma.pharmog.repos;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Client;
import org.quantum.nine.magma.pharmog.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.lang.String;
import java.util.Date;
import org.quantum.nine.magma.pharmog.entities.Payment;

@Repository
public interface CommandeRepository extends JpaRepository<Commande,Long> {

	List <Commande> findByClient(Client client);
	
	List<Commande> findByOrderNumber(String ordernumber);
	
	List<Commande> findByCreatedOn(Date createdon);
	
	List<Commande> findByPayment(Payment payment);
	
	

}
