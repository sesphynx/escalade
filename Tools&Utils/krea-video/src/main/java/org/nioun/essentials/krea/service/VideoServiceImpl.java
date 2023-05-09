package org.nioun.essentials.krea.service;

import java.io.IOException;
import java.util.List;

import org.nioun.essentials.krea.exception.VideoAlreadyExistsException;
import org.nioun.essentials.krea.exception.VideoNotFoundException;
import org.nioun.essentials.krea.model.Video;
import org.nioun.essentials.krea.repository.VideoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class VideoServiceImpl implements VideoService {

	private VideoRepository repo;
	
	
	public Video getVideo(String name) {
		 if(!repo.existsByName(name)) {
			 throw new VideoNotFoundException();
			 }
		return repo.findByName(name);
	}

	
	public void saveVideo(MultipartFile file, String name) throws IOException {
		if(repo.existsByName(name)) {
			throw new VideoAlreadyExistsException();
		}
		
		Video newVid=new Video(name,file.getBytes());
		repo.save(newVid);
	}


	public List<String> getAllVideoNames() {

		return repo.getAllEntryNames();
	}

}
