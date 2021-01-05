package eialid.joy.javaLambdaUnit2;

import java.util.Arrays;
import java.util.List;

import eialid.joy.javaLambda.Person;

public class Java8ForLoopIterationExample {

	public static void main(String[] args) {

		List<Person> personsList=Arrays.asList(
				new Person("Eialid","Joy", 24),
				new Person("Mizanur","Rony", 23),
				new Person("Ashraf","Shahadat", 25),
				new Person("Khalid","Saifullah", 28),
				new Person("Mushfiqur","Sharot", 25)
				);
		
		//previous for loop iterations that we usually use
		System.out.println("for loop based on condition");
		for(int i=0; i<personsList.size(); i++) {
			System.out.println(personsList.get(i));
		}
		
		System.out.println();
		System.out.println("for each loop");
		for(Person p: personsList) {
			System.out.println(p);
		}
		
		// Java 8 way to iterate a collection list
		System.out.println();
		System.out.println("for each loop using lambda introduced in java 8");
		personsList.forEach(p->System.out.println(p));   // here, for each method takes the instance of a Comsumer class(a interface from java.util.Function)
		// we implement that interface class using lambda expressions in the argument.
		// for each loop is faster compared to our traditional for loops before java 8.
	}

}
