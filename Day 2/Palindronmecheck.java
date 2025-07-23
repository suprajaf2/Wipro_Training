package day2;

public class Palindronmecheck {
	    public static void main(String[] args) {
	        String original = "madam";
	        StringBuilder sb = new StringBuilder(original);
	        sb.reverse();

	        if (original.equals(sb.toString())) {
	            System.out.println(original + " is a palindrome.");
	        } else {
	            System.out.println(original + " is not a palindrome.");
	        }
	    }

}
