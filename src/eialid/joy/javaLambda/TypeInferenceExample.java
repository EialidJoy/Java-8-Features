package eialid.joy.javaLambda;

public class TypeInferenceExample {

	public static void main(String[] args) {
		StringLength stringLength=s->s.length();
		printStringLength(stringLength);
		//System.out.println(stringLength.getLength("I am Eialid"));
	}
	
	public static void printStringLength(StringLength s) {
		System.out.println(s.getLength("I am EIalid"));
	}
	
	interface StringLength {
		int getLength(String s);
	}

}
