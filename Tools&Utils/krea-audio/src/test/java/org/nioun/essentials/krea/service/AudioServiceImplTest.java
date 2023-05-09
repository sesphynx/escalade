package org.nioun.essentials.krea.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.nioun.essentials.krea.model.Audio;
import org.nioun.essentials.krea.repository.AudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.multipart.MultipartFile;

@SpringBootTest
@Transactional
class AudioServiceImplTest {

	@Autowired AudioService service;
	@Autowired AudioRepository videoRepo;
	
// Test value for our tests
 String testName = "myVid" ; 
	 
	 @Test
	 void getVideo() {
		
		 Audio expected = new Audio(testName,null);
		
		//when videoService object calls repo.findByName(testname), return expected
		
		when(videoRepo.findByName(testName))
					  .thenReturn(expected);
		
		// when our AudioService object calls repo.existsByName(testName) , return true
		
		when(videoRepo.existsByName(testName))
					  .thenReturn(true);
		
		Audio actual = service.getVideo(testName);
		assertEquals(expected, actual);
		verify(videoRepo, times(1)).existsByName(testName);
		verify(videoRepo, times(1)).findByName(testName);
		
	 }
	 
	
	 
	 @Test
	 void saveVideo() throws IOException {
		MultipartFile file = mock(MultipartFile.class);
		service.saveVideo(file, testName);
		
		//After saving the video using the service , the repository should say the video exists 
		assertTrue(videoRepo.existsByName(testName));
	 }
	 
	 @Test
	 void getAllVideoNames() {
		 List<String> expected = List.of(testName);
		 videoRepo.save(new Audio(testName,null));
		 List<String> actual = service.getAllVideoNames();
		 
		 // Check the service returns a list of the same contents as the expected list of videos 
		 assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
		 
	 }
	
	 
}
