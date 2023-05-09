package org.nioun.essentials.paiement;

import java.math.BigDecimal;


import org.nioun.essentials.paiement.model.Paiement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="commande")
public interface CommandeProxy {


	@GetMapping("/commande-feign/name/{name}/description/{description}/quantite/{quantite}")
	public Paiement returnCommandeValueFeign(@PathVariable String name ,
			@PathVariable String description ,
			@PathVariable BigDecimal quantite) ;
	
	
	@GetMapping("/commande/commandeId/{commandeId}")
	public Paiement getCommandeById(@PathVariable Long commandeId);

}
