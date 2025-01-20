class BankAccount{
  public static String bankName ;
  final int accountNumber;
  private String accountholderName;
  static int count =0;
  BankAccount(String accountholderName,String bankName , int accountNumber){
	  
	  this.accountholderName = accountholderName;
	  this.bankName = bankName;
	  this.accountNumber = accountNumber;
	  count = getTotalAccounts();
  }
  
  public void display(){
	  
	  System.out.println("Welcome to the bank");
	  System.out.println("Account Holder name " + accountholderName);
	  System.out.println("Account number " + accountNumber);
	  System.out.println("Bank Name is " + bankName);
	  System.out.println("Total account " + count);
  }
  
  public static int getTotalAccounts(){
	  count++;
	  return count;

  }
  
}
class Account extends BankAccount{
	 Account(){
		 BankAccount("Mousam" , "abc" , 1288883);
	 }
	}


public class Bank2 {
	
	public static void main(String args[]){
		  
	BankAccount a1 = new Account();
 	 if(a1 instanceof Account){
		 System.out.println("a1 is an instance of Account");
	 }
	 
	 if(a1 instanceof BankAccount){
		 
		 System.out.println("a1 also an instance of BankAccount");
	 }
    a1.display();
	
	  
	}
}
    
