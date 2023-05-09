package org.nioun.essentials.paiement;


import org.nioun.essentials.paiement.model.Paiement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient (name="client")
public interface ClientProxy {
	
	@GetMapping("/client/firstName/{firstName}/lastName/{lastName}")
	public  Paiement	getClient(@PathVariable String firstName , @PathVariable String lastName);
	
	@GetMapping("/client/clientId/{clientId}")	
	public Paiement getClientById(@PathVariable Long clientId);

}
