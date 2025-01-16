import java.util.Arrays;
import java.util.Scanner;
public class CartItem {
  
   private String itemname [];
   private int price [];
   private int quantity [];
   
   // Constructor
   CartItem(String itemname [], int price [] , int quantity [] ){
	   this.itemname = itemname;
	   this.price = price ;
	   this.quantity = quantity ;
   }
   
   // Method to display book details 
   
   public void display(){
	  for(int i=0; i < itemname.length; i++){
		   System.out.print(itemname[i] + " ");
		  
	  }
	  System.out.println();
	  for(int i=0; i<price.length; i++){
		  System.out.print(price[i] + " ");
	  }
	    System.out.println();
	  for(int i = 0; i<quantity.length; i++){
		  System.out.print(quantity[i] + " ");
	  }
   }
   
   public void additeam(String iteam){
	  
	   itemname = addToArray(itemname , iteam);
	   System.out.println("Update.. iteams ");

       for(int i=0; i<itemname.length; i++){
		   System.out.print(itemname[i] + "-");
	   }	   
   }
     public void delition(String iteam){
	  
	   itemname = removeFromArray(itemname , iteam);
	   System.out.println("Update.. iteams ");

      for(int i=0; i<itemname.length; i++){
		  System.out.println(itemname[i] + " ");
	  }	   
   }
   
      public void cost() {
        int totalCost = 0;
        for (int i = 0; i < price.length; i++) {
            totalCost += price[i] * quantity[i];
        }
        System.out.println("Total cost of items in the cart: $" + totalCost);
    }
	
	public static String[] addToArray(String[] array, String newItem) {
    String[] newArray = Arrays.copyOf(array, array.length + 1);
    newArray[array.length] = newItem;
    return newArray;
}

public static String[] removeFromArray(String[] array, String removeItem) {
    return Arrays.stream(array)
                 .filter(item -> !item.equals(removeItem))
                 .toArray(String[]::new);
}

 


   public static void main(String args[]){
     // enter the employee manage App.
	 String item [] = {"phone" , "Car" , "carger"};
	 int price [] = {200 , 222, 333};
	 int quantity [] = {1,2,3};
	 CartItem c1 = new CartItem(item , price , quantity);
	 
	 
	 // Print the layout 
	 
	 System.out.println("***************");
	 System.out.println("Enter the cart App");
	 System.out.println("******* item-s ********");
	 c1.display();
	 System.out.println("Enter the iteam ");
	 Scanner scanner = new Scanner(System.in);
	 String iteam = scanner.nextLine();
	 c1.additeam(iteam);
	 System.out.println("Enter the iteam ");
	 String itea = scanner.nextLine();
	 c1.delition(itea);
	 c1.cost();
	 
	 scanner.close();
   }

}