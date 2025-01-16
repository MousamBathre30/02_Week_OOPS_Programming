
import java.util.Scanner;
public class AreaOftrangle{

   private int radius;
   
    AreaOftrangle(int radius){
	  this.radius = radius;
	}
    public void getarea(){
	   double pi = 3.14;
	   System.out.println("Area of Circle.." + pi* radius * radius);
	}
	public void getcircumfarnce(){
	  double pi = 3.14;
	  System.out.println("Area of CircumFerance.." + 2 * pi * radius);
	}
	
   public static void main(String args[]){
     Scanner scanner = new Scanner(System.in);
	 int radius = scanner.nextInt();
     AreaOftrangle ar = new AreaOftrangle(radius);
	ar.getarea();
	ar.getcircumfarnce();
   }
 }
