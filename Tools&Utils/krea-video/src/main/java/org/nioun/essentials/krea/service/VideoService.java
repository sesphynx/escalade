package org.nioun.essentials.krea.service;

import java.io.IOException;
import java.util.List;

import org.nioun.essentials.krea.model.Video;
import org.springframework.web.multipart.MultipartFile;

public interface VideoService {

	
	 Video getVideo(String name);
	 
	 void saveVideo(MultipartFile file , String name) throws IOException;
	 
	 List<String> getAllVideoNames();
}
