package Day7;

public class ArrayException {
public static void main(String[]args)
{
	
	int arr[]= {1,2,3,4,5};
	try {
		System.out.println("aceesing the array element" +arr[6]);
	}
	catch (Exception e)
	{
		System.out.println("Array index out ofsize"+e.getMessage());
		throw e;
	}
	finally {
		System.out.println("accessing elements is done");
	}
}
}
