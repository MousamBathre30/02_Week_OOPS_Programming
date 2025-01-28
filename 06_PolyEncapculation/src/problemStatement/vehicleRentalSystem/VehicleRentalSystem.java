package problemStatement.vehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

// Main Class
public class VehicleRentalSystem {
    // Method to calculate and print rental and insurance costs
    public static void processVehicles(List<Vehicle> vehicles, int rentalDays) {
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println(vehicle);
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }
            System.out.println("-----------");
        }
    }

    public static void main(String[] args) {
        // Create vehicles
        Vehicle car = new Car("CAR123", "Sedan", 1000, "CARINS123");
        Vehicle bike = new Bike("BIKE123", "Sports Bike", 500);
        Vehicle truck = new Truck("TRUCK123", "Heavy Truck", 2000, "TRUCKINS456");

        // Add vehicles to a list
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Process vehicles for 5 rental days
        processVehicles(vehicles, 5);
    }
}
