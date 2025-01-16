
public class MobilePhone {
  
   private String brand;
   private String model;
   private int phonePrice;
   
   // Constructor
   MobilePhone(String brand , String model , int phonePrice){
	   this.brand = brand;
	   this.model = model ;
	   this.phonePrice = phonePrice ;
   }
   
   // Method to display book details 
   
   public void display(){
	   System.out.println("brand is  - " + brand);
	   System.out.println("model is : - " + model);
	   System.out.println("phonePrice.. ($)" + phonePrice); 
	   
	   
   }


   public static void main(String args[]){
     // enter the employee manage App.
	 MobilePhone m1 = new MobilePhone("ViVO" , "Y-001" , 90);
	 MobilePhone m2 = new MobilePhone("RealME" , "NarZO-001" , 78);
	 
	 
	 // Print the layout 
	 
	 System.out.println("***************");
	 System.out.println("Enter the MobilePhone App");
	 System.out.println("******* phone-1 ********");
	 m1.display();
	 System.out.println("******* phone-2 ********");
	 m2.display();
	 
	 
   }

}