package com.magmaQuantum.student.dal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.magmaQuantum.student.dal.entities.Student;
import com.magmaQuantum.student.dal.repos.StudentRepository;

@SpringBootApplication
public class StudentdalApplication {
	@Autowired
	StudentRepository studentRepository ;
	
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(StudentdalApplication.class, args);
	}
	
	 public void testCreateStudent() {
			
			Student cheikh = new Student();
			cheikh.setName("C.A.T");
			cheikh.setCourse("Korantic");
			cheikh.setFee(30d);
			studentRepository.save(cheikh);
		}
	
	
}
