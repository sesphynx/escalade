package org.nioun.essentials.lambada;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Person {

	public enum Sex{
		MALE,FEMELLE
		} 
	
	String name ;
	int age ;
	String email;
	Sex gender;


	public void printPerson() {
		System.out.println(this.toString());
	}
	
	public static List<Person> defaultList(){
		List<Person> persons= new ArrayList<>();
		persons.add(new Person("aminata", 80, "aminatayebe@yahoo.fr", Sex.FEMELLE));
		persons.add(new Person("badara", 20, "badouniang@gmail.com", Sex.MALE));
		persons.add(new Person("cleopatra", 38, "cleopatra@gmail.com", Sex.FEMELLE));
		
		return persons ;
	}
}
