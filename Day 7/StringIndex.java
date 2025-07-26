package Day7;

public class StringIndex {
	public static void main (String[]args) {
	String name="java";
	try {
		System.out.println(name.charAt(10));
	}
	catch (StringIndexOutOfBoundsException e)
	{
		System.out.println("String index is out of bound: " + e.getMessage());
	}

}
}

