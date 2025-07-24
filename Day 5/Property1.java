package day5;
 class Rent
 {
	 double rent;
	 double expenses;
	 double electricity;
	 
	 public void Rent_money(int rent, int expenses)
	 {
	 this.rent=rent;
	 this.expenses=expenses;
	 System.out.println("Rent is " +rent);
	 System.out.println("expenses is " +expenses);
	 System.out.println("Total is "+ (rent+expenses));
	  
 }
	 public void Rent_money(double rent,double electricity)
	 {
	 this.rent=rent;
	 this.electricity=electricity;
	 System.out.println("Rent is " +rent);
	 System.out.println("electricity is " +electricity);
	 System.out.println("Total is "+ (rent+electricity));
	 }
 }

public class Property1 {
	public static void main(String[] args) {
		Rent r = new Rent();
		r.Rent_money(15000, 20000);
		r.Rent_money(20000,30000.0);

	}

}
