package Day9;

import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("List: " + list);

        System.out.println("Element at index 1: " + list.get(1));
        
        list.set(2, "Orange");
        System.out.println("After set: " + list);

        list.remove("Banana");
        System.out.println("After remove: " + list);

        System.out.println("Size: " + list.size());

        System.out.println("Contains 'Apple'? " + list.contains("Apple"));
    }
}
