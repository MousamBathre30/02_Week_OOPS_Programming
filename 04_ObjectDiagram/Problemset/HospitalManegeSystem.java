import java.util.ArrayList;

// Base class
class Hos {
    public String universityName = "Google";
    ArrayList<String> departments = new ArrayList<>();

    // Constructor to initialize departments
    public University() {
        departments.add("Finance");
        departments.add("Technical");
        departments.add("HR");
    }

    public void addDepartment(String departmentName) {
        departments.add(departmentName);
    }
}

// Subclass representing departments
class Department extends University {
    public int count = 3;
    public String headOfDepartment = "Ramesh";
    ArrayList<String> facuilty = new ArrayList<>();
    ArrayList<String> facuiltyIDs = new ArrayList<>();

    // Constructor to initialize facuilty and IDs
    public Department() {
        facuilty.add("Ramesh");
        facuilty.add("Suresh");
        facuilty.add("Mahesh");

        facuiltyIDs.add("01");
        facuiltyIDs.add("02");
        facuiltyIDs.add("03");
    }

    public void addfacuilty(String facultyName, String facultyID) {
        facuilty.add(facultyName);
        facuiltyIDs.add(facultyID);
        count++;
    }

    public void showFacuilty() {
        System.out.println("facuilty in Department:");
        for (int i = 0; i < facuilty.size(); i++) {
            System.out.println("- " + facuilty.get(i) + " (ID: " + facuiltyIDs.get(i) + ")");
        }
    }
}

// Subclass representing an facuilty
class Faculty extends Department {
    public String facultyName;
    public String facultyID;
    public String department;

    // Constructor for facuilty
    public Faculty(String facultyName, String facultyID, String department) {
        super(); // Call the parent class constructor
        this.facultyName = facultyName;
        this.facultyID = facultyID;
        this.department = department;
    }

    // Method to display facuilty details
    public void display() {
        System.out.println("University: " + University);
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("facuilty ID: " + facultyID);
        System.out.println("Department: " + department);
    }
}

// Main class
public class HospitalManegeSystem{
    public static void main(String[] args) {
        // Create an Facuilty
        Faculty f1 = new Faculty("John Doe", "04", "Technical");

        // Display facuilty details
        f1.display();

        // Add the new facuilty to the department
        f1.addfacuilty("John Doe", "04");

        // Show all employees in the department
        f1.showFacuilty();
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


