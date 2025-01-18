import java.util.Scanner;

public class Circle {

 private int radius;
 
   // Default constructor 
    Circle(){
	 radius = 9;
	}
	
	public int getterRadius(){
		return radius;
	}
	
	public void setRadius(int radius){ 
	this.radius = radius;
	}
	  
    public void displayDetails(){
	   System.out.println("****************************************");
	   System.out.println("Welcome to the World of Circle..");
	   System.out.println("circle radius ... Information           ");
	   System.out.println("radius.." + radius);
	   System.out.println("****************************************");
	  
	}

  public static void main(String args[]){
  
    // cafe order System 
	
	
	// Default Constructor 
	// Parameterized constructor 
	// Copy Constructor
	 Circle c1 = new Circle(); // Default Constructor
	 System.out.println("radius:-1");
	 c1.displayDetails();
	 System.out.println("Enter the radius");
	 Scanner scanner = new Scanner(System.in);
	 int radius = scanner.nextInt();
	 c1.setRadius(radius);
	 c1.getterRadius();
	 c1.displayDetails();
	 scanner.close();
  }

}