package org.nioun.essentials.krea.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Audio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	
	
	@Column(unique = true)
	private String name ;
	
	@Lob
	private byte[] data;

	public Audio(String name, byte[] data) {
		this.name = name;
		this.data = data;
	}
	
	
}
