package day5;

public class TypeCasting {
	
	
    public static void main(String[] args) {
        // Initializing the variables
        int intValue = 10;
        double doubleValue = 99.99;
        // Converting int to float
        float floatValue = (float) intValue;
        // Converting double to int
        int intFromDouble = (int) doubleValue;
        // Printing the results
        System.out.println("int value: " + intValue);
        System.out.println("float value after conversion: " + floatValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("int value after converting from double: " + intFromDouble);
    }
}
