package day6;

class BikeRental implements VehicleRental {
    @Override
    public void rentVehicle(String customerName, int days) {
        if (VehicleRental.isAvailable(true)) {
            System.out.println("Bike rented to " + customerName + " for " + days + " days.");
        } else {
            System.out.println("Bike not available.");
        }
    }

    // Custom rental terms
    @Override
    public void showRentalTerms() {
        System.out.println("Rental Terms for Bikes: Helmet mandatory, full fuel tank return.");
    }
}
