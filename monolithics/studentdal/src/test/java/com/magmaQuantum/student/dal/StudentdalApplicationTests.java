package com.magmaQuantum.student.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.magmaQuantum.student.dal.entities.Student;
import com.magmaQuantum.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

	@Autowired
	StudentRepository studentRepository ;
	
	@Test
	 public void testCreateStudent() {
		
		Student cheikh = new Student();
		cheikh.setName("C.A.T");
		cheikh.setCourse("Korantic");
		cheikh.setFee(30d);
		studentRepository.save(cheikh);
	}

}
