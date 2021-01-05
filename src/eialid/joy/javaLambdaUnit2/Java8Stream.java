package eialid.joy.javaLambdaUnit2;

import java.util.Arrays;
import java.util.List;

import eialid.joy.javaLambda.Person;

public class Java8Stream {

	public static void main(String[] args) {
		List<Person> personsList=Arrays.asList(
				new Person("Eialid","Joy", 24),
				new Person("Mizanur","Rony", 23),
				new Person("Ashraf","Shahadat", 25),
				new Person("Khalid","Saifullah", 28),
				new Person("Mushfiqur","Sharot", 25)
				);
		
		// Task-> print first name of those persons who have the last name starting with "s"
		
		//using stream
		personsList.stream()
		.filter(p->p.getLastName().startsWith("S"))
		.forEach(p->System.out.println(p.getFirstName()));
		
		//using parallel stream----> this is basically faster since it divides the collection list in multiple threads.
		personsList.parallelStream()
		.filter(p->p.getLastName().startsWith("S"))
		.forEach(p->System.out.println(p.getFirstName()));
		
		//count the numbers
		long count=personsList.parallelStream()
		.filter(p->p.getLastName().startsWith("S"))
		.count();
		
		System.out.println(count);

	}

}
