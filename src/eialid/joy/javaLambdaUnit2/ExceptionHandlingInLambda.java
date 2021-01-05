package eialid.joy.javaLambdaUnit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingInLambda {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6};
		int key=0;
		
		arithmeticCalculation(a,key, (i,k)-> {
			try {
				System.out.println(i/k);
			}
			catch(ArithmeticException e) {
				System.out.println("Voila!!! we got an exception");
			}
			
		});		

	}

	private static void arithmeticCalculation(int[] a, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i: a) {
			consumer.accept(i, key);
		}
		
	}

}
