package org.quantum.nine.magma.corantic.model;

import java.util.ArrayList;

public class Structure extends AbstractEntity {

	private Surat surat;
	private Versets verset ;
	private String language ;
	private ArrayList<String> terms ;
	private String value ;
	public Surat getSurat() {
		return surat;
	}
	public void setSurat(Surat surat) {
		this.surat = surat;
	}
	public Versets getVerset() {
		return verset;
	}
	public void setVerset(Versets verset) {
		this.verset = verset;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public ArrayList<String> getTerms() {
		return terms;
	}
	public void setTerms(ArrayList<String> terms) {
		this.terms = terms;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
