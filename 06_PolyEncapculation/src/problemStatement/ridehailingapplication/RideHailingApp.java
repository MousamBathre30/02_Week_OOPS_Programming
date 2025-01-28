package problemStatement.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

// Main Class
public class RideHailingApp {
    // Method to calculate fares dynamically
    public static void calculateFares(List<Vehicle> vehicles, double distance) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
            if (vehicle instanceof GPS) {
                GPS gpsVehicle = (GPS) vehicle;
                System.out.println("Current Location: " + gpsVehicle.getCurrentLocation());
            }
            System.out.println("-----------");
        }
    }

    public static void main(String[] args) {
        // Create different vehicles
        Vehicle car = new Car("CAR123", "Alice", 15, "Downtown");
        Vehicle bike = new Bike("BIKE456", "Bob", 8, "City Center");
        Vehicle auto = new Auto("AUTO789", "Charlie", 10, "Old Town");

        // Add vehicles to a list
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Calculate fares for 10 km distance
        calculateFares(vehicles, 10);

        // Update locations
        ((GPS) car).updateLocation("Airport");
        ((GPS) bike).updateLocation("Central Park");
        ((GPS) auto).updateLocation("Marketplace");

        // Recalculate fares with updated locations
        System.out.println("After updating locations:");
        calculateFares(vehicles, 5);
    }
}
