package Day7;

public class AllInOneExceptions {
    
    // Custom method to demonstrate IllegalArgumentException
    static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {

        // 1. NullPointerException
        try {
            String name = null;
            System.out.println("Name length: " + name.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Element: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 3. StringIndexOutOfBoundsException
        try {
            String text = "Java";
            System.out.println("Character: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }

        // 4. NumberFormatException
        try {
            String numStr = "abc123";
            int number = Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        // 5. IllegalArgumentException
        try {
            validateAge(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        // 6. ClassNotFoundException
        try {
            Class.forName("com.unknown.MyClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }

        // Final message
        System.out.println("Program executed with all exceptions handled.");
    }
}