// Base class: Employee
public class Employee {
    // Public member
    public int employeeID;

    // Protected member
    protected String department;

    // Private member
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify the salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    private String managedTeam; // Additional property for Manager

    // Constructor
    public Manager(int employeeID, String department, double salary, String managedTeam) {
        super(employeeID, department, salary); // Call superclass constructor
        this.managedTeam = managedTeam;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        // Accessing public member
        System.out.println("Employee ID: " + employeeID);
        // Accessing protected member
        System.out.println("Department: " + department);
        System.out.println("Managed Team: " + managedTeam);
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(101, "IT", 5000.0);
        emp.displayEmployeeDetails();

        System.out.println();

        // Modify salary using public method
        emp.setSalary(6000.0);
        System.out.println("Updated Salary: $" + emp.getSalary());

        System.out.println();

        // Create a Manager object
        Manager mgr = new Manager(201, "HR", 8000.0, "Recruitment");
        mgr.displayEmployeeDetails();
        mgr.displayManagerDetails();
    }
}
