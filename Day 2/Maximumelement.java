package day2;
import java.util.*;
public class Maximumelement {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]= sc.nextInt();
		}
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum value: " + max);
    }
}

