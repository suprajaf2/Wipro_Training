package supraja;
import java.util.Scanner;
public class UserDefinedDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			        Scanner sc = new Scanner(System.in);
			        System.out.print("Enter your name: ");
			        String name = sc.nextLine();//reference data type
			        System.out.print("Enter your score (int): ");
			        int score = sc.nextInt();
			        System.out.print("Enter your height (double): ");
			        double height = sc.nextDouble();
			        System.out.println("\nHello, " + name);
			        System.out.println("Score: " + score);
			        System.out.println("Height: " + height);
			    }
			


	}


