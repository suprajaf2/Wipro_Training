package Day9;

public class Wrapper {
	public static void main(String[] args) {
		int a=12;
		Integer i = a; // when we convert int datatype to integer is called auto boxing.
		//int b = i.intValue(); //object back to int datatype is called auto unboxing.
		int b = i;
		System.out.println(b);
	}
}
