package day5;
import java.util.Scanner;

interface RentCalculator {
    void tax(double rent);
}

public class RealEstateSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your category (Apartment/House): ");
        String category = sc.next();

        RentCalculator rc;

        // Using lambda expressions
        if (category.equalsIgnoreCase("Apartment")) {
            rc = (r1) -> {
                double t = 10 * r1 / 100;
                double r2 = t + r1;
                System.out.println("Tax for Apartment (10% of " + r1 + "): " + t);
                System.out.println("Final Apartment Rent: " + r2);
            };
        } else if (category.equalsIgnoreCase("House")) {
            rc = (r1) -> {
                double t = 20 * r1 / 100;
                double r2 = t + r1;
                System.out.println("Tax for House (20% of " + r1 + "): " + t);
                System.out.println("Final House Rent: " + r2);
            };
        } else {
            System.out.println("Invalid category entered.");
            sc.close();
            return;
        }

     // Only ask for rent if the category is valid
        System.out.print("Enter base rent amount: ");
        double rent = sc.nextDouble();

        rc.tax(rent);
        sc.close();
    }
}
