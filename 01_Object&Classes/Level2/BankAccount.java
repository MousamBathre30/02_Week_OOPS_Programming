import java.util.Scanner;
public class BankAccount {
  
   private String accountHolder;
   private String accountNumber;
   private int currentbalance;
   
   // Constructor
   BankAccount(String accountHolder , String accountNumber , int currentbalance){
	   this.accountHolder = accountHolder;
	   this.accountNumber = accountNumber ;
	   this.currentbalance = currentbalance ;
   }
   
   // Method to display book details 
   
   public void display(){
	   System.out.println("name is  - " + accountHolder);
	   System.out.println("accountNumber is : - " + accountNumber);
	   System.out.println("currentbalance.. ($)" + currentbalance); 
   }
   
   
   public void depositing(int money){
	  System.out.println("the deposite money is " + money);
	  System.out.println("Balance after the transaction.." + (currentbalance + money) );
      
   }
   public void widrawMoney(int money){
	  if(money > currentbalance){System.out.println("You can not widrow.. InSufficiant funds");}
	  System.out.println("Balance after the transac.." + (currentbalance - money ));

   }

  


   public static void main(String args[]){
     // enter the employee manage App.
	 BankAccount b1 = new BankAccount("Mousam" , "0191AL211090" , 90);
	 BankAccount b2 = new BankAccount("Salu " , "0191AL211062" , 78);
	 
	 Scanner scanner = new Scanner(System.in);
	 // Print the layout 
	 
	 System.out.println("***************");
	 System.out.println("Enter the bank App");
	 System.out.println("******* accountHolder-1 ********");
	 b1.display();
	 System.out.println("depositing money..  ");
	 int money = scanner.nextInt();
	 b1.depositing(money);
	 System.out.println("enter the widrow amount");
	 int money2 = scanner.nextInt();
	 b1.widrawMoney(money2);
	  
     System.out.println("******* accountHolder-2 ********");
	 b2.display();
	 System.out.println("depositing money..  ");
	 int money11 = scanner.nextInt();
	 b2.depositing(money11);
	 System.out.println("enter the widrow amount");
	 int money22 = scanner.nextInt();
	 b2.widrawMoney(money22);	  
	
	 
	
	 
   }

}