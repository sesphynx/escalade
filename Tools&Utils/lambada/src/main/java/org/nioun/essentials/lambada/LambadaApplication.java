package org.nioun.essentials.lambada;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambadaApplication{
	
	
	@FunctionalInterface
	interface CheckPerson {
		
		boolean test(Person p);
	}
	
	static class CheckPersonEligibleForSelectiveSearch implements CheckPerson {
		
		@Override
		public boolean test(Person p) {
			return p.gender == Person.Sex.FEMELLE &&
					p.getAge()>=20 &&
					p.getAge()<= 90 ;
		}
	}
	
	
	public static void printPeople(List<Person> people , CheckPerson tester) {
		
		for(Person p:people) {
			if(tester.test(p)) {
				p.printPerson();
			}
		}
		
	}
	
public static void printPeopleWithPredicate(List<Person> people , Predicate<Person> tester) {
		
		for(Person p:people) {
			if(tester.test(p)) {
				p.printPerson();
			}
		}
		
	}
	
	public static void printOlderThan(List<Person> people , int age ) {
		for(Person p:people) {
			
			if (p.getAge()>=age) {
			
				p.printPerson();
			
			}
		}
	}

	
	public static void printAgeBetween(List<Person> people ,int min,int max ) {
	
		for(Person p:people) {
			if(min<= p.getAge() && p.getAge()< max) {
				p.printPerson();
			}
		}
		
	}
	
	public static void main(String[] args) {
       
		List<Person> persons = Person.defaultList();
       
      
		
		//  printOlderThan(persons, 10);
       
       //printAgeBetween(persons, 30, 90);
       
       //printPeople(persons, new CheckPersonEligibleForSelectiveSearch());

		
		
/*    
   * archive semi lamba usage
   *  
   *  printPeople(persons, (Person p)-> {
			 return p.gender == Person.Sex.FEMELLE &&
					p.getAge()>=20 &&
					p.getAge()<= 90 ;
					
}
					
	*/				

		
		
		
		
/*
 *  archive interface + method implementation
 * 
 * 
		
		printPeople(persons, new CheckPerson() {
						
						@Override
						public boolean test(Person p) {

							return p.gender == Person.Sex.MALE 
									        && p.getAge()>=25 
									        && p.getAge()<=90;
									        
						}
								
		
	});
*/       

		
		
		// total lambda {constraints:: interface with one single method annotated @FunctionnalInterface}
		//printPeople(persons,  (p)-> p.gender == Person.Sex.MALE  && p.getAge()>=25  && p.getAge()<=90 );
		
		//  printPeopleWithPredicate(persons,  (p)-> p.gender == Person.Sex.MALE  && p.getAge()>=15  && p.getAge()<=90 );
	
	
	}	
}

