package org.nioun.essentials.transfact.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Departement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departementId;
	private String departementName;
	private String departementCode;

}
