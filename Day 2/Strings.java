package day2;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Supraja";
System.out.println(name.length());
System.out.println(name.toUpperCase());
System.out.println(name.contains("Su"));
System.out.println(name.substring(2,5));
//Comparing Strings

String s1 = "Hello";
String s2 = "Hello";
String s3 = new String("Hello");

System.out.println("s1 == s2: " + (s1 == s2));       // true (same object in string pool)
System.out.println("s1 == s3: " + (s1 == s3));       // false (different object)
System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (compares value)
}

	}

