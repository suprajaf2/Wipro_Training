package day6;

public class RentalApp {
    public static void main(String[] args) {
        VehicleRental car = new CarRental();
        VehicleRental bike = new BikeRental();

        // Car rental
        car.rentVehicle("Alice", 3);
        car.showRentalTerms();

        System.out.println();

        // Bike rental
        bike.rentVehicle("Bob", 2);
        bike.showRentalTerms();
    }
}
