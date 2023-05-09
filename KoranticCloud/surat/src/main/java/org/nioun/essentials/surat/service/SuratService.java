package org.nioun.essentials.surat.service;

import java.util.List;

import org.nioun.essentials.surat.model.Surat;

public interface SuratService  {

	Surat saveSurat(Surat surat);
	
	Surat updateSurat(Surat surat);
	
	void deleteSurat(Surat surat);
	
	Surat getSurat(Long suratId);
	
	List<Surat> getAllSurats();
	
}
