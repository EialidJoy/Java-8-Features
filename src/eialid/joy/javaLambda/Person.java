package eialid.joy.javaLambda;

public class Person {
	private String FirstName;
	private String LastName;
	private int Age;
	
	public Person(String firstName, String lastName, int i) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Age = i;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Person [FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age + "]";
	}
	
	

}
