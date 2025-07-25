package day6;
interface calculator
{
	double operation(double a,double b);
	default double subtract(double a, double b)
	{
		return a-b;
	}
	static double multiplication(double a, double b) {
		return a*b;
	}
}
class InterfaceCalulator implements calculator {
	public double operation(double a, double b) {
		return a+b;
	}

}
