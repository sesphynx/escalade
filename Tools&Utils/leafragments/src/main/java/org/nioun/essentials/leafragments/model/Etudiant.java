package org.nioun.essentials.leafragments.model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Etudiant {
	
	 
	    private Integer id;

	    
	    private String name;

	    private Character gender;

	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date birthDate;

	    private Float percentage;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Character getGender() {
	        return gender;
	    }

	    public void setGender(Character gender) {
	        this.gender = gender;
	    }

	    public Date getBirthDate() {
	        return birthDate;
	    }

	    public void setBirthDate(Date birthDate) {
	        this.birthDate = birthDate;
	    }

	    public Float getPercentage() {
	        return percentage;
	    }

	    public void setPercentage(Float percentage) {
	        this.percentage = percentage;
	    }

}
