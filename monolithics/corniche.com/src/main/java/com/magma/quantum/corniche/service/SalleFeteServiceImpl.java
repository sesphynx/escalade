package com.magma.quantum.corniche.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.corniche.entities.SalleFete;
import com.magma.quantum.corniche.repos.SalleFeteRepository;

@Service
public class SalleFeteServiceImpl {

		@Autowired
		SalleFeteRepository salleFeteRepository; 
				
		public SalleFeteRepository getSalleFeteRepository() {
			return salleFeteRepository;
		}

		public void setSalleFeteRepository(SalleFeteRepository salleFeteRepository) {
			this.salleFeteRepository = salleFeteRepository;
		}

		
		public SalleFete saveSalleFete(SalleFete salleFete) {
			return salleFeteRepository.save(salleFete);
		}

		
		public SalleFete updateSalleFete(SalleFete salleFete) {
			return salleFeteRepository.save(salleFete);
		}

		
		public void deleteSalleFete(SalleFete salleFete) {
		salleFeteRepository.delete(salleFete);
		}

		
		public SalleFete getSalleFete(Long id) {
				return salleFeteRepository.getOne(id);
		}

		
		public List<SalleFete> getAllSalleFetes() {
		
			return salleFeteRepository.findAll();
		}

	


}
