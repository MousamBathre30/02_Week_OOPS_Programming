import java.util.Scanner;



public class Product {

 private String productName;
 private int price;
 
 public static int totalProduct=0;
 
 public void setProduct(String productName , int price){
	 this.productName = productName;
	 this.price = price;
 }
 
 public void displayProductDetails(){
	 System.out.println("name is..." + productName);
	 System.out.println("price is.." + price);
	 
 }
 
 public static void displayTotalProducts(){
	 totalProduct++;
	 System.out.println(totalProduct);
 }




   public static void main(String args[]){
   
    Scanner scanner = new Scanner(System.in);
	
	// enter the the name of product
	String product = scanner.nextLine();
	int price = scanner.nextInt(); 
	
	Product p = new Product();  
	p.setProduct(product , price);
	p.displayProductDetails();
	displayTotalProducts();
	 product = scanner.nextLine();
	 price = scanner.nextInt(); 
	p.setProduct(product , price);
	p.displayProductDetails();
	displayTotalProducts();
    scanner.close();
   }
}