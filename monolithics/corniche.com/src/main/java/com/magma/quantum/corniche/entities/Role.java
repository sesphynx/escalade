package com.magma.quantum.corniche.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

@SuppressWarnings("serial")
@Entity
public class Role extends AbstractEntity implements GrantedAuthority{
	
	private String name;
	@ManyToMany(mappedBy="roles")
	private Set<User> users;

	/**
	 * @return the users
	 */
	public Set<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getAuthority() {
		return name;
	}
	
	

}
