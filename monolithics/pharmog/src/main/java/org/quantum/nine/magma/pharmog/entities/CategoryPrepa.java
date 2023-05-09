package org.quantum.nine.magma.pharmog.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class CategoryPrepa extends AbstractEntity {
	
	private String name;
	
	private String description;
	
	private Integer displayOrder;
	
	private boolean disabled;
	
	@OneToMany(mappedBy="categoryPrepa")
	private Set<Prepa> prepas;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public Set<Prepa> getPrepas() {
		return prepas;
	}

	public void setPrepas(Set<Prepa> prepas) {
		this.prepas = prepas;
	}

	@Override
	public String toString() {
		return "Category [name=" + name + ", description=" + description + ", displayOrder=" + displayOrder
				+ ", disabled=" + disabled + ", prepas=" + prepas + "]";
	}
	
	

}
