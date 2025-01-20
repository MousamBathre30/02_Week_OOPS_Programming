class Book{
  public static String libraryName;
  private String author;
  public static final int isbn= 1234;
  public String title;
  Book(String title,String author , String libraryName ){
	  
	  this.title = title;
	  this.author = author;
	  this.libraryName = libraryName;
	  displayLibraryName();
  }
  
  public void display(){
	  
	  System.out.println("Welcome to the library");
	  System.out.println("book /Author Holder name " + author);
	  System.out.println("isbn number " + isbn);
	  System.out.println("library Name is " + libraryName);
	  System.out.println("title name  " + title);
  }
  
  public static void displayLibraryName(){
	  System.out.println("Library name is " + libraryName);

  }
  
}
class Account extends Book{
	 Account(){
		 super("jai-Bhavani" , "Mousam" , "mmmm3");
	 }
	}


public class Library {
	
	public static void main(String args[]){
		  
	Book a1 = new Account();
 	 if(a1 instanceof Account){
		 System.out.println("a1 is an instance of Account");
	 }
	 
	 if(a1 instanceof Book){
		 
		 System.out.println("a1 also an instance of BankAccount");
	 }
    a1.display();
	
	  
	}
}
    
