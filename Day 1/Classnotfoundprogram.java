package supraja;

public class Classnotfoundprogram {
	public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
    	Classnotfoundprogram c = new Classnotfoundprogram();
        int sum = c.add(3, 4);
        System.out.println("Sum = " + sum);
    }
}


