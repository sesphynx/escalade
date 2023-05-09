package org.nioun.essentials.leafragments.utils;

import java.util.ArrayList;
import java.util.List;

import org.nioun.essentials.leafragments.model.Etudiant;

public class EtudiantsUtils {

	 private static List<Etudiant> students = new ArrayList<Etudiant>();

	    public static List<Etudiant> buildStudents() {
	        if (students.isEmpty()) {
	            Etudiant student1 = new Etudiant();
	            student1.setId(1001);
	            student1.setName("John Smith");
	            student1.setGender('M');
	            student1.setPercentage(Float.valueOf("80.45"));

	            students.add(student1);

	            Etudiant student2 = new Etudiant();
	            student2.setId(1002);
	            student2.setName("Jane Williams");
	            student2.setGender('F');
	            student2.setPercentage(Float.valueOf("60.25"));

	            students.add(student2);
	        }

	        return students;
	    }

	
	
}
