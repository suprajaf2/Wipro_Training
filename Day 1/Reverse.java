package supraja;
import java.util.*;
public class Reverse {

	static int reverse(int N)
	{
		
		int sum=0;
		int rem;
		while(N>0) {
			rem=N%10;
		sum=(sum*10)+rem;
		N=N/10;
		
	}
	return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the N value");
Scanner sc = new Scanner(System.in);
int N =sc.nextInt();
System.out.println(reverse(N));

	}

}
