package supraja;

public class Displaymixedvalue {
    public static void main(String[] args) 
    {
    	
    	args = new String[]{"apple", "123"};
        System.out.println("You passed " + args.length + " args.");
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
    

}
