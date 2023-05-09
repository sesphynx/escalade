package com.magma.quantum.machintech.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.springframework.security.core.GrantedAuthority;


@Entity
public class Role extends AbstractEntity implements GrantedAuthority {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	@OneToOne(fetch=FetchType.LAZY )
	private User user ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Role [name=" + name + ", users=" + user + "]";
	}

	public String getAuthority() {
		
		return name;
	} 
	

	

}
