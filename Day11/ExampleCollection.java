package Day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExampleCollection {

	public static void main(String[] args) {
		ArrayList <Integer> a1 = new ArrayList<>(Arrays.asList(55,66,77,88));
		a1.add(10);
		a1.add(12);
		a1.add(22);
		a1.add(33);
		a1.add(44);
		System.out.println(a1);
		System.out.println(a1.hashCode());
		System.out.println(a1.isEmpty());
		System.out.println(a1.lastIndexOf(a1));
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		System.out.println(a1.subList(2, 5));
		System.out.println(a1.get(0));
		Collections.swap(a1, 2, 1);
		System.out.println(a1);
	
		
	}

		
		
		
	}


