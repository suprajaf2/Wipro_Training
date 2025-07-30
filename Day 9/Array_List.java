package Day9;

import java.util.ArrayList;
public class Array_List {

	public static void main(String[] args) {
		ArrayList <String> all = new ArrayList<>();
		all.add("Supraja");
		all.add("Alice");
		all.add("Bob");
		all.add("john");
		all.add("Buddy");
		for(String obj : all) {
		System.out.println("The elements of arraylist is:" +obj);
		}
		System.out.println(all.get(2));
		System.out.println(all.size());
		System.out.println(all.getFirst());
		System.out.println(all.getLast());
		System.out.println(all.isEmpty());
		System.out.println(all.remove(3));
		System.out.println(all.isEmpty());
		System.out.println(all.removeAll(all));
		
		
	}
	}

