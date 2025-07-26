package Day7;

public class Division {

public static void main(String[]args)
{
	try
	{
		int divisionbyzero = 60/2;
		System.out.println("result " + divisionbyzero);
	}
	catch (Exception e)
	{
		System.out.println("ArithmeticException : "+e.getMessage());
		throw e;
	}
	finally {
		System.out.println("Calcuation operation is done");
	}
}
}