package day8;

class B1 implements Runnable
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
class B2 implements Runnable
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

public class MultiThreading2 {

	public static void main(String[] args) {
		Runnable b1 = new B1();
		Runnable b2 = new B2();
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b2);
		t1.start();
		t2.start();
		

}
}
