package Day9;
	import java.util.HashSet;
	import java.util.LinkedHashSet;
	import java.util.TreeSet;
	import java.util.Set;

	public class Set_Interface {
	    public static void main(String[] args) {
	        
	        String[] items = {"Banana", "Apple", "Mango", "Apple", "Orange", "Banana"};

	        // 1. HashSet (no order, no duplicates)  one allow null
	        Set<String> hashSet = new HashSet<>();
	        for (String item : items) {
	            hashSet.add(item);
	        }
	        System.out.println("HashSet (No Order): " + hashSet);

	        // 2. LinkedHashSet (insertion order, no duplicates)  one allow null
	        Set<String> linkedHashSet = new LinkedHashSet<>();
	        for (String item : items) {
	            linkedHashSet.add(item);
	        }
	        System.out.println("LinkedHashSet (Insertion Order): " + linkedHashSet);

	        // 3. TreeSet (sorted order, no duplicates) not allow null
	        Set<String> treeSet = new TreeSet<>();
	        for (String item : items) {
	            treeSet.add(item);
	        }
	        System.out.println("TreeSet (Sorted Order): " + treeSet);
	    }
	}
