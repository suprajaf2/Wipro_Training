package day5;

abstract class Vehicle1 {
    abstract void speed();  
    abstract void brand();  
}

class Car extends Vehicle1 {
    void speed() {
        System.out.println("Speed of car is 4km");
    }

    void brand() {
        System.out.println("Cars brand is Audi");
    }
}
class Bike extends Vehicle1
{
	void speed()
	{
		System.out.println("speed of bike is 2km");
	}
	void brand()
	{
		System.out.println("Brand of bike is Honda");
	}
}

public class Vehicle {
    public static void main(String[] args) {
        Vehicle1 v = new Car(); 
        Vehicle1 v1 = new Bike();
        v.brand();
        v.speed();
        v1.brand();
        v1.speed();
        
    }
}

