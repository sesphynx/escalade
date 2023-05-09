package org.nioun.essentials.niounfull.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.Set;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String surname;
	private String email;
	private String username;
	private String password;
	public int nin ;
	public int numCarteElecteur ;
	public int numTel ;
	
	
	@ManyToMany
	@JoinTable(name="user_role",
	joinColumns = @JoinColumn (name="user_id") ,
	inverseJoinColumns = @JoinColumn( name="role_id"))
	private Set<Role> roles;
	
	@ManyToMany
	@JoinTable(name="user_entite",joinColumns = @JoinColumn(name="userId"),inverseJoinColumns=@JoinColumn(name="entiteId"))
	public List<Entite> entites ;
	
	@ManyToMany
	@JoinTable(name="grade_entite",joinColumns = @JoinColumn(name="userId"),inverseJoinColumns=@JoinColumn(name="gradeId"))
	public List<Grade> grades ;
}
