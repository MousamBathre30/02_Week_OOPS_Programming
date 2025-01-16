
public class TrackInventary {
  
   private String itemName;
   private String itemCode;
   private int itemPrice;
   int numberofItem = 5;
   // Constructor
   TrackInventary(String itemName , String itemCode , int itemPrice){
	   this.itemName = itemName;
	   this.itemCode = itemCode ;
	   this.itemPrice = itemPrice ;
   }
   
   // Method to display book details 
   
   public void display(){
	   System.out.println("itemName is  - " + itemName);
	   System.out.println("itemCode is : - " + itemCode);
	   System.out.println("itemPrice.. ($)" + itemPrice); 
	   System.out.println("Total cost of item " + itemName + "Whose code is " + itemCode + "  and numnber is 5 .." + getprice(itemPrice , numberofItem));
	   
   }
   
   public int getprice(int price , int n){
	   return price*n;
   }
   

   public static void main(String args[]){
     // enter the employee manage App.
	 TrackInventary t1 = new TrackInventary("Biskit" , "PARLE-001" , 1);
	 TrackInventary t2 = new TrackInventary("Cookie" , "COO-001" , 2);
	 
	 
	 // Print the layout 
	 
	 System.out.println("***************");
	 System.out.println("Enter the inventary App");
	 System.out.println("******* book-1 ********");
	 t1.display();
	 System.out.println("******* book-2 ********");
	 t2.display();
	 
	 
   }

}