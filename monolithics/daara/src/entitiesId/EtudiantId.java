package entitiesId;

import java.io.Serializable;

public class EtudiantId implements Serializable{

	private String nom ;
	private String prenom;
	private String email ;
	
	public EtudiantId(){
		
	}
	public EtudiantId(String nom , String prenom , String email){
		this.nom = nom ;
		this.prenom = prenom ;
		this.email = email ;
		
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
