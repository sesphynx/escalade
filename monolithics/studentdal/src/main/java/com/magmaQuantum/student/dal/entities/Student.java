package com.magmaQuantum.student.dal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="studenttab")
public class Student {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id ;
	
	@Column(name="sname")
	 private String name ;
	
	@Column(name="scourse")
	private String course ;
	
	@Column(name="sfee")
	private Double fee ;
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
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
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/**
	 * @return the fee
	 */
	public Double getFee() {
		return fee;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setFee(Double fee) {
		this.fee = fee;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
	}
	

}
