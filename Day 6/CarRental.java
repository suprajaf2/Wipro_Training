package day6;

class CarRental implements VehicleRental {
    @Override
    public void rentVehicle(String customerName, int days) {
        if (VehicleRental.isAvailable(true)) {
            System.out.println("Car rented to " + customerName + " for " + days + " days.");
        } else {
            System.out.println("Car not available.");
        }
    }

    // Uses default showRentalTerms() from interface
}
