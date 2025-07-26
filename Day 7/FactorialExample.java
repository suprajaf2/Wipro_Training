package Day7;
import java.util.Scanner;

	public class FactorialExample {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter a positive integer: ");
	            int number = scanner.nextInt();

	            if (number < 0) {
	                throw new IllegalArgumentException("Number must be non-negative.");
	            }

	            long fact = 1;
	            for (int i = 1; i <= number; i++) {
	                fact *= i;
	            }

	            System.out.println("Factorial of " + number + " is: " + fact);
	        } 
	         catch (Exception e) {
	            System.out.println("Something went wrong: " + e.getMessage());
	        } finally {
	            System.out.println("Execution completed.");
	            scanner.close();
	        }
	    }
	}

