package org.nioun.essentials.krea.service;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.nioun.essentials.krea.model.Audio;
import org.nioun.essentials.krea.repository.AudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class AudioServiceImplIT {

	@Autowired
	AudioService service;
	
	@Autowired
	AudioRepository repo;

	String testName = "myVid";
	
	@Test
	void getVideo(){
	
		Audio expected =new Audio(testName,null);
		repo.save(expected);
		
		Audio actual = service.getVideo(testName);
		
		// The result from service.getVideo(testName) should be expected Audio instance above
		
		assertEquals(expected ,actual );
		
	}
	
	@Test
	void saveVideo() throws IOException {
		
		Audio expected = new Audio(testName, null);
		repo.save(expected);
		Audio actual = service.getVideo(testName);
		
		// the result from service.getVideo(testName) should expected video instance above
		
		assertEquals(expected,actual);
	}
	
	
	@Test
	void getAllVideoNames() {
		
		List<String> expected = List.of(testName);
		repo.save(new Audio(testName, null));
		List<String> actual = service.getAllVideoNames();
		//check the service returns a list of same contents as expected list of videos
		assertTrue(expected.size()== actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
	}
	
}
