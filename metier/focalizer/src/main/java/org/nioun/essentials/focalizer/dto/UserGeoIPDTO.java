package org.nioun.essentials.focalizer.dto;

public class UserGeoIPDTO {
	
	Long id ;
	String username ;
	String city ;
	Double lat ;
	Double lng ;
	
	public UserGeoIPDTO() {
	}
	public UserGeoIPDTO(Long id, String username, String city, Double lat, Double lng) {
		this.id = id;
		this.username = username;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	
	

}
