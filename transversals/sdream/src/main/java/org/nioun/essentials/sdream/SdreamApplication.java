package org.nioun.essentials.sdream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SdreamApplication {
	
	static private List<Employee> employees = new ArrayList<>();
	
	static {
		employees.add(
				
				new Employee("bousso","gaye",90000.0,List.of("nioun.headoffice","nioun.services","nioun.management"))				
				
				);
		

		employees.add(
				
				new Employee("cheikh","seck",60000.0,List.of("nioun.headoffice","nioun.services","nioun.finance"))				
				
				);

		employees.add(
				
				new Employee("el habib ","ndiaye",60000.0,List.of("nioun.headoffice","nioun.services","nioun.communication"))				
				
				);
employees.add(
				
				new Employee("pape","ba",10000.0,List.of("nioun.services","nioun.livraison"))				
				
				);
employees.add(
		
		new Employee("mouhamed","sow",30000.0,List.of("nioun.headoffice","nioun.services","nioun.matiere"))				
		
		);
employees.add(
		
		new Employee("sophie","sy",30000.0,List.of("nioun.headoffice","nioun.services","nioun.matiere"))				
		
		);
		
		
	}
	
	public static void main(String[] args) {
	//	SpringApplication.run(SdreamApplication.class, args);
	
		//forEach
		System.out.println("List of "
				+ " members");	
		employees.stream()
		         .forEach( 
		        		 employee -> System.out.println(employee)
		        		 );
		//map
		System.out.println("List of bolded members");
		List<Employee> collaborators= employees.stream()
				 .map(employee->new Employee(
						 employee.getFirstName(),
						 employee.getLastName(),
						 employee.getSalary()*3,
						 employee.getProjects()
						                     )
					  )
				 .collect(Collectors.toList());
		collaborators.stream()
        .forEach( 
       		 employee -> System.out.println(employee)
       		 );
	
		//filter
		System.out.println("List of filtered members");
		List<Employee> familyTies = 
				employees
				.stream()
				.filter(employee -> employee.getSalary() < 20000.0)
				.map(employee -> new Employee(
						employee.getFirstName(),
						employee.getLastName(),
						employee.getSalary()*2,
						employee.getProjects()
				     ))
				.collect(Collectors.toList());
		familyTies.stream()
		          .forEach(
		        		  employee->  System.out.print(employee)
		        		  
		        		  );
		
		//flatMap
String projets =
        employees
		.stream()
		.map(employee -> employee.getProjects())
		.flatMap(strings->strings.stream())
		.collect(Collectors.joining(",")); 
	

	System.out.println();
	
	System.out.println(projets);
	}

}
