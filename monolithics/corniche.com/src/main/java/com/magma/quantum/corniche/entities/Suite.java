package com.magma.quantum.corniche.entities;

public class Suite extends Chambre {
	
	
	public int pieces ;
	public boolean jacuzzi ;
	public boolean balcon ;
	
	public int getPieces() {
		return pieces;
	}
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	public boolean isJacuzzi() {
		return jacuzzi;
	}
	public void setJacuzzi(boolean jacuzzi) {
		this.jacuzzi = jacuzzi;
	}
	public boolean isBalcon() {
		return balcon;
	}
	public void setBalcon(boolean balcon) {
		this.balcon = balcon;
	}
	
	
}
