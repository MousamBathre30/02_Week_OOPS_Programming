
public class Patient {
  
   public static String hospitalName = "Aiims";
   static int count=0;
   public static int getTotalPatient(){
	   count+=1;
	   return count;
   }
   
   private String patientName;
   private int age;
   private String ailment ;
   
   // Constructor
   Patient(String patientName , int age , String ailment){
	   this.patientName = patientName;
	   this.age = age ;
	   this.ailment = ailment ;
	   getTotalPatient();
   }
   
   // Method to display employee details 
   
   public void display(){
	   System.out.println("Hospital Name " + hospitalName);
	   System.out.println("patientName  is " + patientName);
	   System.out.println("age is - " + age);
	   System.out.println("ailment : - " + ailment);
	   System.out.println("total patient  " + getTotalPatient() );
	   
	   
   }

   public static void main(String args[]){
     // enter the employee manage App.
	 Patient c1 = new Patient("nagam" , 12 , "dd");
	 Patient c2 = new Patient("sigam" , 19 , "ff");
	 
	 
	 
	 if(c1 instanceof Patient){
		 System.out.println("Given object is instance of CartSystem");
	 }
	 // Print the layout 
	 
	 System.out.println("***************");
	 System.out.println("Enter the patient App");
	 System.out.println("******* Patient-1 ********");
	 c1.display();
	 System.out.println("******* Patient-2 ********");
	 c2.display();
	
	 
   }

}