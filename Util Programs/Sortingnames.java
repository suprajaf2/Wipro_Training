package utilprograms;
import java.util.ArrayList;
import java.util.Collections;
public class Sortingnames {
	public static void main(String[]args)
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Supraja");
		names.add("John");
		names.add("Alie");
		names.add("Bob");
		System.out.println("Before sorting "+names);
	Collections.sort(names);
	System.out.println("The sorted array names is:" + names);
	}
}

