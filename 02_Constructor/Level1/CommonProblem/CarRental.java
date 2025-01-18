import java.util.Scanner;

public class CarRental {

 private String customerName;
 private String carModel;
 private int rentalDays;
   
   
   
	
  // parmeterized 
  CarRental(String customerName , String carModel , int rentalDays ){
    this.customerName = customerName;
	this.carModel = carModel;
	this.rentalDays = rentalDays;

  }
  
    public void displayDetails(){
	   System.out.println("****************************************");
	   System.out.println("car... Information           ");
	   System.out.println("customerName..  " + customerName);
	   System.out.println("Car Model ..   " + carModel);
	   System.out.println("Day of rent .    " + rentalDays ); 
	   System.out.println("****************************************");
	  
	}
	
	public int calculatecost (int rentalDays){
	 int price = switch(carModel.toLowerCase()){
		 case "ev" -> 5;
		 case "suv" -> 4;
		 case "roadstar" -> 6;
		 default -> 3; // regular coffee
	 };
	 return rentalDays * price;
	  
	}

  public static void main(String args[]){
  
    // car Rantal System 
	 System.out.println("Welcome to the World of CarRantal..");
	 System.out.println("Enter the details ");
	 
	Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the customerName");
	String custormername = scanner.nextLine();
	 System.out.println("Enter the carmodel ");
	String carModel = scanner.nextLine();
	 System.out.println("Enter the number of days ");
	int dayofrent = scanner.nextInt(); 
	
	CarRental c1 = new CarRental(custormername , carModel , dayofrent);
	c1.displayDetails();
	int cost = c1.calculatecost(dayofrent); 
	System.out.println("Total cost is " + cost);
	
  }

}