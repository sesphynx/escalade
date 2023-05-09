package org.nioun.essentials.machinter.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Offre extends AbstractEntity {
	
	@ManyToOne
	@JoinColumn(name="operateurId")
	private Operateur operateur ;
	private String  nomOffre ;
	private Date dureeMini ;
	private String tarif ;
	
	 @ManyToMany
	 Collection < Vente > listOffreVte = new ArrayList<Vente> ();
	/**
	 * @return the operateur
	 */
	public Operateur getOperateur() {
		return operateur;
	}
	/**
	 * @param operateur the operateur to set
	 */
	public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}
	/**
	 * @return the nomOffre
	 */
	public String getNomOffre() {
		return nomOffre;
	}
	/**
	 * @param nomOffre the nomOffre to set
	 */
	public void setNomOffre(String nomOffre) {
		this.nomOffre = nomOffre;
	}
	/**
	 * @return the dureeMini
	 */
	public Date getDureeMini() {
		return dureeMini;
	}
	/**
	 * @param dureeMini the dureeMini to set
	 */
	public void setDureeMini(Date dureeMini) {
		this.dureeMini = dureeMini;
	}
	/**
	 * @return the tarif
	 */
	public String getTarif() {
		return tarif;
	}
	/**
	 * @param tarif the tarif to set
	 */
	public void setTarif(String tarif) {
		this.tarif = tarif;
	}
	@Override
	public String toString() {
		return "Offre [operateur=" + operateur + ", nomOffre=" + nomOffre + ", dureeMini=" + dureeMini + ", tarif="
				+ tarif + "";
	}
	
	
	

}
