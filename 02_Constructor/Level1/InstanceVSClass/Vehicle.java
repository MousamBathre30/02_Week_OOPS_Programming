public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;
    
    // Class variable (shared across all vehicles)
    private static double registrationFee = 500.00;
    
    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    
    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }
    
    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Update the registration fee using the class method
        Vehicle.updateRegistrationFee(600.00);
        
        // Creating vehicle instances
        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle");
        
        // Display details of each vehicle
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}
