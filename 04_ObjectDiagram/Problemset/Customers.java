import java.util.ArrayList;

// Base class
class Hospital {
    public String hospitalname = "Google";
    ArrayList<String> departments = new ArrayList<>();
    ArrayList<String> doctors = new ArrayList<>();
    // Constructor to initialize departments
    public Hospital() {
        departments.add("NuroScience");
        departments.add("Eyes");
        departments.add("fitness");
		
		doctors.add("D-01");
		doctors.add("D-02");
		doctors.add("D-03");
    }

    public void addDepartment(String departmentName) {
        departments.add(departmentName);
    }
}

// Subclass representing departments
class Doctor extends Hospital{
    public int count = 3;
    public String headOfDepartment = "Ramesh";
    ArrayList<String> patient = new ArrayList<>();
    ArrayList<String> patientid = new ArrayList<>();

    // Constructor to initialize facuilty and IDs
    public Department() {
        patient.add("Ramesh");
        patient.add("Suresh");
        patient.add("Mahesh");

        patientid.add("01");
        patientid.add("02");
        patientid.add("03");
    }

    public void addPatient(String patientName, String patientID) {
        patient.add(patientName);
        patientid.add(patientID);
        count++;
    }
	
	public void consultatient(){
		System.out.println("The patient get the consultant");
	}

    public void showPatient() {
        System.out.println("Patient in Department:");
        for (int i = 0; i < patient.size(); i++) {
            System.out.println("- " + patient.get(i) + " (ID: " + patientid.get(i) + ")");
        }
    }
}

// Subclass representing an patient
class Patient extends Doctor {
    public String patientName;
    public String patientID;
    public String department;

    // Constructor for patient
    public Patient(String patientName, String patientID, String department) {
        super(); // Call the parent class constructor
        this.patientName = patientName;
        this.patientID = patientID;
        this.department = department;
    }

    // Method to display facuilty details
    public void display() {
        System.out.println("Hospital: " + hospitalname);
        System.out.println("patient Name: " + patientName);
        System.out.println("facuilty ID: " + patientID);
        System.out.println("Department: " + department);
    }
}

// Main class
public class Customers{
    public static void main(String[] args) {
        // Create an patient
        Faculty f1 = new Faculty("John Doe", "04", "Basic");

        // Display patient details
        f1.display();

        // Add the new patient to the department
        f1.addPatient\("John Doe", "04");

        // Show all patient in the department
        f1.showPatient();
    }
}

/*
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


