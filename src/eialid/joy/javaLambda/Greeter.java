package eialid.joy.javaLambda;

public class Greeter {
	
	public void greet(Greeting greeting) {
			greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter=new Greeter();
		
		//creating implemented class instance to invoke greet method
		HelloWorldGreeter helloWorldGreeter=new HelloWorldGreeter();
		//greeter.greet(helloWorldGreeter);
		
		// using lambda expression to invoke greet method
		Greeting myLambda=() -> System.out.println("hello this is eialid");
		greeter.greet(myLambda);
		
		// invoking greet method through a innerclass implementaton of the greeting interface.
		Greeting innerClassInstance =new Greeting() {
			public void perform() {
				System.out.println("Hello from inner class");
			}
		};
		greeter.greet(innerClassInstance);
	}

}

