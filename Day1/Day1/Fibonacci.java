package supraja;
import java.util.*;
public class Fibonacci {
	static void fibonacciseries(int N)
	{
		int firstterm =0, secondterm=1;
		for(int i=0;i<N;i++)
		{
			System.out.println(firstterm + "");
		int thirdterm = firstterm + secondterm;
		firstterm=secondterm;
		secondterm=thirdterm;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter N value");
		int N =sc.nextInt();
        fibonacciseries(N);

	}

}
