package day5;
interface Computer1
{
	  void slow();
	  void fast();
}

class Desktop implements Computer1
{
	public void slow()
	{
		System.out.println("Desktop is not slow");
	}
	 public void fast()
	{
		System.out.println("Desktop is fast");
	}
}
class Laptop implements Computer1
{
	public void slow()
	{
		System.out.println("Laptop is slow");
	}
	 public void fast()
	{
		System.out.println("Laptop is not fast");
	}
}
public class Computer {

	public static void main(String[] args) {
		
Computer1  c1 = new Desktop();
c1.fast();
c1.slow();
Computer1 c2 = new Laptop();
c2.fast();
c2.slow();
	}

}
