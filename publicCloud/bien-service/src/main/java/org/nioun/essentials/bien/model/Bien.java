package org.nioun.essentials.bien.model;

import java.math.BigDecimal;

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
public class Bien {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long bienId ;

	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	private String image;

	@Column(name="name")
	private String name ;

	@Column(name="description")
	private String description;


	private BigDecimal price ;


	private String categorie ;
	
	private Long fournisseurId ;
	
	
}
