package org.quantum.nine.magma.corantic.model;

import java.util.ArrayList;
import java.util.List;

public class Gramm extends AbstractEntity {
	
	private String value ;
	private List<Versets> versetList ;
	private ArrayList<String> terms ;
	
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public List<Versets> getVersetList() {
		return versetList;
	}
	public void setVersetList(List<Versets> versetList) {
		this.versetList = versetList;
	}
	public ArrayList<String> getTerms() {
		return terms;
	}
	public void setTerms(ArrayList<String> terms) {
		this.terms = terms;
	}

	
}
