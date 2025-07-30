package Day9;

import java.util.Vector;

public class List_vector {
	public static void main(String[] args) {
		        Vector<String> vector = new Vector<>();

		        vector.add("Apple");
		        vector.add("Banana");
		        vector.add("Mango");
		        System.out.println(vector);
		        vector.add(1, "Orange");
		        System.out.println("Vector: " + vector);
		        System.out.println("Element at index 2: " + vector.get(2));
		        vector.set(2, "Grapes");
		        System.out.println("After set: " + vector);

		        System.out.println("Iterating over vector:");
		        for (String item : vector) {
		            System.out.println(item);
		        }
		    }
		}
