package com.magma.quantum.corniche.entities;

public class Spa extends Plan {
	
	// acces ( classique , illimité , privé ) 
		public String acces ;
		
		public String nbreHeures ;

		public String getAcces() {
			return acces;
		}

		public void setAcces(String acces) {
			this.acces = acces;
		}

		public String getNbreHeures() {
			return nbreHeures;
		}

		public void setNbreHeures(String nbreHeures) {
			this.nbreHeures = nbreHeures;
		}
		

}
