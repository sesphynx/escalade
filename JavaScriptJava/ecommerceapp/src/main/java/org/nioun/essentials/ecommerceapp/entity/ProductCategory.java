package org.nioun.essentials.ecommerceapp.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="product_category")
// @Data - known bug 

@Getter
@Setter
public class ProductCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	//@JsonProperty
	private Long id; 
	
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "category")
	private Set<Product> products ;
}
