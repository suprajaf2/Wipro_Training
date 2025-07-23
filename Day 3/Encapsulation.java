package Day3;

class Carmodel
{
	private String model;
	
	private int year;
	
	public void setmodel(String model,int year)
	{
		this.model=model;
		this.year=year;	
	}
	public String getmodel()
	{
		return model;
	}
	public int getyear()
	{
		return year;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Carmodel c = new Carmodel();
		c.setmodel("Venue", 2002);
		System.out.println(c.getmodel());
		System.out.println(c.getyear());	

	}
}
