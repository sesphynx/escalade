package org.nioun.essentials.authorizationserver.model;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="role")
@Data
public class Role extends AbstractEntity {


	private String name ;
	
@ManyToMany( mappedBy="roles")
	private Collection<User> users ;

@ManyToMany
@JoinTable(
		name="roles_permissions",
		joinColumns = @JoinColumn(
				name="role_id", referencedColumnName="id"),
		inverseJoinColumns=@JoinColumn(
				name="permission_id",referencedColumnName="id")
		)
public Collection<Permission> permissions ;
	

/**
 * 
 */
  public Role() {

}

/**
 * @param name
 * @param users
 * @param permissions
 */
public Role(String name, Collection<User> users, Collection<Permission> permissions) {
	super();
	this.name = name;
	this.users = users;
	this.permissions = permissions;
}

/**
 * @param name
 */
public Role(String name) {
	super();
	this.name = name;
}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Collection<User> getUsers() {
		return users;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}

	
	

	public Collection<Permission> getPermissions() {
		return permissions;
	}

	public void setPPermissions(Collection<Permission> permissions) {
		this.permissions = permissions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((permissions == null) ? 0 : permissions.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (permissions == null) {
			if (other.permissions != null)
				return false;
		} else if (!permissions.equals(other.permissions))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Role [name=" + name + ", users=" + users + ", permissions=" + permissions + "]";
	}




	
	
	
	
}
