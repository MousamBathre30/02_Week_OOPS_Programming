public class Book {

 public String title;
 public String author;
 public int price;
   
   
   // Default constructor 
    Book(){
	  title = "Eat that Forg";
	  author = "latto";
	  price = 300;
	  
	}
	
  // parmeterized 
  Book(String title , String author , int price ){
    this.title = title;
	this.author = author;
	this.price = price;

  }
  

	
   
    public void displayDetails(){
	   System.out.println("****************************************");
	   System.out.println("Welcome to the World of Book..");
	   System.out.println("Book... Information           ");
	   System.out.println("Title..Name   " + title);
	   System.out.println("Author name ..   " + author);
	   System.out.println("Price is..    " + price );
	   System.out.println("****************************************");
	  
	}

  public static void main(String args[]){
  
    // cafe order System 
	
	
	// Default Constructor 
	// Parameterized constructor 
	// Copy Constructor
	 Book b1 = new Book(); // Default Constructor 
	 System.out.println("Book:-1");
	 b1.displayDetails();
	 Book b2 = new Book("Alice the game " , "rone" , 200); // Parameterized
	 b2.displayDetails();
	
  }

}