import java.util.ArrayList;

// Base class
class School {
    public String SchoolName = "Google Education Hub ";
    ArrayList<String> departments = new ArrayList<>();

    // Constructor to initialize departments
    public School() {
        departments.add("Finance");
        departments.add("Technical");
        departments.add("HR");
    }

    public void addDepartment(String departmentName) {
        departments.add(departmentName);
    }
}

// Subclass representing departments
class Courses extends School {
    public int count = 3;
    public String headOfDepartment = "Ramesh";
    ArrayList<String> student = new ArrayList<>();
    ArrayList<String> studentIDs = new ArrayList<>();
    ArrayList<String> course = new ArrayList<>();
    // Constructor to initialize student and IDs
    public Courses() {
        student.add("Ramesh");
        student.add("Suresh");
        student.add("Mahesh");

        studentIDs.add("01");
        studentIDs.add("02");
        studentIDs.add("03");
		
		course.add("ai");
		course.add("ml");
    }

    public void addStudent(String studentName, String studentID) {
        student.add(studentName);
        studentIDs.add(studentID);
        count++;
    }

    public void showStudent() {
        System.out.println("student in Department:");
        for (int i = 0; i < student.size(); i++) {
            System.out.println("- " + employees.get(i) + " (ID: " + employeeIDs.get(i) + ")");
        }
    }
	
	public void showCourse(){
		System.out.println("Show the course");
		for(int i=0; i<course.size(); i++){
			System.out.println("- " + course.get(i) + " ");
		}
	}
}

// Subclass representing an employee
class Student extends Courses {
    public String studentName;
    public String studenIDs;
    public String department;

    // Constructor for Student
    public Student(String studentName, String studenIDs, String department) {
        super(); // Call the parent class constructor
        this.studentName = studentName;
        this.studenIDs = studenIDs;
        this.department = department;
    }

    // Method to display student details
    public void display() {
        System.out.println("SchoolName: " + SchoolName);
        System.out.println("student Name: " + studentName);
        System.out.println("student ID: " + studentIDs);
        System.out.println("Department: " + department);
    }
}

// Main class
public class UniversityManagement {
    public static void main(String[] args) {
        // Create an student
        Student s1 = new Student("John Doe", "04", "Technical");

        // Display student details
        s1.display();

        // Add the new student to the department
        s1.addStudent("John Doe", "04");

        // Show all employees in the department
        s1.showStudent();
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


