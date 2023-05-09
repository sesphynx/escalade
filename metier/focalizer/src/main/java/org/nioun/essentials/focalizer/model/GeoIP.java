package org.nioun.essentials.focalizer.model;

import java.net.InetAddress;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GeoIP {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id ;
	
	String ipAddress ;
	
	String city ;
	
	Double lat;
	
	Double lng ;
	
	
	
	


	
	
	public GeoIP(InetAddress ipAddress2, String city2, String lat2, String lng2) {
	}

	public GeoIP(String ipAddress, String city, Double lat, Double lng) {
		this.ipAddress = ipAddress;
		this.city = city;
		this.lat = lat;
		this.lng = lng;
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public String getCity() {
		return city;
	}

	public void setPlace(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "GeoIP [id=" + id + ", city=" + city + ", ipAddress=" + ipAddress + ", lat=" + lat + ", lng=" + lng
				+ "]";
	}

	
	
	
	
}
