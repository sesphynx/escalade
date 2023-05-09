package org.nioun.essentials.bien.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
public class Fournisseur {
	

     Long fournisseurId ;
	 String firstName;
	 String lastName;
	 String email;
	 String phone;
	 String addresse;

}
