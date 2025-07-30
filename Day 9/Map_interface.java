package Day9;
	import java.util.HashMap;
	import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.TreeMap;

	public class Map_interface {
	    public static void main(String[] args) {
	        String[] names = {"Alice", "Bob", "Charlie", "Alice"};
	        int[] marks = {85, 92, 78,90};  // last "Alice" will overwrite the first one

	        // 1. HashMap (no order) (null values allowed,only one null key)
	        Map<String, Integer> hashMap = new HashMap<>();
	        // 2. LinkedHashMap (insertion order) (null values allowed,only one null key)
	        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
	        // 3. TreeMap (sorted by key) allow null values and no null keys
	        Map<String, Integer> treeMap = new TreeMap<>();

	        
	        for (int i = 0; i < names.length; i++) {
	            hashMap.put(names[i], marks[i]);
	            linkedHashMap.put(names[i], marks[i]);
	            treeMap.put(names[i], marks[i]);
	        }

	        System.out.println("HashMap (No Order): " + hashMap);
	        System.out.println("LinkedHashMap (Insertion Order): " + linkedHashMap);
	        System.out.println("TreeMap (Sorted by Key): " + treeMap);
	    }
	}
