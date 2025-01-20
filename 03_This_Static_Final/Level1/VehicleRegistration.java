
public class VehicleRegistration {
  
   public static int registrationFee = 100;
   public static int updateRegistrationfee(){
	   registrationFee -= 10;
	   return registrationFee;
   }
   
   private String ownerName;
   private String vehicaleType;
   protected final String registrationNumber;
   

   
   // Constructor
   VehicleRegistration(String ownerName , String vehicaleType , String registrationNumber){
	   this.ownerName = ownerName;
	   this.vehicaleType = vehicaleType ;
	   this.registrationNumber = registrationNumber ;
	   
   }
   
   // Method to display employee details 
   
   public void display(){
	   System.out.println("ownerName  is " + ownerName);
	   System.out.println("vehicaleType - " + vehicaleType);
	   System.out.println("registrationFee : - " + registrationFee);
	   System.out.println("updated fee after discount  " + updateRegistrationfee() );

	   System.out.println("registrationNumber.." + registrationNumber);
	   
	   
   }

   public static void main(String args[]){
     // enter the employee manage App.
	 VehicleRegistration c1 = new VehicleRegistration("mousam" , "SUV" , "001");
	 VehicleRegistration c2 = new VehicleRegistration("goutam" , "BMW" , "002");
	 
	 
	 
	 if(c1 instanceof VehicleRegistration){
		 System.out.println("Given object is instance of CartSystem");
	 }
	 // Print the layout 
	 
	 System.out.println("***************");
	 System.out.println("Enter the cart App");
	 System.out.println("******* product-1 ********");
	 c1.display();
	 System.out.println("******* product-2 ********");
	 c2.display();
	
	 
   }

}