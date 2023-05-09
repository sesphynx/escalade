package org.nioun.essentials.surat.service;

import java.util.List;

import org.nioun.essentials.surat.model.Surat;
import org.nioun.essentials.surat.repository.SuratRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuratServiceImpl implements SuratService {

	@Autowired
	SuratRepos suratRepos; 
	
	
	
	public SuratRepos getSuratRepos() {
		return suratRepos;
	}


	public void setSuratRepos(SuratRepos suratRepos) {
		this.suratRepos = suratRepos;
	}


	
	public Surat saveSurat(Surat surat) {
		return suratRepos.save(surat);
		
	}

	
	
	
	public Surat updateSurat(Surat surat) {
		
		return suratRepos.save(surat);
	}


	public void deleteSurat(Surat surat) {
		suratRepos.delete(surat);

	}


	public Surat getSurat(Long suratId) {

		return suratRepos.getById(suratId);
	}


	public List<Surat> getAllSurats() {
		
		return suratRepos.findAll();
	}

}
