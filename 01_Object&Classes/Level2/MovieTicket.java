import java.util.Scanner;
public class MovieTicket {
  
   private String movieName;
   private int setNumber;
   private int price;
   
   // Constructor
   MovieTicket(String movieName , int setNumber , int price){
	   this.movieName = movieName;
	   this.setNumber = setNumber ;
	   this.price = price ;
   }
   
   // Method to display book details 
   
   public void display(){
	   System.out.println("Movie is  - " + movieName);
	   System.out.println("setNumber is : - " + setNumber);
	   System.out.println("price.. ($)" + price); 
	   
   }
   
   public void book(){
	   System.out.println("Book your set ");
	   setNumber = randomeSet();
	   price++;
	   System.out.println("Your Seat is " + setNumber);
   }
   
   public static int randomeSet(){
	   
	   return (int)( Math.random() * (6));
   }


   public static void main(String args[]){
     // enter the employee manage App.
	 MovieTicket m1 = new MovieTicket("RA-One" , 00 , 90);
	 MovieTicket m2 = new MovieTicket("G-One" , 00 , 78);
	 
	 
	 // Print the layout 
	 
	 System.out.println("***************");
	 System.out.println("Enter the MovieTicket App");
     System.out.println("Which Movie Do you want to see");
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter 1-> Ra-One and Enter 2 -> G-One");	 
	 int input = scanner.nextInt();
	 if( input == 1){
		System.out.println("******* Movie-1 ********");
		 m1.book();
		System.out.println("Do you want to Full Details of ticket");
        System.out.println("PRess 1 For YEs and 2 For No");
         int inpu = scanner.nextInt();
         if(input == 1){
			 m1.display();
		 }else{
			 System.out.println("Okay...");
			 
		 }		 
	 } else{
		 System.out.println("******* Movie-2 ********");
		 m2.book();
		System.out.println("Do you want to Full Details of ticket");
        System.out.println("PRess 1 For YEs and 2 For No");
         int inpu = scanner.nextInt();
         if(input == 1){
			 m2.display();
		 }else{
			 System.out.println("Okay...");
			
		 }		 
	 } 
	 
   }

}