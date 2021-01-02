package eialid.joy.javaLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonJava7ExerciseSolutionUsingInterfaceInCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> personsList=Arrays.asList(
				new Person("Eialid","Joy", 24),
				new Person("Mizanur","Rony", 23),
				new Person("Ashraf","Shahadat", 25),
				new Person("Khalid","Saifullah", 28),
				new Person("mushfiqur","Sharot", 25)
				);
		
		// Task1- sort by last name
		Collections.sort(personsList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
				
			}
		});
		
		
		
		
		// Task2- create a method to print all the lists sorted by last name
		
		printPersonsList(personsList);
		
		
		// Task3- create a method to prints all the people that have last name beginning with "S"
		System.out.println();
		System.out.println("Printing last name starts with S");
		printLastNameBeginningWithC(personsList, new Behaviour() {
			
			@Override
			public boolean condition(Person p) {
				
				return p.getLastName().startsWith("S");
			}
		});
		
		
		

	}

	private static void printLastNameBeginningWithC(List<Person> personsList, Behaviour behaviour) {
		for(Person p:personsList) {
			if(behaviour.condition(p)) {
				System.out.println(p);
			}
		}
		
	}

	private static void printPersonsList(List<Person> personsList) {
		for(Person p: personsList) {
			System.out.println(p);
		}
		
	}

}

interface Behaviour{
	boolean condition(Person p);
}







