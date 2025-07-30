package Day9;

public class Wrapper1 {

	public static void main(String[] args) {
		String s = "1234";
		int i =Integer.parseInt(s); //coverting  string into int using ParseInt
		System.out.println(i);
		String d= "45.68";
		double j = Double.parseDouble(d);
		System.out.println(j);
		String f ="5.7";
		float k = Float.parseFloat(f);
		System.out.println(k);
		char c ='s';
		Character ch =c;
		System.out.println(Character.isDigit(ch));
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.toUpperCase(ch));
		
		

	}
}
