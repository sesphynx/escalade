package org.nioun.essentials.bien.VO;

import org.nioun.essentials.bien.model.Bien;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FournisseurBienVO {

	private Bien bien ;
	private Fournisseur fournisseur ;
	
	
}
