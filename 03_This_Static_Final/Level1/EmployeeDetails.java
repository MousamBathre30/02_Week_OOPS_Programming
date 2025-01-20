
public class EmployeeDetails {
  
   public static String companyName="Google";
   private String employeename;
   public final String employeeID;
   private String designation;
   static int count=0;
   
   
   
   public static void  displayTotalEmployees(){
	   count++;
       System.out.println("The total employeee is ");	   
   }
   // Constructor
   EmployeeDetails(String employeename , String employeeID , String designation){
	   this.employeename = employeename;
	   this.employeeID = employeeID ;
	   this.designation = designation ;
	   displayTotalEmployees();
   }
   
   // Method to display employee details 
   
   public void display(){
	   System.out.println("Company name is " + companyName);
	   System.out.println("Employee Name - " + employeename);
	   System.out.println("Employee id : - " + employeeID);
	   System.out.println("designation.." + designation);
	   
	   
   }

   public static void main(String args[]){
     // enter the employee manage App.
	 EmployeeDetails e1 = new EmployeeDetails("Mousam Bathre" , "0191AL211090" , "SoftwareDeveloper");
	 EmployeeDetails e2 = new EmployeeDetails("SALMAN KHAN " , "0191AL211028" , "intern");
	 
	 
	 // Print the layout 
	 
	 System.out.println("***************");
	 System.out.println("Enter the Employee App");
	 System.out.println("******* employee-1 ********");
	 e1.display();
	 System.out.println("******* employee-2 ********");
	 e2.display();
	 
	 
   }

}