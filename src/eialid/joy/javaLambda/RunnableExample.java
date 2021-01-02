package eialid.joy.javaLambda;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread myThread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello from runnable");
				
			}
		});
		
		myThread.run();
		
		//same thing by lambda
		
		Thread myLambdaThread=new Thread(()-> System.out.println("hello from runnable"));
		
		myLambdaThread.run();

	}

}
