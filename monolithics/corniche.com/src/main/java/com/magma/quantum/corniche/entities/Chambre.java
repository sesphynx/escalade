package com.magma.quantum.corniche.entities;



import javax.persistence.Entity;

@Entity
public class Chambre extends Logis {

	public boolean douche;
	public boolean serviceEtage;
	public boolean tvAccess;
	public boolean wifiAccess;
	public boolean regularPhoneAccess;
	

	public boolean isDouche() {
		return douche;
	}

	public void setDouche(boolean douche) {
		this.douche = douche;
	}

	public boolean isServiceEtage() {
		return serviceEtage;
	}

	public void setServiceEtage(boolean serviceEtage) {
		this.serviceEtage = serviceEtage;
	}

	public boolean isTvAccess() {
		return tvAccess;
	}

	public void setTvAccess(boolean tvAccess) {
		this.tvAccess = tvAccess;
	}

	public boolean isWifiAccess() {
		return wifiAccess;
	}

	public void setWifiAccess(boolean wifiAccess) {
		this.wifiAccess = wifiAccess;
	}

	public boolean isRegularPhoneAccess() {
		return regularPhoneAccess;
	}

	public void setRegularPhoneAccess(boolean regularPhoneAccess) {
		this.regularPhoneAccess = regularPhoneAccess;
	}

	

}

