package day8;

class A1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++) {
			System.out.println("This is Supraja");
			try 
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
	}
}
}
}
class A2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("This is a new program");
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
					e.printStackTrace();
				}
			}
		}
	}

public class Mutiplethreading {

	public static void main(String[] args) {
		A1 a1 = new A1();
		A2 a2 = new A2();
		//System.out.println(a2.getPriority());
		//a2.setPriority(Thread.MAX_PRIORITY);
		a1.start();
		try
		{
			Thread.sleep(5);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		a2.start();

	}

}
