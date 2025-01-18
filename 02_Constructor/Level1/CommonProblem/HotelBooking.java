
import java.util.Scanner;

public class HotelBooking {

 private String guestName;
 private String roomType;
 private int nights;
  
   
   
   // Default constructor 
    HotelBooking(){
	  guestName = "Mousam";
	  roomType = "luxary";
	  nights = 3;
	}
	
  // parmeterized 
  HotelBooking(String guestName , String roomType , int nights ){
    this.guestName = guestName;
	this.roomType = roomType;
	this.nights = nights;
  }
  
  // Copy constructor 
  
  HotelBooking(HotelBooking order){
     this.guestName = order.guestName;
	 this.roomType = order.roomType;
	 this.nights = order.nights;
  }
  
  // getter and setter 
  
  public int getterNight(){
	  return nights;
  }
  
  public String getterGuestName(){
	  return guestName;
  }
  
  public String getterRoomType(){
	  return roomType;
  }
  
  // setter
  
  public void settValues(String guestName , String roomType , int  nights){
	  
	  this.guestName = guestName;
	  this.roomType = roomType;
	  this.nights = nights; 
  }

   
    public void displayDetails(){
	   System.out.println("****************************************");
	   System.out.println("Welcome to the World of Hotel Booking..");
	   System.out.println("Order... Information           ");
	   System.out.println("Guest..Name   " + guestName);
	   System.out.println("room..Type..   " + roomType);
	   System.out.println("number of..    " + nights );
	   System.out.println("****************************************");
	  
	}

  public static void main(String args[]){
  
    // hotel room order System 

	// Default Constructor 
	// Parameterized constructor 
	// Copy Constructor
	 HotelBooking h1 = new HotelBooking(); // Default Constructor 
	 System.out.println("Order:-1");
	 h1.displayDetails();
	 System.out.println("Order:-2");
	 HotelBooking h2 = new HotelBooking("Alice" , "Delux" , 2); // Parameterized
	 h2.displayDetails();
	 System.out.println("Order:-3");
	 
	 HotelBooking h3 = new HotelBooking(h2); // copy constructor
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the guest name");
	 String name = scanner.nextLine();
	 System.out.println("Enter the room type");
	 String roomType = scanner.nextLine();
	 System.out.println("Enter the how many night");
	 int night = scanner.nextInt(); 
	 h3.settValues(name,roomType,night);
	 h3.getterGuestName();
	 h3.getterRoomType();
	 h3.getterNight();
	 h3.displayDetails();
  }

}