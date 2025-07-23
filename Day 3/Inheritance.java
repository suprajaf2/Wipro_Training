package Day3;
public class Inheritance {
class Vechile
	{
		void driving()
		{
			System.out.println("Vechile is Driving");
		}
	}
	class Car extends Vechile
	{
		void cardriving()
		{
			System.out.println("Car is Driving in");
		}
	}
	class Train extends Vechile {
		void traindriving()
		{
			System.out.println("Train is Driving");
		}
	}
	class Bmw extends Car
	{
		void drivingbmw()
		{
			System.out.println("Driving BMW Car which is inherit from car ");
		}
	}
	class Honda extends Car
	{
		void drivinghonda()
		{
			System.out.println("Driving Honda Car which is inherit from car");
		}
	}
	
	public static void main(String[] args) {
		Inheritance I = new Inheritance();
		Car c = I.new Car();
		c.driving();
		Train t =I.new Train();
		t.driving();
		Bmw b = I.new Bmw();
		b.cardriving();
		b.driving();
		b.drivingbmw();
		Honda h = I.new Honda();
		h.cardriving();
		h.driving();
		h.drivinghonda();
		
		
	}

}
