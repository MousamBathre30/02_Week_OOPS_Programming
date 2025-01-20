
public class CartSystem {
  
   public static int discount = 90;
   
   public String  productName;
   public int price;
   public int quentity;
   public  final int productID;
   
   public  static void updateDiscount(){
	   discount =- 1;
   }
  
  
   public int getprice(int price){
	   int val = price - discount;
	   updateDiscount();
	   return val;
   }
   // Constructor
   CartSystem(String productName , int price , int quentity , int productID ){
	   this.productName = productName;
	   this.price = price ;
	   this.quentity = quentity ;
	   this.productID = productID;
   }
   
   // Method to display employee details 
   
   public void display(){
	   System.out.println("product name is " + productName);
	   System.out.println("price - " + price);
	   System.out.println("updated price after discount  " + getprice(price) );
	   System.out.println("product id : - " + productID);
	   System.out.println("quentity.." + quentity);
	   
	   
   }

   public static void main(String args[]){
     // enter the employee manage App.
	 CartSystem c1 = new CartSystem("apple" , 90000 , 3 , 01);
	 CartSystem c2 = new CartSystem("banana" , 90000 , 4 , 02);
	 
	 
	 
	 if(c1 instanceof CartSystem){
		 System.out.println("Given object is instance of CartSystem");
	 }
	 // Print the layout 
	 
	 System.out.println("***************");
	 System.out.println("Enter the cart App");
	 System.out.println("******* product-1 ********");
	 c1.display();
	 System.out.println("******* product-2 ********");
	 c2.display();
	
	 
   }

}