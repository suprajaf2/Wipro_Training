package Day3;

public class Overloading {

	class  Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double a , double b)
	{
		return a=b;
	}
}
	public static void main(String[] args) {
		Overloading o = new Overloading();
		Calculator c = o.new Calculator();
		System.out.println(c.add(2,5));
		System.out.println(c.add(2.0,5.0));
		

	}

}
