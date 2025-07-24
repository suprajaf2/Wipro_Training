package day5;
	import java.util.Arrays;
	import java.util.Scanner;

	interface Sorter {
	    void sortAndDisplay();
	}

	class NameSortingApp implements Sorter {
	    public void sortAndDisplay() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the total count : ");
	        int n = sc.nextInt();
	        String[] names = new String[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter the person " + (i + 1) + " name :");
	            names[i] = sc.next();
	        }

	        Arrays.sort(names);

	        System.out.println("Sorted names:");
	        for (String str : names) {
	            System.out.println(str);
	        }
	    }
	}

	public class NameSorter {
	    public static void main(String[] args) {
	        NameSortingApp s = new NameSortingApp();  // Polymorphism
	        s.sortAndDisplay();
	    }
	}
