package org.nioun.essentials.point.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Point {
	
	@Id
	@GeneratedValue
	Long pointId ;
	String addresse;
	String phone;

public Point() {
	
}

public Point( String addresse, String phone) {
	super();
	this.addresse = addresse;
	this.phone = phone;
}

public Long getPointId() {
	return pointId;
}

public void setPointId(Long pointId) {
	this.pointId = pointId;
}

public String getAddresse() {
	return addresse;
}

public void setAddresse(String addresse) {
	this.addresse = addresse;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}


}
