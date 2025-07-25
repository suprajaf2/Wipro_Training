package day6;

interface VehicleRental {

    // Abstract method
    void rentVehicle(String customerName, int days);

    // Default method: common rental terms
    default void showRentalTerms() {
        System.out.println("Rental Terms: Valid license required, security deposit applicable.");
    }

    // Static method: utility for availability
    static boolean isAvailable(boolean available) {
        return available;
    }
}
