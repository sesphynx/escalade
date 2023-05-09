package org.nioun.essentials.krea.service;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.nioun.essentials.krea.model.Video;
import org.nioun.essentials.krea.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class VideoServiceImplIT {

	@Autowired
	VideoService service;
	
	@Autowired
	VideoRepository repo;

	String testName = "myVid";
	
	@Test
	void getVideo(){
	
		Video expected =new Video(testName,null);
		repo.save(expected);
		
		Video actual = service.getVideo(testName);
		
		// The result from service.getVideo(testName) should be expected Video instance above
		
		assertEquals(expected ,actual );
		
	}
	
	@Test
	void saveVideo() throws IOException {
		
		Video expected = new Video(testName, null);
		repo.save(expected);
		Video actual = service.getVideo(testName);
		
		// the result from service.getVideo(testName) should expected video instance above
		
		assertEquals(expected,actual);
	}
	
	
	@Test
	void getAllVideoNames() {
		
		List<String> expected = List.of(testName);
		repo.save(new Video(testName, null));
		List<String> actual = service.getAllVideoNames();
		//check the service returns a list of same contents as expected list of videos
		assertTrue(expected.size()== actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
	}
	
}
