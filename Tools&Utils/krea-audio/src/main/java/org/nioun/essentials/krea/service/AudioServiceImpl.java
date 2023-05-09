package org.nioun.essentials.krea.service;

import java.io.IOException;
import java.util.List;

import org.nioun.essentials.krea.exception.AudioAlreadyExistsException;
import org.nioun.essentials.krea.exception.AudioNotFoundException;
import org.nioun.essentials.krea.model.Audio;
import org.nioun.essentials.krea.repository.AudioRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class AudioServiceImpl implements AudioService {

	private AudioRepository repo;
	
	
	public Audio getVideo(String name) {
		 if(!repo.existsByName(name)) {
			 throw new AudioNotFoundException();
			 }
		return repo.findByName(name);
	}

	
	public void saveVideo(MultipartFile file, String name) throws IOException {
		if(repo.existsByName(name)) {
			throw new AudioAlreadyExistsException();
		}
		
		Audio newVid=new Audio(name,file.getBytes());
		repo.save(newVid);
	}


	public List<String> getAllVideoNames() {

		return repo.getAllEntryNames();
	}

}
