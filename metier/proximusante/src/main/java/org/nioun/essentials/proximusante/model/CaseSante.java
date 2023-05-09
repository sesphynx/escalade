package org.nioun.essentials.proximusante.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.n52.jackson.datatype.jts.GeometryDeserializer;
import org.n52.jackson.datatype.jts.GeometrySerializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;
import net.postgis.jdbc.geometry.Point;

@Getter
@Setter
@Entity
@Table(name="case_sante")
public class CaseSante implements Serializable {

	private static final long serialVersionUID = 1L ;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "geom" ,columnDefinition = "geometry(Point,4326)")
	@JsonSerialize(using = GeometrySerializer.class)
	@JsonDeserialize(contentUsing = GeometryDeserializer.class)
	private Point geom;
	
	

	public CaseSante() {
	}

	public CaseSante(Integer id, String name, Point geom) {
		this.id = id;
		this.name = name;
		this.geom = geom;
	}

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

	public Point getGeom() {
		return geom;
	}

	public void setGeom(Point geom) {
		this.geom = geom;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CaseSante [id=" + id + ", name=" + name + ", geom=" + geom + "]";
	}
	
	
	
}
