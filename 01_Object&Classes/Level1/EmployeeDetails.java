
public class EmployeeDetails {
  
   private String employeename;
   private String employeeID;
   private String employeeSalary;
   
   // Constructor
   EmployeeDetails(String employeename , String employeeID , String employeeSalary){
	   this.employeename = employeename;
	   this.employeeID = employeeID ;
	   this.employeeSalary = employeeSalary ;
   }
   
   // Method to display employee details 
   
   public void display(){
	   System.out.println(" Employee Name " + employeename);
	   System.out.println("Employee id" + employeeID);
	   System.out.println("Employee Salary..");
	   
	   
   }
   

   public static void main(String args[]){
     // enter the employee manage App.
	 EmployeeDetails e1 = new EmployeeDetails("Mousam Bathre" , "0191AL211090" , "100$");
	 EmployeeDetails e2 = new EmployeeDetails("SALMAN KHAN " , "0191AL211028" , "1000$");
	 
	 
	 // Print the layout 
	 
	 System.out.println("***************");
	 System.out.println("Enter the Employee App");
	 System.out.println("******* employee-1 ********");
	 e1.display();
	 System.out.println("******* employee-2 ********");
	 e2.display();
	 
	 
   }

}