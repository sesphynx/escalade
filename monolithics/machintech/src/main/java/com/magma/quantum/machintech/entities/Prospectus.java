package com.magma.quantum.machintech.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description="Objet Propectus regroupant un ensemble de prospects")
public class Prospectus extends AbstractEntity{
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="campagneId")
	@ApiModelProperty(notes="Campagne concernant le prospectus")
	private Campagne campagne;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userId")
	@ApiModelProperty(notes="Utilisteur-Superviseur ou Conseiller- exploitant du prospectus")
	private User user ;
	
	@OneToMany(mappedBy="prospectus",cascade=CascadeType.ALL)
	@ApiModelProperty(notes="Liste de prospects à contacter et codifier")
	private Collection<Prospect> prospects ;
	
	/**
	 * 
	 */
	public Prospectus() {
		
	}
	/**
	 * @param campagne
	 * @param user
	 * @param prospects
	 */
	public Prospectus(Campagne campagne, User user, Collection<Prospect> prospects) {
		super();
		this.campagne = campagne;
		this.user = user;
		this.prospects = prospects;
	}


	/**
	 * @return the campagne
	 */
	public Campagne getCampagne() {
		return campagne;
	}

	/**
	 * @param campagne the campagne to set
	 */
	public void setCampagne(Campagne campagne) {
		this.campagne = campagne;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the prospects
	 */
	@OneToMany(fetch=FetchType.LAZY ,cascade = {CascadeType.ALL} , mappedBy="prospectus")
	public Collection<Prospect> getProspects() {
		return prospects;
	}

	/**
	 * @param prospects the prospects to set
	 */
	public void setProspects(Collection<Prospect> prospects) {
		this.prospects = prospects;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Prospectus [campagne=" + campagne + ", user=" + user + ", prospects=" + prospects + "]";
	}
	
}
