package utilprograms;
import java.util.Calendar;
public class Calenderexample {
	
	    public static void main(String[] args) {
	        // Create a Calendar object representing the current date and time
	        Calendar calendar = Calendar.getInstance();
	       
	        // Print the current date and time
	        System.out.println("Current Date and Time: " + calendar.getTime());
	        // Set a specific date (e.g., January 15, 2025)
	        calendar.set(Calendar.YEAR, 2025);
	        calendar.set(Calendar.MONTH, Calendar.APRIL);  // Note: Months are 0-based (0 = January)
	        calendar.set(Calendar.DAY_OF_MONTH, 16);
	        System.out.println("Specific Date (April 16, 2025): " + calendar.getTime());
	        // Add 10 days to the current date
	        calendar.add(Calendar.DAY_OF_MONTH, 10);
	        System.out.println("Date after adding 10 days: " + calendar.getTime());
	        // Subtract 1 month from the current date
	        calendar.add(Calendar.MONTH, -1);
	        System.out.println("Date after subtracting 1 month: " + calendar.getTime());
	    }
	}
