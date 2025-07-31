package Day11;

import java.util.ArrayList;

public class JavaCollections {

	class Departement {
		private String name;
		private double sales;
		private double expense;
		public Departement(String name,double sales,double expense)
		{
			this.name=name;
			this.sales=sales;
			this.expense=expense;
			
		}
		public double getprofit()
		{
			return sales-expense;
		}
		public String getname()
		{
			return name;
		}
	}
	public static void main(String[] args) {
		ArrayList<Departement> depart = new ArrayList<>();
		depart.add(new JavaCollections().new Departement("Sales",20000,15000));
		depart.add(new JavaCollections().new Departement("Marketing",29000,19000));
		depart.add(new JavaCollections().new Departement("Reserach",25000,15000));
		for(Departement d : depart)
		{
		 System.out.println(d.getname() + "Profit: " + d.getprofit());
		}
		
		depart.sort((d1, d2) -> Double.compare(d1.getprofit(), d2.getprofit()));
		
		System.out.println("Sorting Done");
		
		for(Departement d : depart)
		{
		 System.out.println(d.getname() + "Profit: " + d.getprofit());
		}
	}


	}

