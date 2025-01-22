import java.util.ArrayList;

// Base class
class Company {
    public String companyName = "Google";
    ArrayList<String> departments = new ArrayList<>();

    // Constructor to initialize departments
    public Company() {
        departments.add("Finance");
        departments.add("Technical");
        departments.add("HR");
    }

    public void addDepartment(String departmentName) {
        departments.add(departmentName);
    }
}

// Subclass representing departments
class Department extends Company {
    public int count = 3;
    public String headOfDepartment = "Ramesh";
    ArrayList<String> employees = new ArrayList<>();
    ArrayList<String> employeeIDs = new ArrayList<>();

    // Constructor to initialize employees and IDs
    public Department() {
        employees.add("Ramesh");
        employees.add("Suresh");
        employees.add("Mahesh");

        employeeIDs.add("01");
        employeeIDs.add("02");
        employeeIDs.add("03");
    }

    public void addEmployee(String employeeName, String employeeID) {
        employees.add(employeeName);
        employeeIDs.add(employeeID);
        count++;
    }

    public void showEmployees() {
        System.out.println("Employees in Department:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("- " + employees.get(i) + " (ID: " + employeeIDs.get(i) + ")");
        }
    }
}

// Subclass representing an employee
class Employee extends Department {
    public String employeeName;
    public String employeeID;
    public String department;

    // Constructor for Employee
    public Employee(String employeeName, String employeeID, String department) {
        super(); // Call the parent class constructor
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.department = department;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

// Main class
public class Main2 {
    public static void main(String[] args) {
        // Create an Employee
        Employee e1 = new Employee("John Doe", "04", "Technical");

        // Display employee details
        e1.display();

        // Add the new employee to the department
        e1.addEmployee("John Doe", "04");

        // Show all employees in the department
        e1.showEmployees();
    }
}

*
   Creating object for the class library 
   1. lib one 
   that define the book details 
    LibrarySystem lib-Book1 = new LibrarySystem("Eat that frog" , "Author" , 23 , 2);
	--> Object Name -: lib-Book1
	--> Represents -: a Specific book that has the name "Eat that Frog" , and 
	                  And the author name ("Author" , with price and availability);
*/

/*
   OutPut
   Order:-1
****************************************
Welcome to the World of Book..
Author..Name   Author
Price...  23
****************************************
Want to borrow the Book
Enter Y/N
N
Thank You Vist..Again
 
*/

/*
  --> Explanation 
  *class -- Library can have some subclasses 
            --Library  
			    -- Books
  *Object -- Library have Specific Book , Student as a object.
            each book represent the different name , author and date of publication.

*/


