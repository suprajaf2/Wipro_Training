package day5;

abstract class Realestate
{
	abstract void home();
	abstract void apartement();
		
}
class Varadhi extends Realestate
{
	void home() {
	int food=10000;
	double rent=15000;
	int expensives= 20000;
	double totoal = (double)(food+rent+expensives);
	System.out.println(" The totoal cost of varadhi home is :" + totoal);
	}
	void apartement()
	{
			int food=12000;
			double rent=13000;
			int expensives= 22000;
			double totoal = (double)(food+rent+expensives);
			System.out.println(" The totoal cost of varadhi Apartment is :" + totoal);
	}
}
class Supraja extends Realestate
{
	void home() {
		int food=15000;
		double rent=17000;
		int expensives= 21000;
		double totoal = (double)(food+rent+expensives);
		System.out.println(" The totoal cost of supraja home is :" + totoal);
}
	void apartement()
	{
			int food=13000;
			double rent=11000;
			int expensives= 19000;
			double totoal = (double)(food+rent+expensives);
			System.out.println(" The totoal cost of supraja Apartment is :" + totoal);
	}
}
	
public class Property {

	public static void main(String[] args) {
		Realestate r =  new Varadhi();
		Realestate r1 = new Supraja();
		r.home();
		r.apartement();
		r1.home();
		r1.apartement();
		
		
	}

}
