package Day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	String name;
	int num;
	Employee(String name, int num){
		this.name=name;
		this.num=num;
	}
}
class Serializationdemo {
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Supraja", 458);
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\M.SUPRAJA\\Desktop\\hello.txt");
	        ObjectOutputStream out = new ObjectOutputStream(fout);
	        out.writeObject(e1);
	        out.close();
	        fout.close();
	        System.out.println("Successs");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		}
	
}