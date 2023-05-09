package com.magma.quantum.politicone.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class User extends AbstractEntity{
	
	private String firstName;
	private String lastName ;
	private String email ;
	private String password ;
	public int nin ;
	public int numCarteElecteur ;
	public int numTel ;
	
	
	@ManyToMany
	@JoinTable(name="user_role",
	joinColumns= @JoinColumn (name="user_id") ,
	inverseJoinColumns = @JoinColumn( name="role_id"))
	private Set<Role> roles;
	
	@ManyToMany
	@JoinTable(name="user_entite",joinColumns = @JoinColumn(name="userId"),inverseJoinColumns=@JoinColumn(name="entiteId"))
	public List<Entite> entites ;
	
	@ManyToMany
	@JoinTable(name="grade_entite",joinColumns = @JoinColumn(name="userId"),inverseJoinColumns=@JoinColumn(name="gradeId"))
	public List<Grade> grades ;
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the roles
	 */
	public Set<Role> getRoles() {
		return roles;
	}
	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public int getNin() {
		return nin;
	}
	public void setNin(int nin) {
		this.nin = nin;
	}
	public int getNumCarteElecteur() {
		return numCarteElecteur;
	}
	public void setNumCarteElecteur(int numCarteElecteur) {
		this.numCarteElecteur = numCarteElecteur;
	}
	public int getNumTel() {
		return numTel;
	}
	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((entites == null) ? 0 : entites.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((grades == null) ? 0 : grades.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + nin;
		result = prime * result + numCarteElecteur;
		result = prime * result + numTel;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		return result;
	}
	public List<Entite> getEntites() {
		return entites;
	}
	public void setEntites(List<Entite> entites) {
		this.entites = entites;
	}
	public List<Grade> getGrades() {
		return grades;
	}
	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (entites == null) {
			if (other.entites != null)
				return false;
		} else if (!entites.equals(other.entites))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (grades == null) {
			if (other.grades != null)
				return false;
		} else if (!grades.equals(other.grades))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (nin != other.nin)
			return false;
		if (numCarteElecteur != other.numCarteElecteur)
			return false;
		if (numTel != other.numTel)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password
				+ ", nin=" + nin + ", numCarteElecteur=" + numCarteElecteur + ", numTel=" + numTel + ", roles=" + roles
				+ ", entites=" + entites + ", grades=" + grades + "]";
	}

	

}
