package org.nioun.essentials.krea.service;

import java.io.IOException;
import java.util.List;

import org.nioun.essentials.krea.model.Audio;
import org.springframework.web.multipart.MultipartFile;

public interface AudioService {

	
	 Audio getVideo(String name);
	 
	 void saveVideo(MultipartFile file , String name) throws IOException;
	 
	 List<String> getAllVideoNames();
}
