package supraja;
import java.util.*;
public class Factorial {

		// TODO Auto-generated method stub
        
        static int fact(int n) {
            return (n <= 1) ? 1 : n * fact(n - 1);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            System.out.println("Factorial: " + fact(num));
        }
    

	}


