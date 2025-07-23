package day2;

public class String2 {
	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("Welcome");

    sb.append(" to Java");
    sb.insert(8, "All ");
    sb.delete(0, 8);

    System.out.println("Result: " + sb);

}
}

